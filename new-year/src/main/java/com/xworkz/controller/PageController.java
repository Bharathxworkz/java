package com.xworkz.controller;

import com.xworkz.constant.ServiceConstant;
import com.xworkz.dto.NyearDto;
import com.xworkz.entity.NyearEntity;
import com.xworkz.service.NyearService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/")
public class PageController {
    @Autowired
    NyearService nyearService;

    @GetMapping("Registration")
    public String getpages() {
        return "Registration";
    }

    @GetMapping("signin")
    public String getpage() {
        return "signin";
    }

    @GetMapping("forgetpassword")
    public String forgotpasswordpage() {
        return "forgetpassword";
    }
    @GetMapping("test")
    public String mainpage() {
        return "test";
    }
    @GetMapping("response")
    public String reponsepage() {
        return "response";
    }

    @GetMapping("update")
    public String getUpdate(@RequestParam Integer id, Model model, HttpSession httpSession){
    NyearDto nyearDto =nyearService.getById(id);
    httpSession.setAttribute("newyear",nyearDto);
    log.info("Dto is {} " ,nyearDto);
    model.addAttribute("dto",nyearDto);

        return "update";
    }
    @PostMapping("updated")
  public String upadatingdata(NyearDto nyearDto, Model model,HttpSession session, HttpServletRequest request, @RequestParam("file")MultipartFile multipartFile){
        log.info("{}",nyearDto);
        log.info("FileNmae {}",multipartFile.getOriginalFilename());
        NyearDto sessionDto  = (NyearDto) request.getSession().getAttribute("newyear");
    NyearDto nyearDto1 = nyearService.updatedatata(nyearDto,sessionDto, multipartFile);
        session.setAttribute("dto",nyearDto1);
       model.addAttribute("dto",nyearDto1);
        model.addAttribute("update","updated succesfully");
        return "update";

        }
        @GetMapping("view/{imageName}")
    public void getImage(@PathVariable String imageName,HttpServletResponse response)throws IOException {
            Path path = Paths.get(ServiceConstant.FIlE_PATH.getPath()+imageName);
            log.info("{}",path);
            Files.copy(path,response.getOutputStream());
            response.getOutputStream().flush();
        }

    @GetMapping("viewprofile")
    public String getAllUser(){
        return "viewprofile";
    }

  }



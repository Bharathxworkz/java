package com.xworkz.app.controller;

import com.xworkz.app.dto.ProductDto;
import com.xworkz.app.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {

    @Autowired
    Productservice productservice;

    @RequestMapping("user")
    public String onSave(ProductDto productDto, Model model){
        model.addAttribute("name",productDto.getProductName());
        productservice.save(productDto);
        return  "response.jsp";
    }

    @GetMapping("getAllProducts")
    public  String getAllUsers(Model model){
        List<ProductDto> users= productservice.getAllProducts();
        model.addAttribute("listOfUsers",users);
        return  "getAllProducts.jsp";
    }
    @GetMapping("delete")
    public RedirectView delete(int id, Model model, HttpServletRequest  req){

        productservice.deleteProductById(id);
        RedirectView redirectView=new RedirectView();
        redirectView.setUrl(req.getContextPath()+"/getAllProducts");
        return redirectView;
    }
    @GetMapping(value = "fetchUser")
    public String fetchUser(int id , Model model){
        ProductDto productDto =productservice.getProductById(id);
        model.addAttribute("user" , productDto);
        return "fetchProduct.jsp";
    }

    @PostMapping(value = "updateProduct")
    public String updateUser(ProductDto productDto , Model model){
        productservice.updateProduct(productDto);
        model.addAttribute("updateInfo" , "Updated SuccessFully");
        return "fetchProduct.jsp";
    }

}

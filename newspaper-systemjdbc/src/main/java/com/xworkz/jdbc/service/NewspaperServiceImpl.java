package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dao.Newspaperdao;
import com.xworkz.jdbc.dao.NewspaperdaoImpl;
import com.xworkz.jdbc.dto.Newspaperdto;
import com.xworkz.jdbc.exception.DataNotFoundException;

public class NewspaperServiceImpl implements NewspaperService {
    @Override
    public void getAllNewspapers() {
        Newspaperdao newspaperDao = new NewspaperdaoImpl();
        newspaperDao.getAllNewspaper(); // Make sure to print the newspapers in the DAO method
    }

    @Override
    public String getPaperNameById(int id) throws DataNotFoundException {
        Newspaperdao newspaperDao = new NewspaperdaoImpl();
        return newspaperDao.getPaperNameById(id);
    }


    @Override
    public Newspaperdto getNewsPaperByDate(String date) {
        Newspaperdao newspaperDao = new NewspaperdaoImpl();
        return newspaperDao.getNewsPaperByDate(date);
    }

    @Override
    public Newspaperdto getNewsPaperByLang(String lang) {
        Newspaperdao newspaperDao = new NewspaperdaoImpl();
        return newspaperDao.getNewsPaperByLang(lang);
    }

    @Override
    public Newspaperdto getNewsPaperById(int id) {
        Newspaperdao newspaperDao = new NewspaperdaoImpl();
        return newspaperDao.getNewsPaperById(id);
    }

    @Override
    public int getPaperNoOfPagesByLanguage(String lang) {
        Newspaperdao newspaperDao = new NewspaperdaoImpl();
        return newspaperDao.getPaperNofPagesByLanguage(lang);
    }

    @Override
    public int getNoOfArticlesById(int id) {
        Newspaperdao newspaperDao = new NewspaperdaoImpl();
        return newspaperDao.getNoOfArticlesById(id);
    }

    @Override
    public String getDateById(int id) {
        Newspaperdao newspaperDao = new NewspaperdaoImpl();
        return newspaperDao.getDateById(id);
    }

    @Override
    public void updateNoOfArticlesByDate(String date, int newArticleCount) {
        Newspaperdao newspaperDao = new NewspaperdaoImpl();
        newspaperDao.updateNoOfArticlesByDate(date, newArticleCount);
    }

    @Override
    public void deleteNewsPaperById(int id) {
        Newspaperdao newspaperDao = new NewspaperdaoImpl();
        newspaperDao.deleteNewsPaperById(id);
    }

    @Override
    public String getPaperNameByLang(String lang) {
        Newspaperdao newspaperDao = new NewspaperdaoImpl();
        return newspaperDao.getPaperNameByLang(lang);
    }

}

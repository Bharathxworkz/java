package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.Newspaperdto;

public interface NewspaperService {

    void getAllNewspapers();

    String getPaperNameById(int id);

    Newspaperdto getNewsPaperByDate(String date);

    Newspaperdto getNewsPaperByLang(String lang);

    Newspaperdto getNewsPaperById(int id);

    int getPaperNoOfPagesByLanguage(String lang);

    int getNoOfArticlesById(int id);

    String getDateById(int id);

    void updateNoOfArticlesByDate(String date, int newArticleCount);

    void deleteNewsPaperById(int id);

    String getPaperNameByLang(String lang);
}

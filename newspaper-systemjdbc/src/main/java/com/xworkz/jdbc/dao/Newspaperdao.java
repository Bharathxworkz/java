package com.xworkz.jdbc.dao;

import com.xworkz.jdbc.dto.Newspaperdto; // Assuming you have a Newspaper DTO class

public interface Newspaperdao {
    void getAllNewspaper();

    Newspaperdto getNewsPaperByDate(String date);

    Newspaperdto getNewsPaperByLang(String lang);

    Newspaperdto getNewsPaperById(int id);

    int getPaperNofPagesByLanguage(String lang);

    int getNoOfArticlesById(int id);

    String getDateById(int id);

    void updateNoOfArticlesByDate(String date, int newArticleCount);

    void deleteNewsPaperById(int id);

    String getPaperNameByLang(String lang);

    String getPaperNameById(int id);
}

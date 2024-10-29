package com.xworkz.jdbc;

import com.xworkz.jdbc.exception.NameNotFoundException;
import com.xworkz.jdbc.service.NewspaperService;
import com.xworkz.jdbc.service.NewspaperServiceImpl;
import com.xworkz.jdbc.dto.Newspaperdto;

public class NewspaperRunner {
    public static void main(String[] args) {
        NewspaperService newspaperService = new NewspaperServiceImpl();

        System.out.println("All Newspapers:");
        newspaperService.getAllNewspapers();



    System.out.println("\nPaper Name by ID (1):");
    String paperNameById = newspaperService.getPaperNameById(1);
    System.out.println("Paper Name: " + paperNameById);

        System.out.println("\nNewspaper by Date ('2024-10-17'):");
        Newspaperdto newspaperByDate = newspaperService.getNewsPaperByDate("2024-10-17");
        System.out.println(newspaperByDate);

        System.out.println("\nNewspaper by Language ('English'):");
        Newspaperdto newspaperByLang = newspaperService.getNewsPaperByLang("English");
        System.out.println(newspaperByLang);

        System.out.println("\nNewspaper by ID (1):");
        Newspaperdto newspaperById = newspaperService.getNewsPaperById(1);
        System.out.println(newspaperById);

        System.out.println("\nNumber of Pages by Language ('English'):");
        int pagesByLang = newspaperService.getPaperNoOfPagesByLanguage("English");
        System.out.println("Number of Pages: " + pagesByLang);

        System.out.println("\nNumber of Articles by ID (1):");
        int articlesById = newspaperService.getNoOfArticlesById(1);
        System.out.println("Number of Articles: " + articlesById);

        System.out.println("\nDate by ID (1):");
        String dateById = newspaperService.getDateById(1);
        System.out.println("Date: " + dateById);

        System.out.println("\nUpdating Number of Articles by Date ('2024-10-01'):");
        newspaperService.updateNoOfArticlesByDate("2024-10-01", 10);
        System.out.println("Articles updated.");

       System.out.println("\nDeleting Newspaper by ID (1):");
        newspaperService.deleteNewsPaperById(1);
        System.out.println("Newspaper deleted.");

        System.out.println("\nPaper Name by Language ('English'):");
        String paperNameByLang = newspaperService.getPaperNameByLang("English");
        System.out.println("Paper Name: " + paperNameByLang);
    }
}


package com.xworkz.productapp.util;

import com.xworkz.productapp.dto.ProductDto;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

   private static SessionFactory factory =null;
   public static SessionFactory getSessionFactory(){
       return factory;
   }
   static {
      Configuration configuration = new Configuration();
      configuration.configure();
      configuration.addAnnotatedClass(ProductDto.class);
      factory = configuration.buildSessionFactory();

   }
   public static void closeSessionFactory() {
      if (factory != null && !factory.isClosed()) {
         factory.close();
         System.out.println("SessionFactory closed");
      }
   }
}

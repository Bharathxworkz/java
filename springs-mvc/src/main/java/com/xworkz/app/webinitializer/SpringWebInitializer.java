package com.xworkz.app.webinitializer;

import com.xworkz.app.config.SpringConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {



    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("RootConfigClasses Registered");
        return new Class[0];

    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("ServletConfigClasses started");
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("ServletMappings");
        return new String[]{"/"};
    }
}

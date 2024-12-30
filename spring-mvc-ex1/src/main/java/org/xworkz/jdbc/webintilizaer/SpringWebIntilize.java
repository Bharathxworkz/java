package org.xworkz.jdbc.webintilizaer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.xworkz.jdbc.config.SpringConfiguration;

public class SpringWebIntilize  extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("RootConfigClasses Registerd");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("ServletConfigClass Started");
        return new Class[]{
            SpringConfiguration.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("ServletMapping");
        return new String[]{"/"};
    }
}

package org.xworkz.jdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.util.Properties;
@Configuration
@ComponentScan(basePackages = " org.xworkz.jdbc")

public class SpringConfiguration {
    public SpringConfiguration(){

    }
    @Bean
    public LocalContainerEntityManagerFactoryBean getLocalContainerEntityManagerFactoryBean(){
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setPackagesToScan(" org.xworkz.jdbc.dto");
        bean.setDataSource(getDataSource());
        bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        bean.setJpaProperties(getproperties());
        return bean;
    }
    @Bean
    private DataSource getDataSource() {
        DriverManagerDataSource dataSourece = new DriverManagerDataSource();
        dataSourece.setUrl("jdbc:mysql://localhost:3306/your");
        dataSourece.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSourece.setPassword("9019633098");
        dataSourece.setUsername("root");
        return dataSourece;
    }
    @Bean
    private Properties getproperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.show_sql", "true");
        return properties;
    }
}

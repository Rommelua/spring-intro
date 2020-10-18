package com.spring.intro.config;

import com.spring.intro.model.User;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages = {"com.spring.intro"})
public class AppConfig {
    @Bean
    public SessionFactory getSessionFactory() {
        return new org.hibernate.cfg.Configuration().configure()
                .buildSessionFactory();
    }

//    @Bean
//    public DataSource getDataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/spring_intro");
//        dataSource.setUsername("root");
//        dataSource.setPassword("1111");
//        return dataSource;
//    }
//
//    @Bean
//    public LocalSessionFactoryBean getSessionFactory() {
//        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
//        factoryBean.setDataSource(getDataSource());
//        Properties properties = new Properties();
//        properties.put("hibernate.show_sql", "true");
//        properties.put("hibernate.format_sql", "true");
//        properties.put("hibernate.hbm2ddl.auto", "create-drop");
//        factoryBean.setHibernateProperties(properties);
//        factoryBean.setAnnotatedClasses(User.class);
//        return factoryBean;
//    }
}

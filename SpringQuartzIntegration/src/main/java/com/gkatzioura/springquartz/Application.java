package com.gkatzioura.springquartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by gkatzioura on 6/6/16.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication();
        ApplicationContext ctx = springApplication.run(Application.class,args);
    }
}

package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lenovo on 24/11/2019.
 */
@SpringBootApplication
@MapperScan("com.test.*.mapper") // scan class, mainly hibernate mapper
public class App {
    public static void main(String[] args){
        //SpringBootApplicatoin.run(App.class,args);
        SpringApplication.run(App.class, args);
    }
}

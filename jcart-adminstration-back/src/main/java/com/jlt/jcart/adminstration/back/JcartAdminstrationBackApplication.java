package com.jlt.jcart.adminstration.back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jlt.jcart.adminstration.back.dao")
public class JcartAdminstrationBackApplication {
    public static void main(String[] args) {

        SpringApplication.run(JcartAdminstrationBackApplication.class,args);

    }

}

package com.clinicaseprice.seprice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})  con esto no busca la base de datos
@SpringBootApplication
public class SepriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SepriceApplication.class, args);
        
        System.out.println("Proyecto: Clínica SePrice");
        System.out.println("Servidor ejecutándose en: http://localhost:8080");
    }
}

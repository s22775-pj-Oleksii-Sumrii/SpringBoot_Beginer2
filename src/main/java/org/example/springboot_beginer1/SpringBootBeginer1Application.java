package org.example.springboot_beginer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
//@EnableSwagger2
public class SpringBootBeginer1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBeginer1Application.class, args);}

//    @Bean
//    public Docket get() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .paths(PathSelectors.ant("/api/**"))
//                .apis(RequestHandlerSelectors.basePackage("pl.sumrii.springbootswaggerexample"))
//                .build().apiInfo(createApiInfo());
//    }
//
//    private ApiInfo createApiInfo() {
//        return new ApiInfo("Cars API",
//                "Cars database",
//                "1.00",
//                "http://sumrii.pl",
//                new Contact("Alex", "http://sumrii.pl", "alex.sumriy@sumrii.pl"),
//                "my own licence",
//                "http://sumrii.pl",
//                Collections.emptyList()
//        );
//    }
}

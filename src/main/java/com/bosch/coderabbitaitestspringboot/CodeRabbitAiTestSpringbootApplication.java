package com.bosch.coderabbitaitestspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodeRabbitAiTestSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeRabbitAiTestSpringbootApplication.class, args);
    }

    @GetMapping()
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}

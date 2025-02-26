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
        double[][] data = new double[0][];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > 0) {
                    // Doing the same operation repeatedly
                    int processedValue = (int) (data[i][j] * 2);
                    System.out.println(processedValue);
                    System.out.println(processedValue);
                }
            }
        }
        return "Hello World";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}

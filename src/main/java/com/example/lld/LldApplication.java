package com.example.lld;

import com.example.lld.lld1.concurrency.one_helloWorld.HelloWorldPrinter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LldApplication {

    public static void main(String[] args) {
        SpringApplication.run(LldApplication.class, args);
    }
    HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

}

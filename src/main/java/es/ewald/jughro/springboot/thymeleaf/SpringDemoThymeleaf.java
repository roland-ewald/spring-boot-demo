/*
 * (c) Copyright 2015, Limbus GmbH
 * All rights reserved. 
 */
package es.ewald.jughro.springboot.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@SpringBootApplication
@Controller
public class SpringDemoThymeleaf {

  @RequestMapping("/")
  public String testEndpoint(@RequestParam Optional<String> testParam) {
    return "template";
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringDemoThymeleaf.class, args);
  }
}
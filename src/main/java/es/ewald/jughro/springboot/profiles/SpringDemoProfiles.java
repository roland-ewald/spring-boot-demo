/*
 * (c) Copyright 2015, Limbus GmbH
 * All rights reserved. 
 */
package es.ewald.jughro.springboot.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@SpringBootApplication
@RestController
public class SpringDemoProfiles {

  @Autowired
  List<MyComponent> components;

  @RequestMapping("/")
  public List<String> testEndpoint() {
    return components.stream().map(MyComponent::sayHello).collect(toList());
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringDemoProfiles.class, args);
  }
}

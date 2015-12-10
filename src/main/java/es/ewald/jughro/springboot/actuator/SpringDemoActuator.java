package es.ewald.jughro.springboot.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController
public class SpringDemoActuator {

  @RequestMapping("/")
  public String testEndpoint(@RequestParam Optional<String> testParam) {
    return "Hello World!";
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringDemoActuator.class, args);
  }
}
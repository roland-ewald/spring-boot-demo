package es.ewald.jughro.springboot.minimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SuppressWarnings("SpringFacetCodeInspection")
@SpringBootApplication
@RestController
public class SpringDemoMinimal {

  @RequestMapping("/")
  public String testEndpoint(@RequestParam Optional<String> testParam) {
    return "Hello World!";
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringDemoMinimal.class, args);
  }
}

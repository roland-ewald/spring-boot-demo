package es.ewald.jughro.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static java.util.Arrays.*;

@SpringBootApplication
@RestController
//@EnableAutoConfiguration(exclude={WebMvcAutoConfiguration.class})
public class SpringDemoRest {

  @Value("${demo.test.parameter:testValue}")
  private String myTestParameter;

  @Value("${demo.test.mandatory.parameter}")
  private String myImportantParameter;

  @Autowired
  private MyCustomProperties properties;

  @RequestMapping("/test")
  public List<String> testEndpoint(@RequestParam Optional<String> testParam) {
    return asList("test" + testParam.orElse("-"), "test2", "test3", myTestParameter, myImportantParameter,
        properties.getString(), properties.getInteger().toString());
  }

  public static void main(String[] args) {
        SpringApplication.run(SpringDemoRest.class, args);
    }
}

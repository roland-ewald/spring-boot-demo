package es.ewald.jughro.springboot.rest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my.property")
public class MyCustomProperties {

  private String string;

  private Integer integer;

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public Integer getInteger() {
    return integer;
  }

  public void setInteger(Integer integer) {
    this.integer = integer;
  }
}

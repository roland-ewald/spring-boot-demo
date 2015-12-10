/*
 * (c) Copyright 2015, Limbus GmbH
 * All rights reserved. 
 */
package es.ewald.jughro.springboot.profiles.subpackage;

import es.ewald.jughro.springboot.profiles.MyComponent;
import org.springframework.stereotype.Component;

@Component
public class DefaultComponent implements MyComponent {
  @Override
  public String sayHello() {
    return "I'm always here";
  }
}

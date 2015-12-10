/*
 * (c) Copyright 2015, Limbus GmbH
 * All rights reserved. 
 */
package es.ewald.jughro.springboot.profiles.subpackage;

import es.ewald.jughro.springboot.profiles.MyComponent;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("demo") //<- Besser String-Konstante & zentrale Profil-Config
public class DemoComponent implements MyComponent{
  @Override
  public String sayHello() {
    return "I'm just here for the demo";
  }
}

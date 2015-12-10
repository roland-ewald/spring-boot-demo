package es.ewald.jughro.springboot.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CustomHealthTest implements HealthIndicator {

  @Override
  public Health health() {
    int errorCode = Math.round(new Random().nextFloat()); // I'm feeling lucky...
    if (errorCode != 0) {
      return Health.down().withDetail("Error Code", errorCode).build();
    }
    return Health.up().build();
  }

}

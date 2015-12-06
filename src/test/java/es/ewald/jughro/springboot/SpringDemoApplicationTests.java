package es.ewald.jughro.springboot;

import es.ewald.jughro.springboot.rest.SpringDemoRest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringDemoRest.class)
@WebAppConfiguration
public class SpringDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}

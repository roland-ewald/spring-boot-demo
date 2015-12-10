/*
 * (c) Copyright 2015, Limbus GmbH
 * All rights reserved. 
 */
package es.ewald.jughro.springboot.profiles;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringDemoProfiles.class)
@WebIntegrationTest("server.port=0")
@ActiveProfiles({ "demo", "production" })
public class SpringDemoProfilesTest {

  @Autowired
  private WebApplicationContext wac;

  private MockMvc mockApp;

  @Autowired
  List<MyComponent> myComponentList;

  @Before
  public void setUp() {
    this.mockApp = MockMvcBuilders.webAppContextSetup(this.wac).build();
  }

  @Test
  public void testWithMockMvc() throws Exception {
    MvcResult result = mockApp.perform(get("/")).andExpect(status().isOk()).andReturn();
    assertEquals(3, myComponentList.size());
    for (MyComponent myComponent : myComponentList) {
      assertTrue(result.getResponse().getContentAsString().contains(myComponent.sayHello()));
    }
  }

}

package es.ewald.jughro.springboot.rest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringDemoRest.class)
@WebIntegrationTest("server.port=0")
public class SpringDemoRestTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockApp;

	@Before
	public void setUp() {
		this.mockApp = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void testWithMockMvc() throws Exception {
		MvcResult result = mockApp.perform(get("/test")).andExpect(status().isOk()).andReturn();
		assertTrue(result.getResponse().getContentAsString().contains("test2"));
	}
}

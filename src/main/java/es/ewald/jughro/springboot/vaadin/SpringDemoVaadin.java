/*
 * (c) Copyright 2015, Limbus GmbH
 * All rights reserved.
 */
package es.ewald.jughro.springboot.vaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

/**
 * From the Vaadin docs.
 */
@SpringBootApplication
@Theme("valo")
@SpringUI
public class SpringDemoVaadin extends UI {

  @Autowired
  private Greeter greeter;

  @Override
  protected void init(VaadinRequest request) {
    List<TestBean> testBeanList = Arrays.asList(new TestBean("Abc", "Bdef"), new TestBean("C", greeter.sayHello()));
    Grid grid = new Grid();
    grid.setContainerDataSource(new BeanItemContainer<>(TestBean.class, testBeanList));
    setContent(grid);
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringDemoVaadin.class, args);
  }
}
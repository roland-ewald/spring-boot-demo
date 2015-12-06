/*
 * (c) Copyright 2015, Limbus GmbH
 * All rights reserved.
 */
package es.ewald.jughro.springboot.vaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import static java.util.Arrays.*;

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
    List<TestBean> testBeanList = asList(new TestBean("Test", "Property"), new TestBean("C", "D"));
    Grid grid = new Grid();
    grid.setContainerDataSource(new BeanItemContainer<>(TestBean.class, testBeanList));
    VerticalLayout layout = new VerticalLayout();
    layout.addComponents(grid, new Button(greeter.sayHello()));
    setContent(layout);
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringDemoVaadin.class, args);
  }
}
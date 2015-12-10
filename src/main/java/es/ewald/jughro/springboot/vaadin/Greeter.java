package es.ewald.jughro.springboot.vaadin;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;

/**
 * From the Vaadin docs (https://vaadin.com/wiki?p_p_id=36&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=row-1&p_p_col_pos=1&p_p_col_count=3&_36_struts_action=%2Fwiki%2Fview&p_r_p_185834411_nodeName=vaadin.com+wiki&p_r_p_185834411_title=II+-+Injection+and+Scopes+with+Vaadin+Spring):
 *
 * Spring has an annotation @Component for classes that are candidates for auto-detection during classpath scanning, and Vaadin has an interface called Component for UI components. You cannot import the two in the same file, so to avoid the necessity to fully qualify one of these, Vaadin Spring provides an alias @SpringComponent for org.springframework.stereotype.Component.
 */
@SpringComponent
@UIScope
public class Greeter {

  public String sayHello() {
    return "Hello from Spring bean";
  }

}
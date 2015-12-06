package es.ewald.jughro.springboot.vaadin;

public class TestBean {

  private String a;

  private String b;

  public TestBean() {
  }

  public TestBean(String a, String b) {
    this.a = a;
    this.b = b;
  }

  public String getA() {
    return a;
  }

  public String getB() {
    return b;
  }

  public void setA(String a) {
    this.a = a;
  }

  public void setB(String b) {
    this.b = b;
  }
}

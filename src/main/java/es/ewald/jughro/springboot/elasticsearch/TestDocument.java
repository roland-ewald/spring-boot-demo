package es.ewald.jughro.springboot.elasticsearch;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "test")
public class TestDocument {

  @Id
  private String testName;

  public TestDocument() {
  }

  public TestDocument(String testName) {
    this.testName = testName;
  }

  public String getTestName() {
    return testName;
  }

  public void setTestName(String testName) {
    this.testName = testName;
  }
}

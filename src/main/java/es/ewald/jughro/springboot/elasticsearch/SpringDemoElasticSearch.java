/*
 * (c) Copyright 2015, Limbus GmbH
 * All rights reserved. 
 */
package es.ewald.jughro.springboot.elasticsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController
public class SpringDemoElasticSearch {

  @Autowired
  private TestRepository testRepository;

  @RequestMapping("/")
  public List<TestDocument> testEndpoint(@RequestParam Optional<String> testParam) {
    if (testParam.isPresent()) {
      testRepository.save(new TestDocument(testParam.get()));
    }
    List<TestDocument> docList = new ArrayList<>();
    for (TestDocument document : testRepository.findAll()) {
      docList.add(document);
    }
    return docList;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringDemoElasticSearch.class, args);
  }
}
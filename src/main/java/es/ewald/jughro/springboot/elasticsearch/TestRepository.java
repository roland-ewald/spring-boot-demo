package es.ewald.jughro.springboot.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

public interface TestRepository extends ElasticsearchCrudRepository<TestDocument, String> {

}

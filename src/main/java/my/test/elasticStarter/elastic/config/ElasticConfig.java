package my.test.elasticStarter.elastic.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.client.ClientConfiguration;
//import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
//import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "my.test.elasticStarter.elastic")
public class ElasticConfig {
//
//    @Bean
//    public RestHighLevelClient client() {
//
//        HttpHost host = HttpHost.create("https://digital-es-app-dev.usta.com:443");
//        HttpHost[] hosts = {host};
//        RestClientBuilder builder = RestClient.builder(hosts);
//        RestHighLevelClient client = new RestHighLevelClient(builder);
//        return client;
//    }
//
//
//    @Bean
//    public ElasticsearchOperations elasticsearchTemplate() {
//
//        return new ElasticsearchRestTemplate(client());
//    }
}
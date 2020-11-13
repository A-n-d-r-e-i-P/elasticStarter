package my.test.elasticStarter.elastic.repository;

import my.test.elasticStarter.elastic.entity.Ranklist;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RanklistRepository extends ElasticsearchRepository<Ranklist, String> {
}

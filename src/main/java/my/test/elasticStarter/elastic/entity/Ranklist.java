package my.test.elasticStarter.elastic.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "dex-ranklists-adult-f-y30-singles-standing")
public class Ranklist {

    @Id
    private String id;

//    @Field(type = FieldType.Nested, includeInParent = true)
//    private Object _source;
}

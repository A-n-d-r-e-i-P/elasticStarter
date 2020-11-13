package my.test.elasticStarter.controller;

import my.test.elasticStarter.elastic.repository.RanklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ElasticController {
    @Autowired
    RanklistRepository ranklistRepository;

    @GetMapping("/hello")
    public String hello(){
        ranklistRepository.findAll();
        return "hello";
    }

}

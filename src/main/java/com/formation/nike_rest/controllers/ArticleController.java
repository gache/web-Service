package com.formation.nike_rest.controllers;


import com.formation.nike_rest.models.ArticleEntity;
import com.formation.nike_rest.models.ImageEntity;
import com.formation.nike_rest.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ArticleController {
    private  final ArticleService articleService;

    @Autowired
    public  ArticleController(ArticleService articleService){
        this.articleService =   articleService;
    }

    @GetMapping("/articles")
    public Iterable<ArticleEntity>findAll(){
        return articleService.findAll();
    }

    @GetMapping("/articles/{id}")
    public  ArticleEntity getById(@PathVariable("id") String id) {
        return  new ArticleEntity("Test title","Test description", 120.89f, Arrays.asList(new ImageEntity()));
    }

}

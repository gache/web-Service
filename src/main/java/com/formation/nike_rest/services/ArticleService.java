package com.formation.nike_rest.services;

import com.formation.nike_rest.models.ArticleEntity;
import com.formation.nike_rest.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public  ArticleService(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }

    public Iterable<ArticleEntity>findAll(){
        return articleRepository.findAll();
    }

    public void save(ArticleEntity article){
        articleRepository.save(article);
    }
}

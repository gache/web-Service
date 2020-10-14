package com.formation.nike_rest.repositories;

import com.formation.nike_rest.models.ArticleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository <ArticleEntity, Long> {
}

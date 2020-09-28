import { Component, OnInit } from '@angular/core';
import { ArticleService } from '../services/article.service';
import { Article } from '../models/article';

@Component( {
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
} )
export class ArticleComponent implements OnInit {

  articles: Array<Article>;

  constructor( private articleService: ArticleService ) { }

  ngOnInit (): void {
    this.articleService.findAll().subscribe( articlesResp => {
      this.articles = articlesResp;
      console.log( this.articles );

    } );
  }

}

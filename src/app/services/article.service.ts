import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Article } from '../models/article';

@Injectable( {
  providedIn: 'root'
} )
export class ArticleService {

  private url = 'http://localhost:8080/articles';

  constructor( private http: HttpClient ) { }

  public findAll (): Observable<Array<Article>> {
    return this.http.get<Array<Article>>( this.url );
  }


}


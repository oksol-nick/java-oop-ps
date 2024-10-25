package org.oop.api.dao;

import org.oop.model.Article;
import org.oop.model.Comment;

import java.util.List;

public interface IArticleDao {
    Article createArticle(Article article);
    Article getArticleById(long id);
    List<Article> getArticlesByTitle(String title);
    List<Article> getAllArticles();
    boolean updateArticle(Article article);
    boolean deleteArticle(long id);
    void commentArticle(long authorId, Comment comment);

}
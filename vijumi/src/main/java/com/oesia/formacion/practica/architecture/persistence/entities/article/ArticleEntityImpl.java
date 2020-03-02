package com.oesia.formacion.practica.architecture.persistence.entities.article;

import com.oesia.formacion.practica.architecture.domain.model.Article;
import com.oesia.formacion.practica.architecture.domain.model.Size;
import com.oesia.formacion.practica.architecture.persistence.daos.article.ArticleDao;
import com.oesia.formacion.practica.architecture.persistence.entities.AbstractEntity;

public class ArticleEntityImpl extends AbstractEntity<Article> implements ArticleEntity {

	private final ArticleDao articleDao;

	public ArticleEntityImpl(ArticleDao articleDao) {
		super(articleDao);
		this.articleDao = articleDao;
	}

	@Override
	public Size findSizeById(Integer sizeId) {
		return articleDao.findSizeById(sizeId);
	}

	@Override
	public void update(Article article) {
		articleDao.update(article);
	}
	
	public void create(Article article) {
		articleDao.create(article);
	}
}

package hnkjs.service;

import java.util.List;

import hnkjs.entities.Article;
import hnkjs.entities.PageBean;

public interface IArticleServer extends IBaseServer<Article>{
   
	/**
	 * 根据文章ID 获取该类型的文章列表
	 * @param typeId 类型id
	 * @return
	 */
	public List<Article> queryArticleByType(PageBean<Article> pageBean,int typeId,int state);
	
	
	
	
}

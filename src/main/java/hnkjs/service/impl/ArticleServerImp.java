package hnkjs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hnkjs.entities.Article;
import hnkjs.entities.PageBean;
import hnkjs.mapper.ArticleMapper;
import hnkjs.service.IArticleServer;

public class ArticleServerImp implements IArticleServer {

	@Autowired
	private ArticleMapper mArticleMapper;
	
	@Override
	public Article getEntityById(int id) {
		return mArticleMapper.getArticleById(id);
	}

	@Override
	public Article getEntityByStr(String str) {
		// TODO Auto-generated method stub
		return mArticleMapper.getEntityBytitle(str);
	}

	@Override
	public List<Article> getEntities() throws Exception {
		// TODO Auto-generated method stub
		return mArticleMapper.getArticles();
	}

	@Override
	public List<Article> getEntitiesByStr(String str) throws Exception {
		// TODO Auto-generated method stub
		return mArticleMapper.getArticlesByStr(str);
	}

	@Override
	public List<Article> getEntitiesPage(PageBean<Article> page) {
      
		return mArticleMapper.getArticlesPage(page.getOffset(), page.getLimit(), page.getPresentstate());
	}

	@Override
	public int save(Article t) throws Exception {
		// TODO Auto-generated method stub
		return mArticleMapper.save(t);
	}

	@Override
	public int modify(int id, Article t) throws Exception {
		if(id==t.getId()){
			return mArticleMapper.modify(t);
		}else{
			return 0;
		}
		
	}

	@Override
	public int delete(int id) throws Exception {
		
		return mArticleMapper.delete(id);
	}

	@Override
	public List<Article> queryArticleByType(PageBean<Article> pageBean,int typeId,int state) {
			
		if(pageBean!=null){
			mArticleMapper.getArticlesPageByTypeId(pageBean.getOffset(), pageBean.getLimit(), typeId, state);
		}
		 
		return null;
	}

	@Override
	public long getCount() throws Exception {
		// TODO Auto-generated method stub
		return mArticleMapper.getCount();
	}

}

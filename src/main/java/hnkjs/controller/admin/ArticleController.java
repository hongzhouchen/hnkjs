package hnkjs.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hnkjs.entities.Article;
import hnkjs.entities.PageBean;
import hnkjs.service.IArticleServer;
import net.sf.json.JSONObject;

@RequestMapping("admin")
@Controller
public class ArticleController {
	
    Logger logger=Logger.getLogger(ArticleController.class);
	
    @Autowired
    private IArticleServer mIArticleServer;
	
	@RequestMapping("article")
	public String returnPage(ModelMap map,HttpServletRequest req ){
		String page="";
		try {
			page=(String) req.getParameter("page");
			if(page==null || page==""){
				page="list";
			}
		} catch (Exception e) {
			page="articleList";
		}
		String resultPage="";
		switch (page) {
		case "list":
			resultPage="admin/article/articleList";
			break;
		case "add":
			resultPage="admin/article/addArticle";
			break;
		case "updata":
			resultPage="admin/article/updataArticle";
			break;
		default:
			resultPage="admin/article/articleList";
			break;
		}
		return resultPage;
	}
	
	@ResponseBody
	@RequestMapping("articleList")
	public String list(int page,int limit) throws Exception{
		//放置传入的刹参数不正确
		if(page<1 || limit <1){
			page=1;  limit=10;
		}
		long count = mIArticleServer.getCount();
		if(count<=0){
			count=500; //默认500条
		}
		//实例化分页实例
		PageBean<Article> pageBean=new PageBean<>();
		//设置每页的数量
		pageBean.setLimit(limit);
		//设置 偏移量  mysql语句中 limit的第一个参数
		pageBean.setOffset((page-1)*limit);
		//获取数据
		List<Article> entitiesPage = mIArticleServer.getEntitiesPage(pageBean);
		JSONObject json=new JSONObject();
		 json.put("code", 0);
		 json.put("msg", "success");
		 json.put("count", count);
		 json.put("data", entitiesPage);
		return  json.toString();
		
	}
	
	
	/**
	 * 添加文章
	 * @param map
	 * @param mArticle
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("addArticle")
	public String addArticle(ModelMap map,Article mArticle) throws Exception{
		
		int save = mIArticleServer.save(mArticle);
		
		return "admin/article/addarticle";
	}
	
	
}

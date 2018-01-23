package hnkjs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import hnkjs.entities.Article;
import hnkjs.entities.PageBean;

public interface ArticleMapper {
    
	/**
	 * 获取所有数据的数量
	 * @return
	 */
	public long getCount();
	
	
	/**
	 * 根据文章id 获取文章实体
	 * @param id 文章id
	 * @return 文章实体
	 */
	public Article getArticleById(@Param("id")int id);
	

	/**
	 * 根据 文章标题  查找文章实体
	 * @param title 标题
	 * @return 文章实体
	 */
	public Article getEntityBytitle(@Param("title")String title);

	/**
	 * 获取所有的文字
	 * 最好不要用
	 * @return 所有文章的集合
	 */
	public List<Article> getArticles();
	
	/**
	 * 根据字符串 模糊查询
	 * @param str 模糊查询的字符串 从 标题、内容、描述 查询
	 * @return 集合
	 */
	public List<Article> getArticlesByStr(@Param("str")String  str);
	
    /**
     * 分页获取所有的文字
     * @param offset 检索页索引
     * @param pageSize  每页大小
     * @param presentstate 某个状态
     * @return 
     */
	public List<Article> getArticlesPage(@Param("offset")int offset, @Param("pageSize")int pageSize, @Param("presentstate")boolean presentstate);

	/**
	 *  根据文章类型的id 分页获取 文章
	 * @param offset  检索页索引
	 * @param pageSize 每页大小
	 * @param typeid 文章类型ID
	 * @param state 文章状态
	 * @return 
	 */
	public List<Article> getArticlesPageByTypeId(@Param("offset")int offset, @Param("pageSize")int pageSize, @Param("typid")int typeid, @Param("state")int state);

	/**
	 * 添加文章
	 * @param t 文章实体
	 * @return 
	 */
	public int save(Article t);
    /**
     * 修改文章	
     * @param t 修改的实体
     * @return 状态码
     */
	public int modify(Article t);
 
	/**
	 * 删除实体
	 * @param id 实体的id
	 * @return
	 */
	public int delete(int id);
}

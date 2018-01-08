package hnkjs.mapper;

import java.util.List;

import hnkjs.entities.PageBean;

public interface  BaseDao<T> {

	/**
	 * 获取一个实体对象
	 * @param id 逐渐
	 * @return
	 */
	public T getEntity(int id);
	
	/**
	 * 获取一个实体集合，无参数
	 * @return
	 */
	public	List<T> getEntity();
	
	/**
	 * 根据一个字符串获取实体
	 * @param str  必须保证该str 唯一
	 * @return
	 */
	public	T getEntityByname(String str);
	
	/**
	 * 根据一个字符串获取一个集合，查询出来的数据可能有多条
	 * 可用于查找 某字段相同的实体
	 * 不分页
	 * @param str 
	 * @return
	 */
	public	List<T> getEntities(String str)throws Exception;
	/**
	 * 分页查找
	 * @param page 分页对象
	 * @param orderType 排序类型
	 * @param oderName 排序的字段
	 * @return
	 */
	public	List<T> getEnntities(PageBean<T> page,String orderType, String oderName);
	
	/**
	 * 添加一个实体
	 * @param t 实体对象
	 * @return  添加的结果状态 
	 * @throws Exception
	 */
	public int  save(T t)  throws Exception;
	
	/**
	 * 修改一个 实体对象
	 * @param id 要修改实体的主键
	 * @param t 新的实体
	 * @return 
	 * @throws Exception
	 */
	public	int   modify(int id,T t) throws Exception;
	/**
	 * 根据主键删除一个实体
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public	int  delete(int id) throws Exception;  
	
	
	
	
	
}

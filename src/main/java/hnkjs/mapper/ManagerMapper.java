package hnkjs.mapper;

import java.util.List;

import hnkjs.entities.Manager;

/**
 * 后台管理员Dao
* @author: Charles
* @date: 2017年12月27日 上午11:16:48 
* @version: v1.0.0  
* @Description: 该函数的功能描述
 */
public interface ManagerMapper {

	/**
	 * 添加一个后台管理员
	 *    添加之前先检测该用户名是否已经被占用
	 * @param mManager
	 *            管理员实体
	 * @return
	 * @throws Exception
	 */
	public int addManager(Manager mManager) throws Exception;

	/**
	 * 根据管理员ID,硬删除该管理员
	 * 
	 * @param id
	 * @return 操作状态码
	 * @throws Exception
	 */
	public int deleteManagerById(int id) throws Exception;

	/**
	 * 根据id 软删除 管理员：即将管理员的账号状态 presentstate 修改为false
	 * 即封号
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int softdeleteManagerById(int id) throws Exception;

	/**
	 * 根据管理员 id 查询 管理员对象 不管该管理员是否被封
	 * 
	 * @param id
	 * @return 管理员对象
	 * @throws Exception
	 */
	public Manager queryOneManagerById(int id) throws Exception;

	/**
	 * 根据管理员的登录名查找
	 * 功能： 1、检测该登录名是否可用 2、做检索
	 * @param loginname
	 * @return
	 */
	public Manager queryOneManagerByloginName(String loginname);
	
	/**
	 * 查询所有的管理员，不分页
	 * 
	 * @param presentstate
	 * 账号状态：false 表示被封账号,true表示可用账号
	 * @return
	 * @throws Exception
	 */
	public List<Manager> queryAllManager(boolean presentstate) throws Exception;

	/**
	 * 分页查找所有的管理员
	 * 
	 * @param pageIndex
	 *            当前页
	 * @param pageSize
	 *            一页总条数
	 * @param presentstate
	 *            账号状态：false 表示被封账号,true表示可用账号
	 * @return 集合
	 * @throws Exception
	 */
	public List<Manager> queryAllManage(int pageIndex, int pageSize, boolean presentstate) throws Exception;

	/**
	 * 根据ID 恢复 管理员账号
	 * @param id 
	 * @return
	 */
	public int recoverManager(int id) throws Exception;
	
	/**
	 * 根据登录名称 恢复 管理员账号
	 * @param loginname 登录名称
	 * @return
	 */
	public int recoverManager(String loginname)throws Exception;
	
	/**
	 * 修改一个管理员账号信息
	 * @param id 要修改的管理员账号的id
	 * @param mManager
	 * @return
	 */
	public int modifyManager(int id,Manager mManager)throws Exception;
	
	/**
	 * 根据id,修改管理员密码(已知旧密码)
	 * @param id
	 * @param oldPassword
	 * @param newloginpassword
	 * @return
	 */
	public int modifyManagerPassword(int id,String oldPassword,String newloginpassword)throws Exception;
	
	/**
	 * 根据id,修改管理员密码(不知道知旧密码)
	 * 该方法的应用场景有：1、超级管理员可用  2、通过邮箱验证后的用户可以用
	 * @param id
	 * @param newloginpassword 
	 * @return
	 * @throws Exception
	 */
	public int modifyManagerPassword(int id,String newloginpassword)throws Exception;
	
}

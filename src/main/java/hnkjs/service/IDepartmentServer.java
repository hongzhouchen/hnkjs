package hnkjs.service;

import java.util.List;

import hnkjs.entities.Authority;
import hnkjs.entities.Department;
import hnkjs.entities.Role;

/**
* @ClassName: IDepartmentServer
* @Description: TODO(部门管理服务)
* @author Charles
* @date 2017年12月28日
 */
public interface IDepartmentServer extends IBaseServer<Department>{
   
	
	
	/**
	 * 根据部门ID查找 角色
	 * @param departmentId 部门id
	 * @return
	 */
	 public List<Role> getAllRoleById(int departmentId);
	
	 /**
	  * 根据部门名称查找 部门下的角色
	  * @param departmentName
	  * @return
	  */
	 public List<Role> getAllRoleByDepartmentName(String departmentName);
	 
	 
	 
	 
	 
	 
	 
	
}

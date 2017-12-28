package hnkjs.mapper;

import java.util.List;

import hnkjs.entities.Department;
import hnkjs.entities.Role;

public interface DepartmentMapper  extends BaseDao<Department> {
   
	
	
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

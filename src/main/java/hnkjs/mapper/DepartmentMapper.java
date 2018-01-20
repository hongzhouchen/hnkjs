package hnkjs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import hnkjs.entities.Department;
import hnkjs.entities.Manager;
import hnkjs.entities.PageBean;
import hnkjs.entities.Role;

public interface DepartmentMapper  {
   
	/**
	 * 获取部门总数
	 * @return 总数
	 */
	public long getCount(); 
	
	/**
	 * 根据id 获取部门实体
	 * @param id
	 * @return
	 */
	public Department getDepartmentById(@Param("id")int id);
	
	/**
	 * 根据部门名称 获取部门
	 * @param name 部门名称
	 * @return
	 */
	public Department getDepartmentByStr(@Param("name") String name);
	
	/**
	 * 根据字符串  查找部门集合
	 * @param name
	 * @return
	 */
	public List<Department> geDepartmentesByStr(@Param("department_value")String department_value);
	/**
	 * 获取所有的部门
	 * @return
	 */
	public List<Department> getDepartmentes();
	
	/**
	 * 分页获取数据
	 * @param offset 当前页与一页总数的计算值：（当前页-1）*总页数
	 * @param pageSize  一页总数
	 * @param presentstate 某一个状态 
	 * @return 该状态的的分页数据集合
	 */
	public List<Department> getDepartmentesByPage(@Param("offset")int offset, @Param("pageSize")int pageSize, @Param("presentstate")boolean presentstate);
	
	/**
	 * 添加部门
	 * @param mDepartment 部门实体
	 * @return 返回结果码 大于1 表示成功
	 */
	public int addDepartment(Department mDepartment);
	
	/**
	 * 根据部门ID查找 角色
	 * @param departmentId 部门id
	 * @return 
	 */
	 public List<Role> getAllRoleById(@Param("id")int id);
	
	 /**
	  * 根据部门名称查找 部门下的角色
	  * @param departmentName
	  * @return
	  */
	 public List<Role> getAllRoleByDepartmentName(@Param("departmentName")String departmentName);
	 
	 /**
	  * 根据部门名称获取部门下的所有管理员
	  * @param departmentName
	  * @return
	  */
	 public List<Manager> getManagerByDepartmentName(@Param("departmentName")String departmentName); 
	  
	 /**
	  * 
	  * @param mDepartment
	  * @return
	  */
	 public int modifyDepartment(Department mDepartment);
	
	/**
	 * 根据部门id 删除部门
	 * @param id
	 * @return
	 */
	 public int deleteDepartmentById(int id);
}

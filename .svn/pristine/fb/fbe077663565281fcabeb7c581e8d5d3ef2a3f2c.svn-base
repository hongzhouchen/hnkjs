package hnkjs.entities;

/**
 * 部门表
* @author: Charles
* @date: 2017年12月21日 上午9:05:28 
* @version: v1.0.0  
* @Description: 该函数的功能描述
 */
public class department extends BaseEntity{
	
	private int id; //主键
	private String department_key;//部门编码,唯一
	private String department_name; //部门名称
	private int  parent_departmentkey_id;//上级部门id
	private String description;//部门描述
	private String	create_time; //创建时间
	
	
	public department(){super();}
	public department(int id, String department_key, String department_name, int parent_departmentkey_id,
			String description, String create_time) {
		super();
		this.id = id;
		this.department_key = department_key;
		this.department_name = department_name;
		this.parent_departmentkey_id = parent_departmentkey_id;
		this.description = description;
		this.create_time = create_time;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment_key() {
		return department_key;
	}
	public void setDepartment_key(String department_key) {
		this.department_key = department_key;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public int getParent_departmentkey_id() {
		return parent_departmentkey_id;
	}
	public void setParent_departmentkey_id(int parent_departmentkey_id) {
		this.parent_departmentkey_id = parent_departmentkey_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
    
	
}

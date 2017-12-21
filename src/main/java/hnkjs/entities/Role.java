package hnkjs.entities;

/**
 * 管理员角色角色
* @author: Charles
* @date: 2017年12月21日 上午9:01:01 
* @version: v1.0.0  
* @Description: 该函数的功能描述
 */
public class Role extends BaseEntity{
	
	private int role_id; // 主键
	private String role_key; // 角色编码
	private String create_time;// 创建时间
	private String description; // 描述
	private String role_name;// 角色名称
	private int company_id;// 权限id
	
	public Role(){super();}
	public Role(int role_id, String role_key, String create_time, String description, String role_name,
			int company_id) {
		super();
		this.role_id = role_id;
		this.role_key = role_key;
		this.create_time = create_time;
		this.description = description;
		this.role_name = role_name;
		this.company_id = company_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole_key() {
		return role_key;
	}
	public void setRole_key(String role_key) {
		this.role_key = role_key;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
    
	
}

package hnkjs.entities;

/**
 * 
* @ClassName: Authority
* @Description: TODO(权限的实体)
* @author Charles
* @date 2017年12月28日
 */
public class Authority extends BaseEntity{
  
	private  int id ; //主键
	
	private String data_url;//链接的路径
	
	private String menu_class; //菜单样式
	
	private String menu_code ;//菜单编码
	
	private String menu_name; //菜单名字
	
	private String  parent_menucode_id; //上级菜单的id
	
	private  int  sequence; //排序
	
	private  String  menu_type ;// 菜单类型(1是左导航菜单  2是按钮权限)
	
	private  String create_time; //创建时间

	public Authority(){super();};
	
	public Authority(int id, String data_url, String menu_class, String menu_code, String menu_name,
			String parent_menucode_id, int sequence, String menu_type, String create_time) {
		super();
		this.id = id;
		this.data_url = data_url;
		this.menu_class = menu_class;
		this.menu_code = menu_code;
		this.menu_name = menu_name;
		this.parent_menucode_id = parent_menucode_id;
		this.sequence = sequence;
		this.menu_type = menu_type;
		this.create_time = create_time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData_url() {
		return data_url;
	}

	public void setData_url(String data_url) {
		this.data_url = data_url;
	}

	public String getMenu_class() {
		return menu_class;
	}

	public void setMenu_class(String menu_class) {
		this.menu_class = menu_class;
	}

	public String getMenu_code() {
		return menu_code;
	}

	public void setMenu_code(String menu_code) {
		this.menu_code = menu_code;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getParent_menucode_id() {
		return parent_menucode_id;
	}

	public void setParent_menucode_id(String parent_menucode_id) {
		this.parent_menucode_id = parent_menucode_id;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getMenu_type() {
		return menu_type;
	}

	public void setMenu_type(String menu_type) {
		if(menu_type.equals("1") ||menu_type.equals("2")){
			this.menu_type = menu_type;
		}else{
			this.menu_type="2";// 默认1，按钮菜单
		}
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	
	
	
	
}

package hnkjs.entities;

import java.util.Arrays;

/**
 * 后台管理员 实体类
* @author: Charles
* @date: 2017年12月14日 下午6:50:50 
* @version: v1.0.0  
* @Description:
 */
public class Manager {
   
	private int id;//ID 主键,自增
	private String username;//用户名
	private String loginname;//登录名称
	private String loginpassword;//登录密码
	private String email; //邮箱
	private String logincount; //登录次数
	private String lastlogintime;//上一次登录时间
	private String lastloginip;//上一次登录IP
	private String islogin; //是否已经登录
	private Boolean presentstate;//当前账号状态（做审核、封号）
	private int[] roleid;//角色id
	
	
	public Manager(){super();}
	public Manager(int id, String username, String loginname, String loginpassword, String email, String logincount,
			String lastlogintime, String lastloginip, String islogin, Boolean presentstate, int[] roleid) {
		super();
		this.id = id;
		this.username = username;
		this.loginname = loginname;
		this.loginpassword = loginpassword;
		this.email = email;
		this.logincount = logincount;
		this.lastlogintime = lastlogintime;
		this.lastloginip = lastloginip;
		this.islogin = islogin;
		this.presentstate = presentstate;
		this.roleid = roleid;
	}
	
	
	@Override
	public String toString() {
		return "Manager [id=" + id + ", username=" + username + ", loginname=" + loginname + ", loginpassword="
				+ loginpassword + ", email=" + email + ", logincount=" + logincount + ", lastlogintime=" + lastlogintime
				+ ", lastloginip=" + lastloginip + ", islogin=" + islogin + ", presentstate=" + presentstate
				+ ", roleid=" + Arrays.toString(roleid) + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getLoginpassword() {
		return loginpassword;
	}
	public void setLoginpassword(String loginpassword) {
		this.loginpassword = loginpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogincount() {
		return logincount;
	}
	public void setLogincount(String logincount) {
		this.logincount = logincount;
	}
	public String getLastlogintime() {
		return lastlogintime;
	}
	public void setLastlogintime(String lastlogintime) {
		this.lastlogintime = lastlogintime;
	}
	public String getLastloginip() {
		return lastloginip;
	}
	public void setLastloginip(String lastloginip) {
		this.lastloginip = lastloginip;
	}
	public String getIslogin() {
		return islogin;
	}
	public void setIslogin(String islogin) {
		this.islogin = islogin;
	}
	public Boolean getPresentstate() {
		return presentstate;
	}
	public void setPresentstate(Boolean presentstate) {
		this.presentstate = presentstate;
	}
	public int[] getRoleid() {
		return roleid;
	}
	public void setRoleid(int[] roleid) {
		this.roleid = roleid;
	}
	
	
	
	
	
	
	
	
	
	
}

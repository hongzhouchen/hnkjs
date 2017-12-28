package hnkjs.entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 后台管理员 实体类
 * 
 * @author: Charles
 * @date: 2017年12月14日 下午6:50:50
 * @version: v1.0.0
 * @Description:
 */
@Entity
public class Manager extends BaseEntity{
	private int id;// ID 主键,自增
	
	private String user_name;// 用户名
	
	private String login_account;// 登录名称
	
	private String login_pass;// 登录密码
	
	private String user_head; // 头像地址
	
	private String user_email; // 邮箱
	
	private String user_sex;// 性别
	
	private String register_time; // 创建时间
	
	private int logincount; // 登录次数
	
	private String lastlogintime;// 上一次登录时间
	
	private String lastloginip;// 上一次登录IP
	
	private boolean islogin; // 是否已经登录
	
	private Boolean presentstate;// 当前账号状态（做审核、封号）
	
	private int department_id;//部门id
	

	public Manager() {
		super();
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; 
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getLogin_account() {
		return login_account;
	}
	public void setLogin_account(String login_account) {
		this.login_account = login_account;
	}
	public String getLogin_pass() {
		return login_pass;
	}
	public void setLogin_pass(String login_pass) {
		this.login_pass = login_pass;
	}
	public String getUser_head() {
		return user_head;
	}
	public void setUser_head(String user_head) {
		this.user_head = user_head;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getRegister_time() {
		return register_time;
	}
	public void setRegister_time(String register_time) {
		this.register_time = register_time;
	}
	public int getLogincount() {
		return logincount;
	}
	public void setLogincount(int logincount) {
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
	public boolean getIslogin() {
		return islogin;
	}
	public void setIslogin(boolean islogin) {
		this.islogin = islogin;
	}
	public Boolean getPresentstate() {
		return presentstate;
	}
	public void setPresentstate(Boolean presentstate) {
		this.presentstate = presentstate;
	}
	
	
	public Manager(int id, String user_name, String login_account, String login_pass, String user_head,
			String user_email, String user_sex, String register_time, int logincount, String lastlogintime,
			String lastloginip, boolean islogin, Boolean presentstate, int[] roleid) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.login_account = login_account;
		this.login_pass = login_pass;
		this.user_head = user_head;
		this.user_email = user_email;
		this.user_sex = user_sex;
		this.register_time = register_time;
		this.logincount = logincount;
		this.lastlogintime = lastlogintime;
		this.lastloginip = lastloginip;
		this.islogin = islogin;
		this.presentstate = presentstate;
	}


	@Override
	public String toString() {
		return "Manager [id=" + id + ", user_name=" + user_name + ", login_account=" + login_account + ", login_pass="
				+ login_pass + ", user_head=" + user_head + ", user_email=" + user_email + ", user_sex=" + user_sex
				+ ", register_time=" + register_time + ", logincount=" + logincount + ", lastlogintime=" + lastlogintime
				+ ", lastloginip=" + lastloginip + ", islogin=" + islogin + ", presentstate=" + presentstate
				+ ", department_id=" + department_id + "]";
	}

	
}

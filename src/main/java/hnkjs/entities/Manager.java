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
	
	/**
	 *  登录密码
	 */
	private String login_pass;// 登录密码
	
	private String user_head; // 头像地址
	
	private String user_email; // 邮箱
	
	private String user_sex;// 性别
	
	private String register_time; // 创建时间
	
	private int login_count; // 登录次数
	
	private String last_logintime;// 上一次登录时间
	
	private String last_loginip;// 上一次登录IP
	
	private boolean islogin; //是否已经登录
	
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
	/**
	 * @return 登录密码
	 */
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
		this.login_count = logincount;
		this.last_logintime = lastlogintime;
		this.last_loginip = lastloginip;
		this.islogin = islogin;
		this.presentstate = presentstate;
	}


	@Override
	public String toString() {
		return "Manager [id=" + id + ", user_name=" + user_name + ", login_account=" + login_account + ", login_pass="
				+ login_pass + ", user_head=" + user_head + ", user_email=" + user_email + ", user_sex=" + user_sex
				+ ", register_time=" + register_time + ", logincount=" + login_count + ", lastlogintime=" + last_logintime
				+ ", lastloginip=" + last_loginip + ", islogin=" + islogin + ", presentstate=" + presentstate
				+ ", department_id=" + department_id + "]";
	}


	public String getLast_loginip() {
		return last_loginip;
	}


	public void setLast_loginip(String last_loginip) {
		this.last_loginip = last_loginip;
	}


	public String getLast_logintime() {
		return last_logintime;
	}


	public void setLast_logintime(String last_logintime) {
		this.last_logintime = last_logintime;
	}


	public int getLogin_count() {
		return login_count;
	}


	public void setLogin_count(int login_count) {
		this.login_count = login_count;
	}

	
}

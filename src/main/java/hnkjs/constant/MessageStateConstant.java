package hnkjs.constant;

/**
 * 
 * @author: Charles
 * @date: 2017年12月11日 下午5:28:57
 * @version: v1.0.0
 * @Description: 常量
 */
public enum  MessageStateConstant {
	/**
	 * 登录成功  stateCode:100
	 */
	LoginSuccess("登录成功",100),
	
	/**
	 * 用户名或密码为空 stateCode:101
	 */
	AccountOrPasswordIsEmpty("用户名或密码为空", 100),
	/**
	 * 密码错误 stateCode:101
	 */
	PasswordErr("密码错误", 101),
	/**
	 * 账号不存在 102
	 */
	AccountNotExit("账号不存在", 102),
	/**
	 * 系统查询错误 103
	 */
	SysErr("系统查询错误", 103),
	
	/**
	 * 操作成功  104
	 */
	ActionSuccess("操作成功",104),
	/**
	 * 操作失败 
	 */
	ActionFail("操作失败！",105);
	
	private MessageStateConstant(String msg, int stateCode) {
		this.msg = msg;
		this.stateCode = stateCode;
	}

	private String msg;
	private int stateCode;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	
	
	
		
		
}

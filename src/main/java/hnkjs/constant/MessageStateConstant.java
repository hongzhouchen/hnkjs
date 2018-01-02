package hnkjs.constant;

/**
 * 
 * @author: Charles
 * @date: 2017年12月11日 下午5:28:57
 * @version: v1.0.0
 * @Description: 常量
 */
public class MessageStateConstant {
	
	private static  MessageStateConstant mMessageStateConstant=null;
	
	public static MessageStateConstant getInstance(){
		if(mMessageStateConstant==null){
			mMessageStateConstant=new MessageStateConstant();
		}
		return mMessageStateConstant;
	}
	
	
	public enum LoginErrEnum {
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
		SysErr("系统查询错误", 103);
		
		
		private LoginErrEnum(String msg, int stateCode) {
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
}

package hnkjs.constant;

import org.junit.Test;

/**
 * 枚举
 * 
 * @author: Charles
 * @date: 2017年12月26日 上午10:06:57
 * @version: v1.0.0
 * @Description: 定义、管理图片存放的文件夹名称 图片分类存储的文件夹名字
 *               上传的图片必须按类别存储，例如：banner图、logo图、icon图、微信二维码图、宣传图、广告图等
 */
public enum DepartmentEnum {

	CEO("最高领导", 0), leaderDepartment("领导", 1), firtDepartment("一级部门", 2), secondedDepartment("二级部门", 3)

	;
	private String type;
	private int typeid;

	private DepartmentEnum(String type, int typeid) {
		this.type = type;
		this.typeid = typeid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

   public	static class DepartmentEnumUtils {
		public static boolean isDepartmentContanierId(int id) {

			for (DepartmentEnum d : DepartmentEnum.values()) {
				if (d.getTypeid() == id) {
					return true;
				}
			}
			return false;
		}
	}

}

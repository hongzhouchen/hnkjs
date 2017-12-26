package hnkjs.constant;

/**
 * 枚举 
* @author: Charles
* @date: 2017年12月26日 上午10:06:57 
* @version: v1.0.0  
* @Description: 定义、管理图片存放的文件夹名称
* 图片分类存储的文件夹名字
* 上传的图片必须按类别存储，例如：banner图、logo图、icon图、微信二维码图、宣传图、广告图等
*/
public enum ImgDirEnum {

	banner("banner", "轮播图"), 
	LOGO("logo","网站logo"),
	ICON("icon","应用小图标"),
	EWM("ewm","网站二维码"),
	ADVERT("advert","广告图"), 
	PROPAGANDA("Propaganda","宣传图");
	
	private ImgDirEnum(String dirname, String explainname) {
		this.dirname = dirname;
		this.explainname = explainname;
	}

	private String dirname;
	private String explainname;

	public String getDirname() {
		return dirname;
	}

	public void setDirname(String dirname) {
		this.dirname = dirname;
	}

	public String getExplainname() {
		return explainname;
	}

	public void setExplainname(String explainname) {
		this.explainname = explainname;
	}

}

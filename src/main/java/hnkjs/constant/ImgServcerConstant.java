package hnkjs.constant;

import java.io.File;

public class ImgServcerConstant {
	
	public final static String separator=File.separator;
	
	// 默认上传图片的 根目录 地址
	public final static String truePicUrl =separator+"application"+separator+"img"+separator+"upload"+separator;
    
	/**
	 * 图片虚拟访问地址,在tomcat中配置 该值访问truePicUrl的路径
	 */
	public final static String hnkjsImgServer =separator+"imgServer"+separator;
	
	
	/**
	 * 用户头像的上传根路径，使用他的时候，应该要拼接一个用户的id,分用户id存放图片，方便用户自身修改头像
	 */
	public final static  String ManagerHeadImgRoot=ImgServcerConstant.truePicUrl+"managerHeadImg"+separator;
	
	/**
	 * 系统默认用户头像的根路径
	 */
	public final static  String sysHeadImg=ImgServcerConstant.hnkjsImgServer+"managerHeadImg"+separator+"sysHead"+separator;
	
}

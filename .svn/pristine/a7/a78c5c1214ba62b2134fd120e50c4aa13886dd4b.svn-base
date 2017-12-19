package hnkjs.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.web.multipart.MultipartFile;


/**
 * 图片上传工具类
* @author: Charles
* @date: 2017年12月12日 上午10:19:10 
* @version: v1.0.0  
* @Description: 该函数的功能描述
 */
public class ImgUploadUtils {
    
	
    /** 
	 * 上传一张图片，格式必须是GIF,PNG,JPG之一
	 * 上传后的图片会被修改名称
     * @param mfile
     * @param hnkjsImgServer 虚拟服务器路径
     * @param truePicUrl 真实存在的物理路径
     * @param dir 该文件要被保存的文件夹名称
     * @return 返回 该图片所在的虚拟路径
     * @throws Exception
     */
	public static String OneImgUpLoad(MultipartFile mfile,String hnkjsImgServer,String truePicUrl,String dir)throws Exception{
		//1、将文件写入到图片服务器   2、修改图片的名字  3、返回 图片的存储路径
		if(mfile!=null){
			String fileName = mfile.getOriginalFilename();// 文件原名称
			//获取文件类型
			String	type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()): null;
			if(type!=null){
				//是否是指定的图片格式之一
				if ("GIF".equals(type.toUpperCase()) || "PNG".equals(type.toUpperCase())|| "JPG".equals(type.toUpperCase())) {
					//截取图片格式
					String typeName = fileName.substring(fileName.length() - 4, fileName.length());
					//自定义的图片名称
					String newImgName =new SimpleDateFormat("yyyyMMddhhmmss").format(new Date())+"_"+(int)(Math.random()*100)+typeName;
					//项目在容器中实际发布运行的根路径
					String truePath=truePicUrl +dir+ newImgName;
					//转存文件到指定的路径
					mfile.transferTo(new File(truePath));
					return hnkjsImgServer+newImgName;
				}else{
					return null;
				}
			}
		}
		return "";  
	}
}

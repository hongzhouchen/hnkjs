package hnkjs.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @author: Charles
* @date: 2017年12月29日 上午9:39:14 
* @version: v1.0.0  
* @Description: 获取当前时间的工具类
 */
public class  CurrentTimeUtils {
	
	
	private CurrentTimeUtils(){};
	
	private static CurrentTimeUtils mCurrentTimeUtils=null;
	
	public static  CurrentTimeUtils getInstant(){
		if(mCurrentTimeUtils==null){
			mCurrentTimeUtils=new CurrentTimeUtils();
		}
		return mCurrentTimeUtils;
	}

	/**
	 * 根据自定义时间格式 生成当前的时间
	 * @param role 时间格式 例如：
	 *        yyyy-MM-dd hh:mm:ss
	 *        注意：如果时间格式不正确,导致程序异常,则会按照  yyyy-MM-dd hh:mm:ss 生成时间。
	 * @return
	 */
	public  String getCurrentTime(String role){
		String time="";
		try {
	       time=new  SimpleDateFormat(role).format(new Date());
		} catch (Exception e) {
			time=new  SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
		}
		
	    
		return time;
	}
	
}

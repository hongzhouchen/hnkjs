package hnkjs.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台首页获取的业务层代码
* @author: Charles
* @date: 2017年12月26日 上午8:40:55 
* @version: v1.0.0  
* @Description: 该函数的功能描述
 */
@RequestMapping("admin")
@Controller
public class AdminController {
    
	@RequestMapping("index")
	public String index(ModelMap map){
		//1、获取登录着信息
		//2、权限查找（）
		//3、展示内容
		map.addAttribute("title", "马上银--后台首页");	
		return "admin/index";
	}
	
	/**
	 * 控制面板界面
	 * @param map
	 * @return
	 */
	@RequestMapping("ControPage")
	public String getControPage(ModelMap map){
		
		return "admin/controlPage";
	}
	
	
	
	
	
	
	
}

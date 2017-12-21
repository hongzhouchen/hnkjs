package hnkjs.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("admin")
@Controller
public class AdminController {

	@RequestMapping("index")
	public String index(ModelMap map){
		//1、获取登录着信息
		//2、权限查找（）
		//3、展示内容
		
		map.addAttribute("title", "后台首页");
		return "admin/index";
	}
	
	
	
	
}

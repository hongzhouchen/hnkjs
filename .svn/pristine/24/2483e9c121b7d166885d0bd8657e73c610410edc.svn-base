package hnkjs.controller.admin;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hnkjs.entities.Manager;

@RequestMapping("/admin")
@Controller
public class UserManageController {

	@RequestMapping("login")
	public String login(@RequestParam("loginform") Manager mManager){
		
		Subject subject = SecurityUtils.getSubject();
		if(!subject.isAuthenticated()){//如果没有被认证
			UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(mManager.getLogin_account(),mManager.getLogin_pass());
			//记住我
			usernamePasswordToken.setRememberMe(true);
			subject.login(usernamePasswordToken);
		}
		
		return "";
	}
	
	
}

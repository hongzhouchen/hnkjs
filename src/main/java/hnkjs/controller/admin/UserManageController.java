package hnkjs.controller.admin;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hnkjs.entities.Manager;
import hnkjs.service.IManagerService;

@RequestMapping("admin")
@Controller
public class UserManageController {

	@Autowired
	private IManagerService mIManagerService;

	@RequestMapping("login")
	public String login(Manager mManager) {
		System.out.println("loging 请求进来了==");

		Subject subject = SecurityUtils.getSubject();
		if (!subject.isAuthenticated()) {// 如果没有被认证
			UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(mManager.getLogin_account(),
					mManager.getLogin_pass());
			// 记住我
			usernamePasswordToken.setRememberMe(true);
			subject.login(usernamePasswordToken);
		}

		return "admin/index";
	}

	/**
	 * 修改密码
	 */
	@ResponseBody
	@RequestMapping("modifyPassword/{id}")
	public String modifyPassword(@PathVariable int id, String newPassword) {
		// 1、查找该id的管理员是否存在 （无须查找） 2、新的密码
		return "";
	}

	/**
	 * 添加管理员
	 * 
	 * @param mManager
	 * @return
	 */
	@ResponseBody
	@RequestMapping("addManager")
	public String addManager(Manager mManager) {

		return "";
	}

	/**
	 * 修改管理员信息
	 * 
	 * @param mManager
	 * @return
	 */
	@ResponseBody
	@RequestMapping("modifyManager")
	public String modifyManager(Manager mManager) {
		return "";
	}

	/**
	 * 删除管理员
	 *  硬删除
	 * @param id 用户id
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("modifyManager/{id}")
	public String deleteManager(int id) throws Exception {
		int resultState = 0;
		if (id > 0) {
			Manager manager = mIManagerService.queryOneManagerById(id);
			if (manager != null) {
				resultState = mIManagerService.deleteManagerById(id);
			}
		}
		return "result:" + resultState;
	}

}

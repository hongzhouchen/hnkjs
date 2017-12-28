package hnkjs.controller.admin;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;

import hnkjs.entities.Manager;
import hnkjs.entities.PageBean;
import hnkjs.service.IManagerService;

@RequestMapping("admin")
@Controller
public class UserManageController {

	
	@Autowired
	private IManagerService mIManagerService;
	
	private static Log log = LogFactory.getLog(UserManageController.class);
	
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(String loginName,String password){
		log.info("loginName:"+loginName+"password:"+password);
		Subject subject = SecurityUtils.getSubject();
		if(!subject.isAuthenticated()){//如果没有被认证(登录)
			UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(loginName,password);
			//记住我
			usernamePasswordToken.setRememberMe(true);
			subject.login(usernamePasswordToken);
		}
		return "";
	}
	
	/**
	 * 检测该用户名是否可用
	 * @param loginName
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="checkLoginName")
	public String checkLoginName(String loginName){
		if(loginName.isEmpty()){
			log.error("检测用户名的时候，传入的用户名为空");
			return "0:传入的参数为空！";
		}else{
			Manager mManager = mIManagerService.queryOneManagerByloginName(loginName);
			if(mManager!=null){//该账号已经存在
				return "0:该登录名已经存在！";
			}else{
				return "1:该用户名可以使用";
			}
		}
	}
	
	/**
	 * 添加管理员的界面
	 * @return
	 */
	@RequestMapping(value="addManagerPage")
	public String addManager(ModelMap map){
		map.addAttribute("title", "添加管理员");
		map.addAttribute("resultMsg","");
		return "admin/manager/addManager";
	}
	
	/**
	 * 添加一个管理员账号
	 * @param mManager
	 * @return
	 */
	@RequestMapping(value="addManager",method=RequestMethod.POST)
	public String addManager(Manager mManager,ModelMap map){
		if(mManager==null){
		     map.addAttribute("resultMsg","上传的的参数为空");
		     return "";
		}
		return "admin/manager/addManager";
	}

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
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping("addManager")
	public String addManager(Manager mManager) throws Exception {
		int resultState = 0;
		if(mManager!=null){
			//設置登录状态为false
			mManager.setIslogin(false);
			//设置注册时间 
			mManager.setRegister_time(new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date()));
			//设置登录次数
			mManager.setLogincount(0);
			//设置当前账号状态（false则不可以登录）
			mManager.setPresentstate(false);
			resultState= mIManagerService.addManager(mManager);
        }
		//返回状态码
		return "result:"+resultState;
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
	public String deleteManager(@PathVariable int id) throws Exception {
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

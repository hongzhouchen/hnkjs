package hnkjs.controller.admin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

import org.springframework.web.bind.annotation.ResponseBody;

import hnkjs.constant.ImgServcerConstant;
import hnkjs.constant.MessageStateConstant;
import hnkjs.entities.Department;
import hnkjs.entities.Manager;
import hnkjs.service.IDepartmentServer;
import hnkjs.service.IManagerService;
import hnkjs.utils.CurrentTimeUtils;
import net.sf.json.JSONObject;

@RequestMapping("admin")
@Controller
public class UserManageController {

	@Autowired
	private IManagerService mIManagerService;
	@Autowired
	private IDepartmentServer mIDepartmentServer;

	private static Log log = LogFactory.getLog(UserManageController.class);
    
	/**
	 * 后台登录界面
	 * @param map
	 * @return
	 */
	@RequestMapping("loginPage")
	public String loginPage(ModelMap map){
		map.addAttribute("title", "后台登录");
		return "admin/login";
	}
	
	/**
	 * 后台管理员登录操作
	 * @param loginName
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(String loginName, String password,ModelMap map) {
		if (loginName!="" && password !=""){
			//Subject subject = SecurityUtils.getSubject();
			/*if (!subject.isAuthenticated()) {// 如果没有被认证(登录)
				UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(loginName, password);
				// 记住我
				usernamePasswordToken.setRememberMe(true);
				subject.login(usernamePasswordToken);
			}*/
		}else{
			map.addAttribute("resultMsg",MessageStateConstant.AccountOrPasswordIsEmpty.getStateCode()+":"+MessageStateConstant.AccountOrPasswordIsEmpty.getMsg());
        	return "admin/login";
		}
		
		return "admin/index";
	} 

	

	/**
	 * 添加管理员的界面
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "addManagerPage")
	public String addManager(ModelMap map) throws Exception {
		//获取部门数据
		List<Department> departments = mIDepartmentServer.getEntities();
		map.addAttribute("departments", departments);
		map.addAttribute("title", "添加管理员");
		log.info("部门数据列表："+departments);
		return "admin/manager/addManager";
	}

	/**
	 * 添加管理员
	 * @param mManager
	 * @return 
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("addManager")
	public String addManager(Manager mManager) throws Exception {
		int resultState = 0;
		log.info("mManager："+mManager);
		if (mManager != null) {
			// 設置登录状态为false
			mManager.setIslogin(false);
			// 设置注册时间
			mManager.setRegister_time(CurrentTimeUtils.getInstant().getCurrentTime("yyyy-MM-dd"));
			// 设置当前账号状态（false则不可以登录）
			mManager.setPresentstate(true);
			//设置默认头像
			mManager.setUser_head(ImgServcerConstant.sysHeadImg+"sysHead.jsp");
			
			resultState = mIManagerService.addManager(mManager);
		}
		// 返回状态码
		return  "result:" + resultState;
	}

	/**
	 * 检测该 用户名 是否可用
	 * @param loginName
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "checkLoginName")
	public String checkLoginName(String loginName) {
		if (loginName.isEmpty()) {
			log.error("检测用户名的时候，传入的用户名为空");
			return "0:传入的参数为空！";
		} else {
			Manager mManager = mIManagerService.queryOneManagerByloginName(loginName);
			if (mManager != null) {// 该账号已经存在
				return "0:该登录名已经存在！";
			} else {
				return "1:该用户名可以使用";
			}
		}
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
	 * 修改管理员信息
	 * @param mManager
	 * @return
	 */
	@ResponseBody
	@RequestMapping("modifyManager")
	public String modifyManager(Manager mManager) {
		
		return "";
	}
    
	/**
	 * 管理员列表界面
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("manager")
	public String  managerList(ModelMap map) throws Exception{
		map.addAttribute("title", "管理员列表");
		return "admin/manager/managerList";
	}
	
	
	@ResponseBody
	@RequestMapping("managerList")
	public String  getmanagerListbyPage(int page,int limit) throws Exception{
		
		 List<Manager> entities = mIManagerService.queryAllManage(page, limit, true);
		 
		 JSONObject json=new JSONObject();
		 json.put("code", 0);
		 json.put("code", 0);
		 if(entities.size()>0){
			 json.put("msg", "success");
		 }else{
			 json.put("msg", "");
		 }
		 json.put("count", 12);
		 json.put("data", entities);
 		return  json.toString();
	}
	
	
	/**
	 * 删除管理员 硬删除
	 * 
	 * @param id
	 *            用户id
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("deleteManager/{id}")
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

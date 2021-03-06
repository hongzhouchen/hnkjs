package hnkjs.controller.admin;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hnkjs.controller.BaseController;
import hnkjs.entities.Department;
import hnkjs.service.IDepartmentServer;
import hnkjs.utils.CurrentTimeUtils;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("admin")
public class DepartmentController extends BaseController {
	private static Logger logger = Logger.getLogger(DepartmentController.class);
	
	@Autowired
	private IDepartmentServer mIDepartmentServer;

	@RequestMapping("departmentPage")
	public String pageReturn(ModelMap map,HttpServletRequest req){
		String page="";
		try {
			page=(String) req.getParameter("page");
			if(page==null || page==""){
				page="list";
			}
		} catch (Exception e) {
			page="list";
		}
		String resultPage="";
		switch (page) {
		case "list":
			resultPage="admin/department/list";
		case "add":
			resultPage="admin/department/addDepartment";
			break;
		case "updata":
			resultPage="admin/department/updataDepartment";
			break;
		default:
			resultPage="admin/department/list";
			break;
		}
		return resultPage;
	}
	
	@RequestMapping("/getDepartmentList")
	@ResponseBody
	public List<Department> getDepartmentList() throws Exception{
		 List<Department> entities = mIDepartmentServer.getEntities();
		 logger.debug(entities.toString());
		 
		return entities;
	}
	
	@RequestMapping("getDepartmentPage")
	@ResponseBody
	public String getDepartmentPage(String page,String limit) throws Exception{
		 List<Department> entities = mIDepartmentServer.getEntities();
		 JSONObject json=new JSONObject();
		 json.put("code", 0);
		 if(entities.size()>0){
			 json.put("msg", "success");
		 }else{
			 json.put("code", 0);
			 json.put("msg", "there is nothing !");
		 }
		 json.put("count", entities.size());
		 json.put("data", entities);
 		return  json.toString();
	}
	
	
	
	
	@RequestMapping("addDepartment")
	public String addDepartment(Department mDepartment) throws Exception {
		if (mDepartment != null) {
			//设置部门添加时间创建
			mDepartment.setCreate_time(CurrentTimeUtils.getInstant().getCurrentTime("yyyy-MM-dd"));
			
			int save = mIDepartmentServer.save(mDepartment);
		}
		logger.info("上传的部门信息" + mDepartment.toString());
		return "admin/index";
	}
    
	
	@RequestMapping("deleteDepartment")
	@ResponseBody
	public String  deleteDepartment(int id) throws Exception{
		
		Department department = mIDepartmentServer.getEntityById(id);
		
		if(department==null){
			return "{'code':0,'result':'该部门不存在！'}";
		}else{
			int code = mIDepartmentServer.delete(id);
			if(code>0){
				return "{'code':1,'result':'删除成功！'}";
			}else{
				return "{'code':0,'result':'该部门不存在！'}";
			}
		}
		
		
	}
	
	
	
}

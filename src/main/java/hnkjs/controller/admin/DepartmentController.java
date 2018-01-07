package hnkjs.controller.admin;


import java.util.List;

import javax.json.JsonObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import hnkjs.constant.DepartmentEnum;
import hnkjs.constant.DepartmentEnum.DepartmentEnumUtils;
import hnkjs.controller.BaseController;
import hnkjs.entities.Department;
import hnkjs.service.IDepartmentServer;
import hnkjs.utils.CurrentTimeUtils;

@Controller
@RequestMapping("admin")
public class DepartmentController extends BaseController {

	@Autowired
	private IDepartmentServer mIDepartmentServer;

	private static Logger logger = Logger.getLogger(DepartmentController.class);

	
	@ResponseBody
	@RequestMapping("getDepartmentList")
	public String getDepartmentList() throws Exception{
		 List<Department> entities = mIDepartmentServer.getEntities();
		 
		 logger.info(entities.toString());
		return entities.toString();
	}
	
	
	@RequestMapping("addDepartment")
	public String addDepartment(Department mDepartment) throws Exception {
		if (mDepartment != null) {
			// 设置部门添加时间创建
			mDepartment.setCreate_time(CurrentTimeUtils.getInstant().getCurrentTime("yyyy-MM-dd"));
			
			int save = mIDepartmentServer.save(mDepartment);
		}
		logger.info("上传的部门信息" + mDepartment.toString());
		return "admin/index";
	}
    
	@RequestMapping("departmentPage")
	public String pageReturn(String page,ModelMap map){
		String resultPage="admin/department/list";
		switch (page) {
		case "add":
			resultPage="admin/department/addDepartment";
			break;
		case "updata":
			resultPage="admin/department/updataDepartment";
			break;
		default:
			break;
		}
		return resultPage;
	}
	
	
	
	
}

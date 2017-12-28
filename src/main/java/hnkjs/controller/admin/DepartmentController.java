package hnkjs.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hnkjs.controller.BaseController;
import hnkjs.entities.Department;
import hnkjs.service.IDepartmentServer;
@Controller
@RequestMapping("admin")
public class DepartmentController extends BaseController{
 
	@Autowired
	private IDepartmentServer mIDepartmentServer;
	
	
	@RequestMapping("addDepartment")
	public String addDepartment(Department mDepartment) throws Exception{
		
		int save = mIDepartmentServer.save(mDepartment);
		System.out.println(mDepartment.toString()+"--------------------");
		
	   return "admin/index";	
	}
	
	
	
}

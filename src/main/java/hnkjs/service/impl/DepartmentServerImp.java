package hnkjs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hnkjs.entities.Department;
import hnkjs.entities.PageBean;
import hnkjs.entities.Role;
import hnkjs.mapper.DepartmentMapper;
import hnkjs.service.IDepartmentServer;

public class DepartmentServerImp implements IDepartmentServer {
	
	@Autowired
	private DepartmentMapper mDepaertmentMapper;
	
	@Override
	public Department getEntityById(int id) {
		// TODO Auto-generated method stub
		return mDepaertmentMapper.getDepartmentById(id);
	}
	@Override
	public List<Department> getEntitiesByStr(String str) throws Exception {
		// TODO Auto-generated method stub
		return mDepaertmentMapper.geDepartmentesByStr(str);
	}
	
	
	@Override
	public List<Department> getEntitiesPage(PageBean<Department> page) {
		
		return mDepaertmentMapper.getDepartmentesByPage(page.getOffset(), page.getLimit(), page.getPresentstate());
	}

	@Override
	public int save(Department mDepartment) throws Exception {
		// TODO Auto-generated method stub
		return mDepaertmentMapper.addDepartment(mDepartment);
	}

	@Override
	public int modify(int id, Department t) throws Exception {
		// TODO Auto-generated method stub
		return mDepaertmentMapper.modifyDepartment(t);
	}
	
	@Override
	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return mDepaertmentMapper.deleteDepartmentById(id);
	}
	
	
	@Override
	public List<Role> getAllRoleById(int departmentId) {
		// TODO Auto-generated method stub
		return mDepaertmentMapper.getAllRoleById(departmentId);
	}

	@Override
	public List<Role> getAllRoleByDepartmentName(String departmentName) {
		// TODO Auto-generated method stub
		return mDepaertmentMapper.getAllRoleByDepartmentName(departmentName);
	}


	@Override
	public Department getEntityByStr(String str) {
		return mDepaertmentMapper.getDepartmentByStr(str);
	}


	@Override
	public List<Department> getEntities() throws Exception {
		// TODO Auto-generated method stub
		return  mDepaertmentMapper.getDepartmentes();
		
	}
	@Override
	public long getCount() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


	
	

}

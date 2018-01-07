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
	public Department getEntity(int id) {
		// TODO Auto-generated method stub
		return mDepaertmentMapper.getEntity(id);
	}
	

	@Override
	public List<Department> getEntities(String str) throws Exception {
		// TODO Auto-generated method stub
		return mDepaertmentMapper.getEntities(str);
	}
	
	@Override
	public List<Department> getEnntities(PageBean<Department> page, String orderType, String oderName) {
		// TODO Auto-generated method stub
		return mDepaertmentMapper.getEnntities(page, orderType, oderName);
	}

	@Override
	public int save(Department t) throws Exception {
		// TODO Auto-generated method stub
		return mDepaertmentMapper.save(t);
	}

	@Override
	public int modify(int id, Department t) throws Exception {
		// TODO Auto-generated method stub
		return mDepaertmentMapper.modify(id, t);
	}
	
	@Override
	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return mDepaertmentMapper.delete(id);
	}
	
	
	@Override
	public List<Role> getAllRoleById(int departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> getAllRoleByDepartmentName(String departmentName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Department getEntity(String str) {
		
		return mDepaertmentMapper.getEntityByname(str);
	}


	@Override
	public List<Department> getEntities() throws Exception {
		// TODO Auto-generated method stub
		return  mDepaertmentMapper.getEntity();
		
	}

	

}

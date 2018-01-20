package hnkjs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hnkjs.entities.Manager;
import hnkjs.mapper.ManagerMapper;
import hnkjs.service.IManagerService;

public class ManagerServiceImp implements IManagerService {

	@Autowired
	private ManagerMapper mManagerMapper;
	
	@Override
	public int addManager(Manager mManager) throws Exception {
		// TODO Auto-generated method stub
		return mManagerMapper.addManager(mManager);
	}

	@Override
	public int deleteManagerById(int id) throws Exception {
		
		return mManagerMapper.deleteManagerById(id);
	}

	@Override
	public int softdeleteManagerById(int id) throws Exception {
		// TODO Auto-generated method stub
		return mManagerMapper.softdeleteManagerById(id);
	}

	@Override
	public Manager queryOneManagerById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manager queryOneManagerByloginName(String loginname) {
		// TODO Auto-generated method stub
		return mManagerMapper.queryOneManagerByloginName(loginname);
	}

	
	@Override
	public List<Manager> queryAllManager(boolean presentstate) throws Exception {
		// TODO Auto-generated method stub
		return mManagerMapper.queryAllManager(presentstate);
	}

	@Override
	public List<Manager> queryAllManage(int pageIndex, int pageSize, boolean presentstate) throws Exception {
		//由于使用的Layui 的数据列表 使用的分页是从1开始的，而mysql 从0开始的,mysql limit 获取数据应该是
		if(pageIndex>0){
			pageIndex=(pageIndex-1)*pageSize;
		}
		return mManagerMapper.queryAllManage(pageIndex, pageSize, presentstate);
	}

	@Override
	public int recoverManager(int id) throws Exception {
		// TODO Auto-generated method stub
		return mManagerMapper.recoverManager(id);
	}

	@Override
	public int recoverManager(String loginname) throws Exception {
		// TODO Auto-generated method stub
		return mManagerMapper.recoverManager(loginname);
	}

	@Override
	public int modifyManager(int id, Manager mManager) throws Exception {
		// TODO Auto-generated method stub
		return mManagerMapper.modifyManager(id, mManager);
	}

	@Override
	public int modifyManagerPassword(int id, String oldPassword, String newloginpassword) throws Exception {
		// TODO Auto-generated method stub
		return  mManagerMapper.modifyManagerPassword(id, oldPassword, newloginpassword);
	}

	@Override
	public int modifyManagerPassword(int id, String newloginpassword) throws Exception {
		// TODO Auto-generated method stub
		return mManagerMapper.modifyManagerPassword(id, newloginpassword);
	}

}

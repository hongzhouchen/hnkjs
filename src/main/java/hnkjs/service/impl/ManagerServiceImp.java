package hnkjs.service.impl;

import java.util.List;

import hnkjs.entities.Manager;
import hnkjs.service.IManagerService;

public class ManagerServiceImp implements IManagerService {

	@Override
	public int addManager(Manager mManager) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteManagerById(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int softdeleteManagerById(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Manager queryOneManagerById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manager queryOneManagerByloginName(String loginname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manager> queryAllManager(boolean presentstate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manager> queryAllManage(int pageIndex, int pageSize, boolean presentstate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int recoverManager(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int recoverManager(String loginname) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyManager(int id, Manager mManager) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyManagerPassword(int id, String oldPassword, String newloginpassword) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyManagerPassword(int id, String newloginpassword) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}

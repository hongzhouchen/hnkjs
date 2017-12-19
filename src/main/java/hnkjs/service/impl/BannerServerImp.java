package hnkjs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hnkjs.entities.Banner;
import hnkjs.mapper.BannerMapper;
import hnkjs.service.IBannerServer;

public class BannerServerImp implements IBannerServer{

	@Autowired
	private BannerMapper mBannerMapper;
	
	public Banner selectOneImgById(int id) throws Exception {
		return mBannerMapper.selectOneImgById(id);
	}

	public List<Banner> selectAllBanner() throws Exception {
		return mBannerMapper.selectAllBanner();
	}

	public int addBanner(Banner mBanner) throws Exception {
		if(mBanner!=null){
			return mBannerMapper.addBanner(mBanner);
		}else{
			return 0;
		}
	}

	public int deleteBannerById(int id) throws Exception {
		Banner mBanner = mBannerMapper.selectOneImgById(id);
		if(mBanner!=null){
		   return mBannerMapper.deleteBannerById(id);
		}else {
			return 0;
		}
	}

	public int updataBanner(Banner mBanner) throws Exception {
		if(mBanner!=null){
			return mBannerMapper.updataBanner(mBanner);
		}else{
			return 0;
		}
	}

}

package hnkjs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import hnkjs.entities.Banner;
import hnkjs.service.IBannerServer;

@Controller
public class IndexController {

	@Autowired
	private IBannerServer mIBannerServer;
	
	@RequestMapping("/index")
	public String index(ModelMap mMap) throws Exception{
		Banner mBanner = mIBannerServer.selectOneImgById(1);
		System.out.println(mBanner);
		mMap.addAttribute("mBanner", mBanner);
		return "index";
	}
}

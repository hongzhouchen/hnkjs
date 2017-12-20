package hnkjs.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import hnkjs.constant.ImgServcerConstant;
import hnkjs.entities.Banner;
import hnkjs.service.IBannerServer;
import hnkjs.utils.ImgUploadUtils;

@RequestMapping("admin")
@Controller
public class BannerManageController {

	
	@Autowired
	private IBannerServer mIBannerServer;

	public String addOneBanner() throws Exception{
		return "";
	}
	
	
	@RequestMapping("/selectAllBanner")
	public String selectAllBanner(ModelMap map) throws Exception {
		List<Banner> BannerList = mIBannerServer.selectAllBanner();
		String resultMsg="";
		if (BannerList != null) {
			map.addAttribute("BannerList", BannerList);
			resultMsg = "成功获取了"+BannerList.size()+"条数据";
		} else {
			
			resultMsg = "没有数据";
		}
		map.addAttribute("resultMsg", resultMsg);
		return "admin/banner/bannerList";
	}

	@ResponseBody
	@RequestMapping("/deleteBanner")
	public String deleteBanner(int id) throws Exception {
		// 查出该条数据对象
		if (mIBannerServer.selectOneImgById(id) != null) {
			return mIBannerServer.deleteBannerById(id) + "";
		} else {
			return "0";
		}
	}

	/**
	 * 展示跟新界面
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/showUpdataBanner")
	public String showUpdataBanner(int id, ModelMap map) throws Exception {
		Banner banner = mIBannerServer.selectOneImgById(id);
		if (banner != null) {
			map.addAttribute("banner", banner);
		}
		return "admin/banner/bannerUpdata";
	}

	@RequestMapping("/updataBanner")
	public String updataBanner(@RequestParam("bannerimg") MultipartFile[] mfs, Banner mBanner, ModelMap map)throws Exception {
		String imgurl = ImgUploadUtils.OneImgUpLoad(mfs[0], ImgServcerConstant.hnkjsImgServer, ImgServcerConstant.truePicUrl, "BannerImg");
		if (imgurl != null || imgurl != "") {
			mBanner.setB_imgurl(imgurl);
		}
		int updataBanner = mIBannerServer.updataBanner(mBanner);
		if (updataBanner > 0) {
			return "redirect:/admin/selectAllBanner.action";
		} else {
			map.addAttribute("resultMsg", "修改失败");
			return "admin/banner/bannerUpdata";
		}
	}


}

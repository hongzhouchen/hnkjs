package hnkjs.mapper;

import java.util.List;

import hnkjs.entities.Banner;

public interface BannerMapper {
	/**
	 * 新增一张banner 图片
	 * 
	 * @param mBanner
	 *            上传的 banner对象
	 * @return 返回状态码
	 * @throws Exception
	 */
	public int addBanner(Banner mBanner) throws Exception;

	/**
	 * 根据 ID 删除 banner 对象
	 * 
	 * @param id
	 *            要删除的banner 对象的id
	 * @return 状态码
	 * @throws Exception
	 */
	public int deleteBannerById(int id) throws Exception;

	/**
	 * 根据ID 查询 banner 图对象
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Banner selectOneImgById(int id) throws Exception;

	/**
	 * 修改banner对象
	 * 
	 * @param mBanner
	 *            上传要修改后的banner 对象
	 * @return
	 * @throws Exception
	 */
	public int updataBanner(Banner mBanner) throws Exception;

	/**
	 * 查询所有的banner 图对象
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Banner> selectAllBanner() throws Exception;

}

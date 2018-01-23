package hnkjs.entities;

/**
 * 
 * @author: Charles
 * @date: 2018年1月19日 上午9:11:21
 * @version: v1.0.0
 * @Description: 文章实体
 */
public class Article extends BaseEntity {

	private int id;             // '主键，自增',
	private String title;       // '文章标题'(60字以内) ,
	private int typeid;         // '文章类型id',
	private int templateId;     // ' 模版id  (默认为1，后续功能扩展)',
	private int createtime;     // '发布时间 ',
	private int authorid;       // '文章作者id',
	private boolean wherefrom;  // '文章来源 （0:原创，1:转载）',
	private int sort;           //  文章排序（0为置顶，默认为1，数字越大，等级越低。）',
	private int state;          // '文章的状态（状态：0:未审核;1:审核中;2:审核通过;3:回收站)',
	private int a_explain;      // '文章描述 (可为空，一般是文章的前面一部分文字)',
	private String content;     // '文章内容 ',
	private String bannerurl;   // '文章外面展示的图片'
	private long lookcount;     //文章阅读量
	
	
	private String attachmenturl;
	private String attachmentname;
	
	public Article(){super();}
	
	
	
	public Article(int id, String title, int typeid, int templateId, int createtime, int authorid, boolean wherefrom,
			int sort, int state, int a_explain, String content, String bannerurl, long lookcount, String attachmenturl,
			String attachmentname) {
		super();
		this.id = id;
		this.title = title;
		this.typeid = typeid;
		this.templateId = templateId;
		this.createtime = createtime;
		this.authorid = authorid;
		this.wherefrom = wherefrom;
		this.sort = sort;
		this.state = state;
		this.a_explain = a_explain;
		this.content = content;
		this.bannerurl = bannerurl;
		this.lookcount = lookcount;
		this.attachmenturl = attachmenturl;
		this.attachmentname = attachmentname;
	}

	


	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", typeid=" + typeid + ", templateId=" + templateId
				+ ", createtime=" + createtime + ", authorid=" + authorid + ", wherefrom=" + wherefrom + ", sort="
				+ sort + ", state=" + state + ", a_explain=" + a_explain + ", content=" + content + ", bannerurl="
				+ bannerurl + ", lookcount=" + lookcount + ", attachmenturl=" + attachmenturl + ", attachmentname="
				+ attachmentname + "]";
	}



	public long getLookcount() {
		return lookcount;
	}
	public void setLookcount(long lookcount) {
		this.lookcount = lookcount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public int getTemplateId() {
		return templateId;
	}
	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}
	public int getCreatetime() {
		return createtime;
	}
	public void setCreatetime(int createtime) {
		this.createtime = createtime;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public boolean isWherefrom() {
		return wherefrom;
	}
	public void setWherefrom(boolean wherefrom) {
		this.wherefrom = wherefrom;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getA_explain() {
		return a_explain;
	}
	public void setA_explain(int a_explain) {
		this.a_explain = a_explain;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBannerurl() {
		return bannerurl;
	}
	public void setBannerurl(String bannerurl) {
		this.bannerurl = bannerurl;
	}
	public String getAttachmenturl() {
		return attachmenturl;
	}
	public void setAttachmenturl(String attachmenturl) {
		this.attachmenturl = attachmenturl;
	}
	public String getAttachmentname() {
		return attachmentname;
	}
	public void setAttachmentname(String attachmentname) {
		this.attachmentname = attachmentname;
	}
	
	
	
}

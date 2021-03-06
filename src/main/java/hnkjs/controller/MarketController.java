package hnkjs.controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MarketController {

	// 1号银 三大行情数据接口地址 沪银、t+d、伦敦银
	private static final String hyUrl = "http://www.1hy1hy.com/market/rating?tag=/priceIndex/shfe/agM";
	private static final String tdUrl = "http://www.1hy1hy.com/market/rating?tag=/priceIndex/sge/agTd";
	private static final String ldUrl = "http://www.1hy1hy.com/market/rating?tag=/priceIndex/lme/xag";

	/**
	 * 一号银
	 * 
	 * @param type
	 * @return
	 */
	@ResponseBody
	@RequestMapping("oneMarket")
	public String getMarketFrom1hy1hy(String type) {
		String myurl = "";
		if (type.equals("hy")) {
			myurl = hyUrl;
		} else if (type.equals("td")) {
			myurl = tdUrl;
		} else if (type.equals("ld")) {
			myurl = ldUrl;
		}
		// 创建URL对象
		URL url;
		try {
			url = new URL(myurl);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
			httpUrlConnection.setDoOutput(true);
			// 设置是否从httpUrlConnection读入，默认情况下是true;
			httpUrlConnection.setDoInput(true);
			httpUrlConnection.setRequestProperty("Accept-Charset", "ISO8859-1");
			// 设置文件类型:
			httpUrlConnection.setRequestProperty("contentType", "text/json");
			// Post 请求不能使用缓存
			httpUrlConnection.setUseCaches(false);
			httpUrlConnection.setRequestMethod("GET");
			httpUrlConnection.connect();
			InputStream inStrm = httpUrlConnection.getInputStream();
			String result = IOUtils.toString(inStrm);
			// 关闭连接
			inStrm.close();
			httpUrlConnection.disconnect();
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("*****************获取白银信息失败！***************");
		}
		return "";
	}

	@RequestMapping("entershsj")
	public String entershhj() {
		return "hq/shhj";
	}

	@ResponseBody
	@RequestMapping("shsj")
	public String getShanghaihuangjinHQ() throws Exception {
		URL url = new URL("http://www.sge.com.cn/hqsj");
		HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
		httpUrlConnection.setDoOutput(true);
		// 设置是否从httpUrlConnection读入，默认情况下是true;
		httpUrlConnection.setDoInput(true);
		httpUrlConnection.setRequestProperty("Accept-Charset", "ISO8859-1");
		// 设置文件类型:
		httpUrlConnection.setRequestProperty("contentType", "text/html");
		// Post 请求不能使用缓存
		httpUrlConnection.setUseCaches(false);
		httpUrlConnection.setRequestMethod("GET");
		httpUrlConnection.connect();
		InputStream inStrm = httpUrlConnection.getInputStream();
		String result = IOUtils.toString(inStrm,"utf-8");
		// 关闭连接
		inStrm.close();
		httpUrlConnection.disconnect();
		return result;
	}

	@ResponseBody
	@RequestMapping("quotations")
	public String quotations(HttpServletResponse response) throws Exception {
		URL url = new URL("http://www.sge.com.cn/graph/quotations");
		HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
		httpUrlConnection.setDoOutput(true);
		// 设置是否从httpUrlConnection读入，默认情况下是true;
		httpUrlConnection.setDoInput(true);
		httpUrlConnection.setRequestProperty("Accept-Charset", "ISO8859-1");
		// 设置文件类型:
		httpUrlConnection.setRequestProperty("contentType", "text/html");
		// Post 请求不能使用缓存
		httpUrlConnection.setUseCaches(false);
		httpUrlConnection.setRequestMethod("GET");
		httpUrlConnection.connect();  
		InputStream inStrm = httpUrlConnection.getInputStream();
		String result = IOUtils.toString(inStrm,"utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");// 转换成你需要接收字符的编码
		response.flushBuffer();
		// 关闭连接
		inStrm.close();
		httpUrlConnection.disconnect();
		return result;
	}

	@ResponseBody
	@RequestMapping("echartQuotations")
	public String echartQuotations(String instid, HttpServletResponse response) throws Exception {
		
		// 创建SSLContext对象，并使用我们指定的信任管理器初始化
		TrustManager[] tm = { new MyX509TrustManager() };//
		SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
		sslContext.init(null, tm, new java.security.SecureRandom());
		// 从上述SSLContext对象中得到SSLSocketFactory对象
		SSLSocketFactory ssf = sslContext.getSocketFactory();
		
		String myurl = "https://www.sge.com.cn/graph/quotations?instid="+instid;
		// 创建URL对象
		URL url = new URL(myurl);
		HttpsURLConnection httpUrlConnection = (HttpsURLConnection) url.openConnection();

		httpUrlConnection.setHostnameVerifier(new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		});
		httpUrlConnection.setSSLSocketFactory(ssf);
		httpUrlConnection.setDoOutput(true);
		// 设置是否从httpUrlConnection读入，默认情况下是true;
		httpUrlConnection.setDoInput(true);
		// 设置文件类型:
		httpUrlConnection.setRequestProperty("contentType", "json");
		/*httpUrlConnection.setRequestProperty("charset", "UTF-8");*/
		// Post 请求不能使用缓存
		httpUrlConnection.setUseCaches(false);
		httpUrlConnection.setRequestMethod("POST");
		httpUrlConnection.connect();
		InputStream inStrm = httpUrlConnection.getInputStream();
		String result = IOUtils.toString(inStrm,"utf-8");
		inStrm.close();
		httpUrlConnection.disconnect();
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/x-www-form-urlencoded;charset=utf-8");// 转换成你需要接收字符的编码
		response.flushBuffer();
		return result;
	}

	class MyX509TrustManager implements X509TrustManager {

		public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			// TODO Auto-generated method stub

		}

		public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			// TODO Auto-generated method stub

		}

		public X509Certificate[] getAcceptedIssuers() {
			// TODO Auto-generated method stub
			return null;
		}

	}

}

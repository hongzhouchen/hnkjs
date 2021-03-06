package hnkjs.shiro.realm;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import hnkjs.entities.Manager;
import hnkjs.service.IManagerService;
import hnkjs.service.IRoleManageServer;
import hnkjs.utils.CipherUtils;

public class ShiroRealm extends AuthorizingRealm  {

	private Logger logger = Logger.getLogger(ShiroRealm.class);

	@Autowired
	private IManagerService mIManagerService;
	@Autowired
    private IRoleManageServer  IRoleManageServer;
	
	/**
	 * 登录验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
			throws AuthenticationException {
		// 令牌
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		token.setRememberMe(true);
		// 获取
		logger.debug("用户名：" + token.getUsername() + ";密码:" + token.getPassword());
		// MD5加密
		CipherUtils cipher = new CipherUtils();
		Manager mManager = mIManagerService.queryOneManagerByloginName(token.getUsername());
		if (mManager == null) {
			throw new AuthenticationException();
		} else {
			return new SimpleAuthenticationInfo(mManager,cipher.generatePassword(mManager.getLogin_pass()) , getName());
		}
	}

	 /** 
     * 登陆成功之后，进行角色和权限验证 
     */  
    @Override  
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {  
        /*这里应该根据userName使用role和permission 的serive层来做判断，并将对应 的权限加进来，下面简化了这一步*/  
    	//String username = (String) getAvailablePrincipal(principals);
    	//IRoleManageServer
    	
    	Set<String> roleNames = new HashSet<String>();  
        Set<String> permissions = new HashSet<String>();  
        roleNames.add("admin");//添加角色。对应到index.jsp  
        roleNames.add("administrator");  
        permissions.add("create");//添加权限,对应到index.jsp  
        permissions.add("login.do?main");  
        permissions.add("login.do?logout");  
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleNames);  
        info.setStringPermissions(permissions);  
        return info;  
    }  
	
	

}

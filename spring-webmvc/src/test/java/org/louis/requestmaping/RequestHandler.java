package org.louis.requestmaping;

import java.lang.reflect.Method;

/**
 * @author John·Louis
 * @date created on 2020/2/24
 * description:
 */
public class RequestHandler {

	//映射的路径
	public String path;
	//方法GET、POST等
	public RequestMethod requestMethod;
	//类对象
	public Class clazz;
	//方法对象
	public Method method;
	//类的实例对象
	public Object instance;
	//是否需要身份验证
	public boolean isAuth;
}

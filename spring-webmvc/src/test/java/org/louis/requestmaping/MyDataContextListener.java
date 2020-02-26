package org.louis.requestmaping;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author John·Louis
 * @date created on 2020/2/24
 * description:
 */
public class MyDataContextListener implements ServletContextListener {

	private ServletContext context = null;

	public MyDataContextListener() {
	}

	//	在ServletContext启动之后被调用，并准备好处理客户端请求
	public void contextInitialized(ServletContextEvent event) {
		this.context = event.getServletContext();
//		通过你可以实现自己的逻辑并将结果记录在属性中
		context = setAttribute("myData", "this is myData");



	}


	private ServletContext setAttribute(String myData, String this_is_myData) {
		return null;
	}

	public void contextDestroyed(ServletContextEvent event) {
		this.context = null;
	}
}

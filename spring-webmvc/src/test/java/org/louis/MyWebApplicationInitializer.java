package org.louis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author John·Louis
 * @date created on 2020/2/24
 * description:
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {


	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfiguration.class);
		ac.refresh();

		DispatcherServlet servlet = new DispatcherServlet();
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/app/*");
	}
}

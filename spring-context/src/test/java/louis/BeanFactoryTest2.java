package louis;

import louis.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Eric
 * @date create in 2019/3/17
 */
public class BeanFactoryTest2  {

	/**
	 * 解决三个问题
	 *
	 */
	@Test
	public void testSimpleLoad() {

		long currentTime = System.currentTimeMillis();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
		long loadTime = System.currentTimeMillis();

		MyTestBean bean = applicationContext.getBean(MyTestBean.class);
		long endTime = System.currentTimeMillis();
		System.out.println("(get time " + (endTime - loadTime));
		System.out.println("(regist time) = " + (loadTime- currentTime));

		System.out.println(bean.getTestStr());
	}

	@Test
	public void test1() {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application.xml"));
		MyTestBean bean = factory.getBean(MyTestBean.class);

	}

	/**
	 * spring  applicationContext的注入过程
	 */
	@Test
	public void test2() {
//		AnnotationConfigApplicationContext 创建流程
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanConfiguration.class);
		context.refresh();
		MyTestBean myTestBean = context.getBean("myTestBean", MyTestBean.class);
//		myTestBean.test();

//		System.out.println(myTestBean.getTestStr());
	}
}
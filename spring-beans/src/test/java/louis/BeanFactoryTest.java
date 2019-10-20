package louis;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.DefaultDocumentLoader;
import org.springframework.beans.factory.xml.DocumentLoader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;


/**
 * @author Eric
 * @date create in 2019/3/17
 */
public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() {


		DefaultListableBeanFactory dlbf = new DefaultListableBeanFactory();
		loadBeanDefinition(dlbf);
		MyTestBean bean = dlbf.getBean("myTestBean", MyTestBean.class);
		System.out.println(dlbf.isSingleton("myTestBean"));
		assert "testStr".equals(bean.getTestStr());

	}

	private void loadBeanDefinition(DefaultListableBeanFactory beanFactory) {
		XmlBeanDefinitionReader xdr = new XmlBeanDefinitionReader(beanFactory);
		String[] configLocations = new String[]{"application.xml"};
		if (configLocations != null) {
			xdr.loadBeanDefinitions(configLocations);
		}


	}

	@Test
	public void test2() {

		Resource resource = new ClassPathResource("application.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		MyTestBean bean = bf.getBean("myTestBean", MyTestBean.class);
		System.out.println("bean = " + bean);
	}
	@Test
	public void test3() {
		DocumentLoader loader = new DefaultDocumentLoader();

	}

	@Test
	public void test4() {

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse("");
			NodeList bean = document.getElementsByTagName("bean");
			for (int i = 0; i < bean.getLength(); i++) {
				Node item = bean.item(i);
				if (Node.ELEMENT_NODE==item.getNodeType()) {
					Element element = (Element) item;
					NodeList nodeList = element.getElementsByTagName("");

				}
			}


		} catch (Exception e) {
			e.printStackTrace();
		}
	}




}

package louis;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lj125
 * @since 2020/9/8 15:59
 */
public class DeclareParentTest {

	@Test
	public void declareParentTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("louis");
		context.register(AopConfig.class);
		context.refresh();
		Person bean = context.getBean(Person.class);
		bean.sayIdentification();
	}


}

package louis;

import louis.MyTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author John·Louis
 * @date create in 2020/1/7
 * description:
 */
//@EnableAspectJAutoProxy
@Configuration
public class BeanConfiguration {

	@Bean
	public MyTestBean myTestBean() {
		return new MyTestBean();
	}

}

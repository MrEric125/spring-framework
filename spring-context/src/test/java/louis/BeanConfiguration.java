package louis;

import louis.MyTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author John·Louis
 * @date create in 2020/1/7
 * description:
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public MyTestBean myTestBean() {
		return new MyTestBean();
	}

}

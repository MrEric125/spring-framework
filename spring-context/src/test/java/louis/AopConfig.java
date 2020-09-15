package louis;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lj125
 * @since 2020/9/8 16:03
 */
//@EnableAspectJAutoProxy
@Configuration
//@Aspect
public class AopConfig {


	/**
	 * 简单来讲，加了这个注解，就能将我们制定的对象强转程某个接口
	 */
	@DeclareParents(value = "louis.Person+", defaultImpl = SkillImpl.class)
	public Skill sKill;

	@Bean
	public Person person() {
		return new Student();
	}
	@Bean
	public Skill skill() {
		return new SkillImpl();

	}
}

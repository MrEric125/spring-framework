package louis;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author jun.liu
 * @date created on 2020/9/5
 * description:
 */
@Aspect
public class AopAspect {



	@Pointcut("execution(* *.test(..))")
	public void pointCut() {

	}
	@Before("pointCut()")
	public void beforeTest(JoinPoint joinPoint) {
		System.out.println("before test"+joinPoint.getSignature().getName());
	}
	@After("pointCut()")
	public void afterTest(JoinPoint joinPoint) {
		System.out.println("after test"+joinPoint.getSignature().getName());
	}

	@AfterReturning("pointCut()")
	public void afterReturn(JoinPoint joinPoint) {
		System.out.println("after return"+joinPoint.getSignature().getName());
	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println(" before around "+joinPoint.getSignature().getName());
		Object proceed = joinPoint.proceed();
		System.out.println(" after around "+joinPoint.getSignature().getName());
		return proceed;

	}

}

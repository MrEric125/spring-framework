package louis.classloading;

/**
 * @author Eric
 * @date create in 2019/4/27
 *
 * 被动使用类型
 * 通过子类引用弗雷的静态字段，不会导致子类初始化
 */
public class SupperClass {
	static {
		System.out.println("this is supper class init");
	}

	public static final int value = 111;

	public static final String HELLOWORLD = "HELLO WORLLD";



}



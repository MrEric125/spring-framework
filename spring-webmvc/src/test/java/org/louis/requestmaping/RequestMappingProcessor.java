package org.louis.requestmaping;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author John·Louis
 * @date created on 2020/2/24
 * description:
 */
public class RequestMappingProcessor {

	public static Map<String, RequestHandler> requestHandlerMap = new ConcurrentHashMap<>();

	/**
	 * 扫描解析指定包下的@Controller,和RequestMapping
	 * @return
	 */
	public static Map<String,RequestHandler> scanRequestMapping() {


		return null;




	}
}

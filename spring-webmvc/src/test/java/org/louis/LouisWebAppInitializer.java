package org.louis;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @author John·Louis
 * @date created on 2020/2/24
 * description:
 */
public class LouisWebAppInitializer extends AbstractDispatcherServletInitializer {
	@Override
	protected WebApplicationContext createServletApplicationContext() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[0];
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		return null;
	}
}

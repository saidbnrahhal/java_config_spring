package com.working.examples.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;

import com.working.examples.service.BlogPostService;
import com.working.examples.service.impl.BlogPostServiceImp;

public class JavaConfig {
	/*
	 * to import other configuration classes you should add to the
	 * main java configuration class (the one called by the context) 
	 * @ComponentScan(basedPackages=("com.qls.java"))
	 * the classes of configuration that are not called 
	 * by the context loader should by annotated by
	 * @Configuration 
	 * other way to improt a java configuration class
	 * is to use the annotation @Import(value={ServiceConfig.class})
	 * on top of the main configuration class
	 * 
	 *  to more specific about your dependency injection you can use
	 *  @Bean(name="bla") in the declaration of the bean and
	 *  @Autowired
	 * 	@Qualifier("blabla") in the use
	 * 	
	 */
	
	
	
	@Bean//the bean default id is the the method name  
	public BlogPostService blogPostService() {

		return new BlogPostServiceImp();

	};

 }

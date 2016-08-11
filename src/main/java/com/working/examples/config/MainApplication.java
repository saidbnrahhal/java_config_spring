package com.working.examples.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.working.examples.domain.BlogPost;
import com.working.examples.service.BlogPostService;

public class MainApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//to get the bean you can also use the name of the method instead of the class name
		//this is can be  helpful if we have many method that instanced the same class as beans
		BlogPostService blogPostService = applicationContext.getBean(BlogPostService.class);
		BlogPost blogPost = new BlogPost();
		blogPost.setId(1L);
		blogPost.setTitle("spring mvc java config");
		blogPostService.savePost(blogPost);
		((ConfigurableApplicationContext) applicationContext).close();
	}
}

package com.working.examples.service.impl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.working.examples.domain.BlogPost;
import com.working.examples.service.BlogPostService;

public class BlogPostServiceImp implements BlogPostService {

	private static final Logger LOGGER =LoggerFactory.getLogger(BlogPostServiceImp.class);
	@Override
	public void savePost(BlogPost blogPost) {
		
		LOGGER.debug("BlogPostServiceImp : savePost is called");
		
	}

}

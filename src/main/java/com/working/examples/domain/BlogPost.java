package com.working.examples.domain;

import java.util.Date;

public class BlogPost {

	private Long id;
	
	private String title;
	
	private String content;
	
	private Date publishDate;
	
	private boolean draft ;

	public BlogPost() {
		
	}

	public String getContent() {
		return content;
	}

	public Long getId() {
		return id;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public String getTitle() {
		return title;
	}

	public boolean isDraft() {
		return draft;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDraft(boolean draft) {
		this.draft = draft;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	
}

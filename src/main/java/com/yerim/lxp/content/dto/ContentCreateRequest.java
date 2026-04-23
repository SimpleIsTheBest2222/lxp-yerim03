package com.yerim.lxp.content.dto;

import com.yerim.lxp.content.domain.ContentType;

public class ContentCreateRequest {
	private String title;
	private String body;
	private ContentType contentType;

	public ContentCreateRequest(String title, String body, ContentType contentType) {
		this.title = title;
		this.body = body;
		this.contentType = contentType;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public ContentType getContentType() {
		return contentType;
	}
}

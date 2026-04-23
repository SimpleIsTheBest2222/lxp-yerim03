package com.yerim.lxp.content.dto;

import com.yerim.lxp.content.domain.ContentType;

public class ContentUpdateRequest {
	private String title;

	public ContentUpdateRequest(String title, String body, ContentType contentType) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}

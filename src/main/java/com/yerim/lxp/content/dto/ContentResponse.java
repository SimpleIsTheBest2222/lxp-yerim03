package com.yerim.lxp.content.dto;

import java.time.LocalDateTime;

import com.yerim.lxp.content.domain.ContentType;

public class ContentResponse {
	private Long id;
	private String title;
	private String body;
	private ContentType contentType;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private int seq;

	public ContentResponse(Long id, String title, String body, ContentType contentType, LocalDateTime createdAt, LocalDateTime updatedAt, int seq) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.contentType = contentType;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.seq = seq;
	}

	public Long getId() {
		return id;
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public int getSeq() {
		return seq;
	}

}

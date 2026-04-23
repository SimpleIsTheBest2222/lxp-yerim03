package com.yerim.lxp.content.domain;

import java.time.LocalDateTime;

public class Content {
	private static final int MAXIMUM_TITLE_RANGE = 50;
	private static final int MAXIMUM_CONTENT_RANGE = 200;

	private Long id;
	private String title;
	private String body;
	private ContentType contentType;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private int seq;

	private Content() {}

	public static Content create(String title, String body, ContentType contentType) {
		Content content = new Content();
		content.title = validateTitle(title);
		content.body = validateBody(body);
		content.contentType = validateContentType(contentType);
		content.createdAt = LocalDateTime.now();
		content.updatedAt = LocalDateTime.now();
		return content;
	}

	public static Content createWithId(Long id, String title, String body, ContentType contentType) {
		Content content = new Content();
		content.id = id;
		content.title = validateTitle(title);
		content.body = validateBody(body);
		content.contentType = validateContentType(contentType);
		content.createdAt = LocalDateTime.now();
		content.updatedAt = LocalDateTime.now();
		return content;
	}

	public void update(String title, String body, ContentType contentType) {
		if (title != null) {
			this.title = validateTitle(title);
		}
		if (body != null) {
			this.body = validateBody(body);
		}
		if (contentType != null) {
			this.contentType = validateContentType(contentType);
		}
		this.updatedAt = LocalDateTime.now();
	}

	private static String validateTitle(String title) {
		if (title == null || title.isBlank()) {
			throw new IllegalArgumentException("제목은 필수 입력값입니다.");
		}
		if (title.length() > MAXIMUM_TITLE_RANGE) {
			throw new IllegalArgumentException("제목 길이는 최대 50 입니다.");
		}
		return title;
	}

	private static String validateBody(String body) {
		if (body == null || body.isBlank()) {
			throw new IllegalArgumentException("내용은 필수 입력값입니다.");
		}
		if (body.length() > MAXIMUM_CONTENT_RANGE) {
			throw new IllegalArgumentException("내용 길이는 최대 200 입니다.");
		}
		return body;
	}

	private static ContentType validateContentType(ContentType contentType) {
		if (contentType == null) {
			throw new IllegalArgumentException("컨텐츠 타입은 필수 입력값입니다.");
		}
		return contentType;
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
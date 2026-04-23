package com.yerim.lxp.content.service;

import com.yerim.lxp.content.domain.Content;
import com.yerim.lxp.content.dto.ContentCreateRequest;
import com.yerim.lxp.content.dto.ContentUpdateRequest;
import com.yerim.lxp.course.service.CourseRepository;

public class ContentService {
	private final ContentRepository contentRepository;

	public ContentService(ContentRepository contentRepository) {
		this.contentRepository = contentRepository;
	}

	public Content createContent(ContentCreateRequest contentCreateRequest) {
		return null;
	}

	public void getAllContents() {}

	public void getContentById(Long id) {}

	public void updateContent(Long id, ContentUpdateRequest contentUpdateRequest) {}

	public void deleteContent(Long id) {}
}
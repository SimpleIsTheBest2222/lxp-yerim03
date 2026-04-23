package com.yerim.lxp.content.controller;

import com.yerim.lxp.content.repository.InMemoryContentRepository;
import com.yerim.lxp.content.service.ContentService;
import com.yerim.lxp.content.view.ContentInputView;
import com.yerim.lxp.content.view.ContentOutputView;

public class ContentController {
	static ContentOutputView output = new ContentOutputView();
	static ContentInputView input = new ContentInputView();
	static ContentService contentService = new ContentService(new InMemoryContentRepository());

	private void createContent() {}

	private void getAllContents() {}

	private void getContentById() {}

	private void updateContent() {}

	private void deleteContent() {}
}

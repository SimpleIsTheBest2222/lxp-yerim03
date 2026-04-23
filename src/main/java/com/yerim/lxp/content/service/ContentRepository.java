package com.yerim.lxp.content.service;

import java.util.List;
import java.util.Optional;

import com.yerim.lxp.content.domain.Content;

public interface ContentRepository {
	Content save(Content content);

	Optional<Content> findById(Long id);

	List<Content> findAll();

	void deleteById(Long id);
}

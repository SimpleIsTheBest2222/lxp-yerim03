package com.yerim.lxp.content.repository;

import java.util.List;
import java.util.Optional;

import com.yerim.lxp.content.domain.Content;
import com.yerim.lxp.content.service.ContentRepository;

public class InMemoryContentRepository implements ContentRepository {
	@Override
	public Content save(Content content) {
		return null;
	}

	@Override
	public Optional<Content> findById(Long id) {
		return Optional.empty();
	}

	@Override
	public List<Content> findAll() {
		return List.of();
	}

	@Override
	public void deleteById(Long id) {

	}
}

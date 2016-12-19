package com.adictos.spring.cxf.movies.repository;

import java.util.List;

import com.adictos.spring.cxf.movies.model.Movie;

public interface MoviesRepository {
	
	Movie findById(final Long id);
	
	Movie save(final Movie movie);
	
	List<Movie> findAll();
	
	void delete(final Long id);
	
}

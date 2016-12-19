package com.adictos.spring.cxf.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adictos.spring.cxf.movies.model.Movie;
import com.adictos.spring.cxf.movies.repository.MoviesRepository;

@Service("moviesService")
public class MoviesServiceImpl implements MoviesService {

	@Autowired
	private MoviesRepository moviesRepository;
	
	@Override
	public Movie addMovie(final Movie movie) {
		return moviesRepository.save(movie);
	}

	@Override
	public void deleteMovie(final Long id) {
		moviesRepository.delete(id);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		return moviesRepository.save(movie);
	}

	@Override
	public Movie getMovie(final Long id) {
		return moviesRepository.findById(id);
	}

	@Override
	public List<Movie> getMovies() {
		return moviesRepository.findAll();
	}

}

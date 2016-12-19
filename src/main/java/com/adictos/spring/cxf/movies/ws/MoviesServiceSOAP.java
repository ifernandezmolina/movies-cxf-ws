package com.adictos.spring.cxf.movies.ws;

import java.util.List;

import javax.jws.WebService;

import com.adictos.spring.cxf.movies.model.Movie;

@WebService
public interface MoviesServiceSOAP {

	Movie addMovie(final Movie movie);
	
	void deleteMovie(final Long id);
	
	Movie updateMovie(final Movie movie);
	
	Movie getMovie(final Long id);
	
	List<Movie> getMovies();
	
}

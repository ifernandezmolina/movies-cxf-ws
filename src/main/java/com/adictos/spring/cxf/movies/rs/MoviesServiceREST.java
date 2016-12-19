package com.adictos.spring.cxf.movies.rs;


import java.util.List;

import com.adictos.spring.cxf.movies.model.Movie;

public interface MoviesServiceREST {
	
	Movie addMovie(final Movie movie);
	
	void deleteMovie(final Long id);
	
	Movie updateMovie(final Movie movie);
	
	Movie getMovie(final Long id);
	
	List<Movie> getMovies();
}

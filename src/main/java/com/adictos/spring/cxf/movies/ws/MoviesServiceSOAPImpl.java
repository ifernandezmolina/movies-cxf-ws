package com.adictos.spring.cxf.movies.ws;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adictos.spring.cxf.movies.model.Movie;
import com.adictos.spring.cxf.movies.service.MoviesService;

@Service("moviesServiceSOAP")
public class MoviesServiceSOAPImpl implements MoviesServiceSOAP {

	protected final Logger logger = Logger.getLogger(MoviesServiceSOAPImpl.class);
	
	@Autowired
	private MoviesService moviesService;
		
	public Movie addMovie(final  Movie movie) {
		if (logger.isDebugEnabled()) {
			logger.debug("'addMovie' called -> movie: " + movie.toString());
		}
		return moviesService.addMovie(movie);
	}

	public void deleteMovie(final Long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("'deleteMovie' called -> id: " + id);
		}
		moviesService.deleteMovie(id);
	}

	public Movie updateMovie(final Movie movie) {
		if (logger.isDebugEnabled()) {
			logger.debug("'updateMovie' called -> movie: " + movie.toString());
		}
		return moviesService.updateMovie(movie);
	}

	public Movie getMovie(final Long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("'getMovie' called -> id: " + id);
		}
		return moviesService.getMovie(id);
	}

	public List<Movie> getMovies() {
		if (logger.isDebugEnabled()) {
			logger.debug("'getMovies' called");
		}
		return moviesService.getMovies();
	}
	

}

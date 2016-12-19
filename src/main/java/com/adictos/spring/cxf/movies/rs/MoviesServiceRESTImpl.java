package com.adictos.spring.cxf.movies.rs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adictos.spring.cxf.movies.model.Movie;
import com.adictos.spring.cxf.movies.service.MoviesService;


@Path("movies")
@Service("moviesServiceREST")
public class MoviesServiceRESTImpl implements MoviesServiceREST {

	protected final Logger logger = Logger.getLogger(MoviesServiceRESTImpl.class);
	
	@Autowired
	private MoviesService moviesService;
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Movie addMovie(final Movie movie) {
		if (logger.isDebugEnabled()) {
			logger.debug("'addMovie' called -> movie: " + movie.toString());
		}
		return moviesService.addMovie(movie);
	}

	@DELETE
	@Consumes("application/json")
	@Produces("application/json")
	public void deleteMovie(final Long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("'deleteMovie' called -> id: " + id);
		}
		moviesService.deleteMovie(id);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public Movie updateMovie(final Movie movie) {
		if (logger.isDebugEnabled()) {
			logger.debug("'updateMovie' called -> movie: " + movie.toString());
		}
		return moviesService.updateMovie(movie);
	}

	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/{id}")
	public Movie getMovie(@PathParam("id") final Long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("'getMovie' called -> id: " + id);
		}
		
		return moviesService.getMovie(id);
	}

	@GET
	@Consumes("application/json")
	@Produces("application/json")
	public List<Movie> getMovies() {
		if (logger.isDebugEnabled()) {
			logger.debug("'getMovies' called");
		}
		return moviesService.getMovies();
	}

}

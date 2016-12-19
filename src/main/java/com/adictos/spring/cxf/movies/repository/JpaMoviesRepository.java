package com.adictos.spring.cxf.movies.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.adictos.spring.cxf.movies.model.Movie;

@Repository("moviesRepository")
public class JpaMoviesRepository implements MoviesRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Movie findById(final Long id) {
		return entityManager.find(Movie.class, id);
	}

	public Movie save(final Movie movie) {
		Movie result = movie;
		if (movie.getId() == null) {
			entityManager.persist(movie);
		} else {
			if (!entityManager.contains(movie)) {
				result = entityManager.merge(movie);
			}
		}
		return result;
	}

	public List<Movie> findAll() {
		Query query = entityManager.createQuery("SELECT id, title, director, year, synopsis FROM Movie");
		return (List<Movie>) query.getResultList();
	}

	public void delete(final Long id) {
		final Movie movie = this.findById(id);
		entityManager.remove(movie);
	}

}

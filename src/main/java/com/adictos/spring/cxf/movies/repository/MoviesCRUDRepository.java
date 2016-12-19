package com.adictos.spring.cxf.movies.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.adictos.spring.cxf.movies.model.Movie;

@Configuration
@EnableJpaRepositories
public interface MoviesCRUDRepository extends CrudRepository<Movie, Long> {
	
}

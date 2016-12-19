package com.adictos.spring.cxf.movies.model;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

public class MoviesTest {

	@Test
	public void shouldMarshalMoviesModel() throws JAXBException {

		Movies movies = new Movies();
		movies.setMovies(new ArrayList<Movie>());

		Movie movie1 = new Movie(1L, "movie 1", "director 1", 2016L, "xxxx");
		Movie movie2 = new Movie(2L, "movie 2", "director 2", 2016L, "xxxx");

		movies.getMovies().add(movie1);
		movies.getMovies().add(movie2);

		JAXBContext jaxbContext = JAXBContext.newInstance(Movies.class);
		Marshaller marshaller = jaxbContext.createMarshaller();

		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		marshaller.marshal(movies, System.out);

	}

	@Test
	public void shouldUnMarshalXMLFile() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Movies.class);
		Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();

		// We had written this file in marshalling example
		Movies movies = (Movies) unMarshaller.unmarshal(new File("src/test/resources/movies.xml"));

		for (Movie movie : movies.getMovies()) {
			System.out.println(movie.toString());
		}
	}

}

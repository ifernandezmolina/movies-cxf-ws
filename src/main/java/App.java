import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.adictos.spring.cxf.movies.model.Movie;
import com.adictos.spring.cxf.movies.model.Movies;

public class App {

	public static void main(String[] args) throws JAXBException {
		
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
	
}


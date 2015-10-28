import java.util.HashSet;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * The Class Customer.
 */
public class Customer {

	/** The name. */
	private String name;
	
	/** The movies. */
	private final Set<Movie> movies = new HashSet<Movie>();
	
	/** The max number of movies. */
	private final int maxNumberOfMovies = 5;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param pname the new name
	 */
	public final void setName(final String pname) {
		this.name = pname;
	}
	
	
	
	/**
	 * Instantiates a new customer.
	 *
	 * @param pname the pname
	 */
	public Customer(final String pname) {
		super();
		this.name = pname;
	}
	
	/**
	 * Loan movie.
	 *
	 * @param movie the movie
	 */
	public final void loanMovie(final Movie movie) {
		if (movie.getCustomer() == null) {
			if (this.movies.size() < maxNumberOfMovies) {
				this.movies.add(movie);
				movie.setCustomer(this);
				System.out.println("Film: " + movie.getTitle() 
				+ " erfolgreich von " + this.getName() + " ausgeliehen"); 
			} else {
				System.out.println("Kunde " + this.getName() 
				+ " hat schon fuenf Filme ausgeliehen!");
				} 
		} else {
				System.out.println("Film ist bereits an Kunden: "
						+ movie.getCustomer().getName() 
						+ " ausgeliehen!");
		}
	}
	
	/**
	 * Return movie.
	 *
	 * @param movie the movie
	 */
	public final void returnMovie(final Movie movie) {
		if (this.movies.contains(movie)) {
			if (movie.getCustomer().equals(this)) {
				movie.setCustomer(null);
				this.movies.remove(movie);
				System.out.println("Film: " + movie.getTitle() 
				+ " wurde zurueckgegeben");
			}
		}
	}
}

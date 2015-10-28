
import java.util.HashSet;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * The Class Movie.
 */

/**
 * @author Lars
 *
 */
public class Movie {

	/** The time. */
	private int time;
	
	/** The title. */
	private String title;
	
	/** The number. */
	private int number;
	
	/** The director. */
	private Director director;
	
	/** The next number. */
	//first Movie gets the number 0
	private static int nextNumber = 0;
	
	/** The performers. */
	private final Set<Performer> performers = new HashSet<Performer>();
	
	/** The customer. */
	private Customer customer = null;
	
	/**
	 * Gets the time.
	 *
	 * @return the time
	 */
	public final int getTime() {
		return time;
	}

	/**
	 * Sets the time.
	 *
	 * @param ptime the new time
	 */
	public final void setTime(final int ptime) {
		this.time = ptime;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public final String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param ptitle the new title
	 */
	public final void setTitle(final String ptitle) {
		this.title = ptitle;
	}
	
	/**
	 * Gets the number.
	 *
	 * @return the number
	 */
	public final int getNumber() {
		return number;
	}

	/**
	 * Gets the director.
	 *
	 * @return the director
	 */
	public final Director getDirector() {
		return director;
	}

	/**
	 * Sets the director.
	 *
	 * @param pdirector the new director
	 */
	public final void setDirector(final Director pdirector) {
		this.director = pdirector;
		pdirector.setNumberOfMovies(pdirector.getNumberOfMovies() + 1);
	}

	/**
	 * Gets the customer.
	 *
	 * @return the customer
	 */
	public final Customer getCustomer() {
		return customer;
	}

	/**
	 * Sets the customer.
	 *
	 * @param pcustomer the new customer
	 */
	public final void setCustomer(final Customer pcustomer) {
		this.customer = pcustomer;
	}

	/**
	 * Instantiates a new movie.
	 */
	public Movie() {
		super();
		this.number = nextNumber;
		nextNumber = nextNumber + 1;
	}
	
	/**
	 * Adds the performer.
	 *
	 * @param performer the performer
	 */
	public final void addPerformer(final Performer performer) {
		this.performers.add(performer);
		// Information that the performer has been added to the Movie
		System.out.println("Performer: " + performer.getFirstname()
							+ " " + performer.getLastname()
							+ " wurde zu Film: "
							+ this.getTitle() + " hinzugefügt");

	}
	
	/**
	 * In movie.
	 *
	 * @param performer the performer
	 * @return true, if successful
	 */
	public final boolean inMovie(final Performer performer) {
		final boolean inMovie =  this.performers.contains(performer);
		if (inMovie) {
			System.out.println("Performer: " + performer.getFirstname() 
								+ " " + performer.getLastname()
								+ " spielt im Film: "
								+ this.getTitle() + " mit.");
		}
		return inMovie;
	}
	
	/**
	 * Show all performers.
	 */
	public final void showAllPerformers() {
		if (!this.performers.isEmpty()) {
			System.out.println("Alle Performer im Film: " + this.getTitle());
			//final Iterator<Performer> it = performers.iterator();
			for (Performer p:performers) {
				
				System.out.println(p.getFirstname() + " " 
				+ p.getLastname());
			}
		}
	}
	
	/**
	 * Show all outstanding performers.
	 */
	public final void showAllOutstandingPerformers() {
		System.out.println("Alle hervorstechenden Performer:");
		for (Performer p:performers) {
			if (p.isOutstanding()) {
				System.out.println(p.getFirstname() + " " 
			+ p.getLastname());
			}
		}
	}
	
	/**
	 * Delete performer.
	 *
	 * @param performer the performer
	 */
	public final void deletePerformer(final Performer performer) {
		if (this.performers.contains(performer)) {
			final boolean deleted = this.performers.remove(performer);
			if (deleted) {
				System.out.println("Performer erfolgreich geloescht");
			} else {
				System.out.println("Beim Loeschen ist ein Fehler aufgetreten!");
			}
		}
	}

	/**
	 * Instantiates a new movie.
	 *
	 * @param ptime the ptime
	 * @param ptitle the ptitle
	 * @param pdirector the pdirector
	 */
	public Movie(final int ptime, final String ptitle, 
			final Director pdirector) {
		this();
		//this.number = nextNumber;
		//nextNumber = nextNumber + 1;
		this.time = ptime;
		this.title = ptitle;
		this.director = pdirector;
		pdirector.setNumberOfMovies(pdirector.getNumberOfMovies() + 1);
	}
	
	/**
	 * Show information.
	 */
	public final void showInformation() {
		System.out.println("Titel: " + this.title);
		System.out.println("Dauer: " + this.time);
		System.out.println("Nummer: " + this.number);
		System.out.println("Director: " + this.director.getFirstname() + " " 
		+ this.director.getLastname());
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie_1;
		movie_1 = new Movie();
		Director d = new Director();
		d.setFirstname("Joss");
		d.setGender(Gender.MALE);
		d.setLastname("Whedon");
		Movie movie_2 = new Movie(120,"Avatar",d);
		movie_1.setTime(90);
		movie_1.setTitle("Expendables");
		movie_2.showInformation();
		movie_1.showInformation();
	}
*/
}

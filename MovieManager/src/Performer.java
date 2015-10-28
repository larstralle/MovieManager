
// TODO: Auto-generated Javadoc
/**
 * The Class Performer.
 */
public class Performer {
	
	/** The firstname. */
	private String firstname;
	
	/** The lastname. */
	private String lastname;
	
	/** The gender. */
	private Gender gender;
	
	/** The movie. */
	private Movie movie;
	
	/** The outstanding. */
	// Performers aren´t outstanding by default
	private boolean outstanding = false;
	
	/**
	 * Gets the firstname.
	 *
	 * @return the firstname
	 */
	public final String getFirstname() {
		return firstname;
	}
	
	/**
	 * Sets the firstname.
	 *
	 * @param pfirstname the new firstname
	 */
	public final void setFirstname(final String pfirstname) {
		this.firstname = pfirstname;
	}
	
	/**
	 * Gets the lastname.
	 *
	 * @return the lastname
	 */
	public final String getLastname() {
		return lastname;
	}
	
	/**
	 * Sets the lastname.
	 *
	 * @param plastname the new lastname
	 */
	public final void setLastname(final String plastname) {
		this.lastname = plastname;
	}
	
	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public final Gender getGender() {
		return gender;
	}
	
	/**
	 * Sets the gender.
	 *
	 * @param pgender the new gender
	 */
	public final void setGender(final Gender pgender) {
		this.gender = pgender;
	}
	
	/**
	 * Gets the movie.
	 *
	 * @return the movie
	 */
	public final Movie getMovie() {
		return movie;
	}
	
	/**
	 * Sets the movie.
	 *
	 * @param pmovie the new movie
	 */
	public final void setMovie(final Movie pmovie) {
		this.movie = pmovie;
	}
	
	/**
	 * Checks if is outstanding.
	 *
	 * @return true, if is outstanding
	 */
	public final boolean isOutstanding() {
		return outstanding;
	}
	
	/**
	 * Sets the outstanding.
	 *
	 * @param poutstanding the new outstanding
	 */
	public final void setOutstanding(final boolean poutstanding) {
		this.outstanding = poutstanding;
	}
	
}

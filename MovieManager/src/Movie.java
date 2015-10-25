import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author Lars
 *
 */
public class Movie {

	private int time;
	private String title;
	private int number;
	private Director director;
	//first Movie gets the number 0
	private static int nextNumber = 0;
	private final HashSet<Performer> performers = new HashSet<Performer>();
	private Customer customer = null;
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNumber() {
		return number;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
		director.setNumberOfMovies(director.getNumberOfMovies() + 1);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/*
	 * Constructor without arguments
	 * */
	public Movie() {
		super();
		this.number = nextNumber;
		nextNumber = nextNumber + 1;
	}
	public void addPerformer(Performer performer) {
		this.performers.add(performer);
		// Information that the performer has been added to the Movie
		System.out.println("Performer: " + performer.getFirstname()
							+ " " + performer.getLastname()
							+ " wurde zu Film: "
							+ this.getTitle() + " hinzugefügt");

	}
	public boolean inMovie(Performer performer){
		final boolean inMovie =  this.performers.contains(performer);
		if (inMovie){
			System.out.println("Performer: " + performer.getFirstname() 
								+ " " + performer.getLastname()
								+ " spielt im Film: "
								+ this.getTitle() + " mit.");
		}
		return inMovie;
	}
	public void showAllPerformers(){
		if (!this.performers.isEmpty()){
			System.out.println("Alle Performer im Film: " + this.getTitle());
			final Iterator<Performer> it = performers.iterator();
			while (it.hasNext()){
				Performer performer = it.next();
				System.out.println(performer.getFirstname() + " " 
				+ performer.getLastname());
			}
		}
	}
	public void showAllOutstandingPerformers(){
		System.out.println("Alle hervorstechenden Performer:");
		final Iterator<Performer> it = performers.iterator();
		while (it.hasNext()){
			Performer performer = it.next();
			if (performer.isOutstanding()){
				System.out.println(performer.getFirstname() + " " 
			+ performer.getLastname());
			}
		}
	}
	public void deletePerformer(Performer performer){
		if (this.performers.contains(performer)){
			final boolean deleted = this.performers.remove(performer);
			if (deleted){
				System.out.println("Performer erfolgreich geloescht");}
			else {
				System.out.println("Beim Loeschen ist ein Fehler aufgetreten!");
			}
		}
	}

	/*
	 * Constructor with arguments for time and title
	 * */
	public Movie(int time, String title, Director director) {
		this();
		//this.number = nextNumber;
		//nextNumber = nextNumber + 1;
		this.time = time;
		this.title = title;
		this.director = director;
		director.setNumberOfMovies(director.getNumberOfMovies() + 1);
	}
	public void showInformation() {
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

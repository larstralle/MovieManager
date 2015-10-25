import java.util.HashSet;

public class Customer {

	private String name;
	final private HashSet<Movie> movies = new HashSet<Movie>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	/**
	 * @param name
	 */
	public Customer(String name) {
		super();
		this.name = name;
	}
	public void loanMovie(Movie movie){
		if (movie.getCustomer() == null){
			if (this.movies.size() < 5){
				this.movies.add(movie);
				movie.setCustomer(this);
				System.out.println("Film: " + movie.getTitle() + " erfolgreich von "
						+ this.getName() + " ausgeliehen");}
			else{
				System.out.println("Kunde " + this.getName() + " hat schon fuenf Filme ausgeliehen!");}}
		else{
			System.out.println("Film ist bereits an Kunden: " + movie.getCustomer().getName() 
					+ " ausgeliehen!");}
	}
	public void returnMovie(Movie movie){
		if(this.movies.contains(movie)){
			if(movie.getCustomer().equals(this)){
				movie.setCustomer(null);
				this.movies.remove(movie);
				System.out.println("Film: " + movie.getTitle() + " wurde zurueckgegeben");
			}
		}
	}
}

/**
 * 
 */
/**
 * @author Lars
 *
 */
public class MyFirstMovieManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Performer p1 = new Performer();
		p1.setFirstname("Robert");
		p1.setLastname("Downey jr.");
		p1.setGender(Gender.MALE);
		final Performer p2 = new Performer();
		p2.setFirstname("Scarlett");
		p2.setLastname("Johannson");
		p2.setGender(Gender.FEMALE);
		p2.setOutstanding(true);
		final Performer p3 = new Performer();
		p3.setFirstname("Jack");
		p3.setLastname("Black");
		p3.setGender(Gender.MALE);
		final Director d = new Director();
		d.setFirstname("Joss");
		d.setGender(Gender.MALE);
		d.setLastname("Whedon");
		final Movie m = new Movie(128, "Avengers, the",d);
		m.addPerformer(p1);
		m.addPerformer(p2);
		m.addPerformer(p3);
		m.showAllPerformers();
		m.showAllOutstandingPerformers();
		m.deletePerformer(p3);
		m.showAllPerformers();
		m.showInformation();
		final Customer c1 = new Customer("Max Mustermann");
		final Customer c2 = new Customer("Erika Musterfrau");
		final Movie m2 = new Movie(120, "Film 1", d);
		final Movie m3 = new Movie(120, "Film 2", d);
		final Movie m4 = new Movie(120, "Film 3", d);
		final Movie m5 = new Movie(120, "Film 4", d);
		final Movie m6 = new Movie(120, "Film 5", d);
		final Movie m7 = new Movie(120, "Film 6", d);
		c1.loanMovie(m);
		c2.loanMovie(m);
		c1.loanMovie(m2);
		c1.loanMovie(m3);
		c1.loanMovie(m4);
		c1.loanMovie(m5);
		c1.loanMovie(m6);
		c1.loanMovie(m7);
		c1.returnMovie(m);
		c2.loanMovie(m);
		c1.loanMovie(m6);
	}

}

import clase.*;
public class main {

	public static void main(String[] args) {
		// instantiere spectatori
		Spectator s1 = new Spectator("Gabriel Popescu");
		s1.setEmail("gabriel.popescu@gmail.com");
		s1.setTelefon("082312351231");
		
		Spectator s2 = new Spectator("Mircea Cartarescu");
		s1.setTelefon("082312351231");
		
		Spectator s3 = new Spectator("Marian Golan");
		s1.setEmail("golanul@marian.ro");
		
		// instantiere 3 spectacole - simple factory
		SpectacolTeatru spec1 = (SpectacolTeatru) SpectacolFactory.createShow("teatru", "O noapte furtunoasa");
		SpectacolStandup spec2 = (SpectacolStandup) SpectacolFactory.createShow("standup", "Show standup 1");
		SpectacolTeatru spec3 = (SpectacolTeatru) SpectacolFactory.createShow("teatru", "Visul unei nopti de vara");
		
		// atasare observatori - Observer pattern
		spec1.attachObserver(s1);
		spec1.attachObserver(s2);
		
		spec2.attachObserver(s3);
		spec2.attachObserver(s1);
		
		spec3.attachObserver(s2);
		
		// spectacolele incep - partea de notificare implica Chain of Responsability
		spec1.notifyObservers();
		spec2.notifyObservers();
		spec3.notifyObservers();
	}

}

package clase;

public class SpectacolFactory {
	
	public static ITipSpectacol createShow(String tip, String nume) {
		switch(tip) {
		case "teatru":
			System.out.println("Spectacolul de teatru " + nume + " a fost trecut in program");
			return new SpectacolTeatru(nume);

		case "standup":
			System.out.println("Spectacolul de stand-up comedy " + nume + " a fost trecut in program");
			return new SpectacolStandup(nume);
		}
		
		return null;
	}
}

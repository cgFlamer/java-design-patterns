package clase;

public class Spectator implements IObserver {

	private String name;
	private String telefon;
	private String email;
	
	public Spectator(String numeSpectator) {
		name = numeSpectator;
	}
	
	@Override
	public void update() {
		System.out.println("Spectatorul " + name + "  va fi notificat de inceperea spectacolului.");
		
		new SistemNotificare(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

package clase;

public class SpectacolStandup extends ASpectacol implements ITipSpectacol {

	public SpectacolStandup(String nume) {
		super(nume);
	}
	
	@Override
	public void afiseazaTipSpectacol() {
		System.out.println("stand-up");
	}

}

package clase;

public class SpectacolTeatru extends ASpectacol implements ITipSpectacol {

	public SpectacolTeatru(String nume) {
		super(nume);
	}
	
	@Override
	public void afiseazaTipSpectacol() {
		System.out.println("teatru");
	}
	
}

package clase;

public class SistemNotificare {

	INotificare first;
	
	private static SistemNotificare instance = null;
	
	private SistemNotificare() {
		first = new NotificareTelefon();
		INotificare email = new NotificareEmail();
		first.next(email);
	}
	
	public static SistemNotificare getInstance() {
		if(instance == null) {
			instance = new SistemNotificare();
		}
		return instance;
	}
	
	public void notifica(Spectator s) {
		first.notifica(s);
	}
}

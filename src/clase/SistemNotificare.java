package clase;

public class SistemNotificare {

	public SistemNotificare(Spectator s) {
		INotificare telefon = new NotificareTelefon();
		INotificare email = new NotificareEmail();
		telefon.next(email);
		
		telefon.notifica(s);
	}
}

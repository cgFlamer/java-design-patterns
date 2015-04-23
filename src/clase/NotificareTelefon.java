package clase;

public class NotificareTelefon implements INotificare {

	private INotificare next;
	
	@Override
	public void notifica(Spectator s) {
		if(s.getTelefon() != null) {
			System.out.println("Notificarea a fost trimisa prin telefon");
			return;
		} 

		if(next != null) {
			next.notifica(s);
		}
	}
	
	@Override
	public void next(INotificare n) {
		next = n;
	}

}

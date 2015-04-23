package clase;

public class NotificareEmail implements INotificare {

	private INotificare next;
	
	@Override
	public void notifica(Spectator s) {
		if(s.getEmail() != null) {
			System.out.println("Notificarea a fost trimisa prin email");
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

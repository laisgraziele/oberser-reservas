
public class Sistema {
	
	public static void main(String[] args) {
		
		//Observer
		
		Hotel hotel = new Hotel();
		
		//Observable
		
		Reservas reserva = new Reservas();
		
		//Observador e observado
		
		reserva.addObserver(hotel);
		reserva.criacao();
		reserva.alteracao();
		reserva.cancelamento();
		
		
		
	}

}

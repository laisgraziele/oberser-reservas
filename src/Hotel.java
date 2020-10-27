import java.util.Observable;
import java.util.Observer;

public class Hotel implements Observer, Notificacoes {

	@Override
	public void criacao() {
		
		System.out.println("Uma reserva criada!");
		
	}

	@Override
	public void alteracao() {

		System.out.println("Uma reserva alterada!");
		
	}

	@Override
	public void cancelamento() {
		
		System.out.println("Uma reserva cancelada!");
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		
		Reservas statusReservas = (Reservas)arg0;
		
		String acao = String.valueOf(arg1);
		
		if(acao.contentEquals("criada")) {
			this.criacao();
		}
		else if(acao.equals("alterada")) {
			this.alteracao();
		}
		else if(acao.equals("cancelada")) {
			this.cancelamento();
		}
	}

	public void addObserver(Reservas reserva) {
	
		
	}

}

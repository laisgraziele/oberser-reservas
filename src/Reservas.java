import java.util.Observable;

public class Reservas extends Observable implements Notificacoes {

	private String acao = "";
	
	@Override
	public void criacao() {
		acao="criada";
		System.out.println("Reserva foi criada!");
		this.mudaStatus();
		
	}

	@Override
	public void alteracao() {
		acao="alterada";
		System.out.println("Reserva foi alterada!");
		this.mudaStatus();
	}

	@Override
	public void cancelamento() {
		acao = "cancelada";
		System.out.println("Reserva foi cancelada!");
		this.mudaStatus();
		
	}
	
	public void mudaStatus() {
		
		setChanged();
		notifyObservers(acao);
	}

}

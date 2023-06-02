
public class CampaneRunnable implements Runnable {

	String nome;
	int partenza,fine;
		
	public CampaneRunnable(String nome, int partenza, int fine) {
		this.nome=nome;
		this.partenza=partenza;
		this.fine=fine;
	}
	
	public void run() {
		for (int i=partenza;i<fine;i++) {
			System.out.println(nome+ " " +i);
		}
	}
	}



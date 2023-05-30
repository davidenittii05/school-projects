
public class mainConto_Cliente {

	public static void main(String[] args) {
		Conto conto  = new Conto (200,"Conto di Davide");
		
		Cliente mamma = new Cliente (conto,true,50);
		Cliente papa = new Cliente (conto,true,50);
		Cliente figlio = new Cliente (conto,false,20);
		
		Thread tmamma = new Thread (mamma);
		Thread tpapa = new Thread (papa);
		Thread tfiglio = new Thread (figlio);
		
		tmamma.start();
		tpapa.start();
		tfiglio.start();

	}

}

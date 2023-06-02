
public class mainConto {

	public static void main(String[] args) {

		
		Conto conto = new Conto (300,"Davide");
		
		Cliente mamma = new Cliente (conto,true,90);
		Cliente papa = new Cliente (conto,true,90);
		Cliente figlio = new Cliente (conto,false,40);
		
		Thread tmamma = new Thread (mamma);
		Thread tpapa= new Thread (papa);
		Thread tfiglio= new Thread (figlio);
		
		tmamma.start();
		tpapa.start();
		tfiglio.start();
	}

}

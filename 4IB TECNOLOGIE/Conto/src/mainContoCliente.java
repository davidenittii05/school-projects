
public class mainContoCliente {

	public static void main(String[] args) {
		Conto conto = new Conto("Conto",3);
		
		Cliente mamma= new Cliente(conto,true);
		Cliente papa= new Cliente(conto,true);
		Cliente figlio= new Cliente (conto,false);
		
		
		Thread o1= new Thread(mamma);
		Thread o2= new Thread (papa);
		Thread o3=new Thread (figlio);
		
		 o1.start();
	     o2.start();
	     o3.start();

	}

}

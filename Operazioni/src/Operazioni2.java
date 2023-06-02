
public class Operazioni2 extends Thread{
	Operazioni dati;
	
	public Operazioni2 (Operazioni d) {
			dati=d;
	}
	
	public void run() {
		dati.ris2=3*(dati.b-2);
		System.out.println("Operazione ris2= " +dati.ris2);
	}

}
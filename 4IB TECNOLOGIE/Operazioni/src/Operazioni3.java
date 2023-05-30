
public class Operazioni3 extends Thread{
	Operazioni dati;
	
	public Operazioni3 (Operazioni d) {
			dati=d;
	}
	
	public void run() {
		dati.ris3=3*(dati.c-3);
		System.out.println("Operazione ris3= " +dati.ris3);
	}

}
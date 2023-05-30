
public class Operazioni4 extends Thread{
	Operazioni dati;
	
	public Operazioni4 (Operazioni d) {
			dati=d;
	}
	
	public void run() {
		dati.ris4=dati.ris2+dati.ris3;
		System.out.println("Operazione ris4= " +dati.ris4);
	}

}
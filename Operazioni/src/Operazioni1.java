
public class Operazioni1 extends Thread{
	Operazioni dati;
	
	public Operazioni1 (Operazioni d) {
			dati=d;
	}
	
	public void run() {
		dati.ris1=3*(dati.a-1);
		System.out.println("Operazione ris1= " +dati.ris1);
	}

}

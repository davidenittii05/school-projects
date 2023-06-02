
public class Operazioni5 extends Thread{
	Operazioni dati;
	
	public Operazioni5 (Operazioni d) {
			dati=d;
	}
	
	public void run() {
		dati.ris5=dati.ris1+dati.ris4;
		System.out.println("Operazione ris5= " +dati.ris5);
	}

}
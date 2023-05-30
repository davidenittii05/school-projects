
public class Espressione5 extends Thread {
	Espressione dati;
	
	public Espressione5 (Espressione d) {
		dati=d;
		
	}
	
	public void run() {
		dati.ris5=dati.ris4-10*dati.c;
		System.out.println("ris5 equivale a : " +dati.ris5);
	}
}

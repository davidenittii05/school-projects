
public class Espressione4 extends Thread {
	Espressione dati;
	
	public Espressione4(Espressione d) {
		dati=d;
	}
	
	public void run() {
		dati.ris4=5*dati.ris3;
		System.out.println("ris4 equivale a : " +dati.ris4);
	}
}

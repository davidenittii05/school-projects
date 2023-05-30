
public class Espressione3 extends Thread{
	Espressione dati;
	
	public Espressione3 (Espressione d) {
		dati=d;
	}
	
	public void run() {
		dati.ris3=dati.ris2*dati.ris1;
		System.out.println("ris3 equivale a :" +dati.ris3);
	}
}

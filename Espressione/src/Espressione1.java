
public class Espressione1 extends Thread{
	Espressione dati;
	
	public Espressione1 (Espressione d) {
		dati=d;
	}
	
	public void run() {
		dati.ris1=2*dati.a+4;
		System.out.println("ris1 equivale a " +dati.ris1);
	}
	
}

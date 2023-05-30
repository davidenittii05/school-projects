package threaddiversi;

public class threaddiversi1 extends Thread {

	 threaddiversi dati;
	 
	 public threaddiversi1 (threaddiversi d) {
		 dati=d;
	 }

	 public void run() {
		 dati.ris1=3*(dati.a-1);
		 
		 System.out.println("oprazione ris1= " +dati.ris1 );
	 }
}


public class Valutazioni3 extends Thread{
		Valutazioni dati;
		
		public Valutazioni3 (Valutazioni d) {
				dati=d;
		}
		
		public void run() {
			dati.ris3=dati.ris1*dati.ris2;
			System.out.println("ris5 equivale a " +dati.ris5);
		}
}

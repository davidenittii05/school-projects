
public class Valutazioni5 extends Thread {
		Valutazioni dati;
		
		public Valutazioni5 (Valutazioni d) {
			dati=d;
		}
		
		public void run() {
			dati.ris5=dati.ris4-(10*dati.c);
			System.out.println("ris5 equivale a " +dati.ris5);
		}
}

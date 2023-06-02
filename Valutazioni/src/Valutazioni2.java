
public class Valutazioni2 extends Thread {
		Valutazioni dati;
		
		public Valutazioni2(Valutazioni d) {
			dati=d;
		}
		
		public void run () {
			dati.ris2=(7*dati.b)+3;
			System.out.println("ris2 equivale a " +dati.ris2);
		}
}

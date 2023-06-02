
public class Valutazioni1 extends Thread {
		Valutazioni dati;
		
		public Valutazioni1 (Valutazioni d) {
			dati=d;
		}
			
			public void run() {
				dati.ris1=(2*dati.a)+4;
				System.out.println("il valore di ris1 è : " +dati.ris1);
			
		}
}

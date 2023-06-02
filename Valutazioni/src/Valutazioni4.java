
public class Valutazioni4 extends Thread{
		Valutazioni dati;
		
		public Valutazioni4 (Valutazioni d) {
			dati=d;
		}
			public void run() {
				dati.ris4=5*dati.ris3;
				System.out.println("ris4 equivale a " +dati.ris4);
			
		}
}

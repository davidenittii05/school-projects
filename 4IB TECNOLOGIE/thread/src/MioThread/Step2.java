package MioThread;
public class Step2 {
	public static void main(String[] args)  {
		// creo e istanzio l'oggetto 
		MioThread t1 = new MioThread("CIAO");
		MioThread t2 = new MioThread("A TUTTI");
		
		// richiama il metodo run dell'oggetto t1
		t1.start();
		
		// richiama il metodo run dell'oggetto t2
		t2.start();
		
	}
}
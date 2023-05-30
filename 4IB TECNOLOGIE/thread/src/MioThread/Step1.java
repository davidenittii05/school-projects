package MioThread;

public class Step1 {
	public static void main(String[] args)  {
		// creo e istanzio l'oggetto 
		MioThread t1 = new MioThread("CIAO");
		
		
		// richiama il metodo run dell'oggetto t1
		t1.start();
		
		
		// visualizza il nome del Thread corrente (viene assegnato dal sistema se manca)
		System.out.println(Thread.currentThread().getName());
		
		
		
		// visualizza il nome del Thread t1 e il suo stato
		System.out.println(t1.getName() + " "+ t1.getState());
		 
		
		System.out.println("------------------------------");
		
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0;i<5;i++) {
			System.out.println("main in esecuzione");
		} 
	
}
}
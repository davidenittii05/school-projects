package diversificaretjread;

public class MioThread extends Thread {
	

	private int numero;
	
	public MioThread(int numero, String name){
	super(name);
	this.numero=numero;
	
   /**
	 * Overidde del metodo run
     */
   public void run() {
		
		for(int i=0;i<5;i++) {

				if (numero%2==0) {
					numero = numero+2;
					System.out.println(getName() + " "+ numero);
					
					try {
						Thread.sleep(1000);
						}
						catch(InterruptedException e) {
						return;}
				}
		
		else {
			numero=numero+2;
			System.out.println(getName() + " "+ numero);
		}
		}
	
   
   }
}

// sottoclasse MioThread 
public class MioThread extends Thread {
	
	/**
	 * il costruttore della classe ThreadsOne
	 * sottoclasse di Thread
	 * @param name
	 */
	
	public MioThread(String name) {
		super(name);	
  	}
	
   /**
	 * Overidde del metodo run
     */
   public void run() {
		
		for(int i=0;i<3;i++) {
			System.out.println(getName() +" thread in esecuzione");
		}
	}
}
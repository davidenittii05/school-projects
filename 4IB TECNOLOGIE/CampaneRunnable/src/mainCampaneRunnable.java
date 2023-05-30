
public class mainCampaneRunnable {

	public static void main(String[] args) {
		//Thread t1 = new Thread (new CampaneRunnable("DIN",10,15));
		//Thread t2 = new Thread (new CampaneRunnable("DON",10,15));
		
		CampaneRunnable c1= new CampaneRunnable("Din",10,15);
		CampaneRunnable c2= new CampaneRunnable("Don",10,15);
		Thread t1 = new Thread (c1);
		Thread t2 = new Thread (c2);
		
		t1.start();
		t2.start();
		
	}

}

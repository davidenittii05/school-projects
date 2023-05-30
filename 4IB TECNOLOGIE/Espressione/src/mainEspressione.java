
public class mainEspressione {

	public static void main(String[] args) throws InterruptedException {
		
Espressione datio= new Espressione (2,3,4);
Espressione1 op1= new Espressione1 (datio);
Espressione2 op2 = new Espressione2 (datio);
Espressione3 op3= new Espressione3 (datio);
Espressione4 op4 = new Espressione4 (datio);
Espressione5 op5 = new Espressione5 (datio);

op1.start();
op2.start();
op1.join();
op2.join();
op3.start();
op3.join();
op4.start();
op4.join();
op5.start();
	}

}

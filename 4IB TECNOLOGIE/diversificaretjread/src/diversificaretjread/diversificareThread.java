package diversificaretjread;

public class diversificareThread extends MioThread{
	
	public static void main(String[] args) {
	
		MioThread t1 = new MioThread (100,"PARI");
		MioThread t2 = new MioThread (9,"DISPARI");
		
		t1.start();
		t2.start();
		



for(int i = 0;i<3;i++) {
	System.out.println(Thread.currentThread().getName());
}



	}	
}
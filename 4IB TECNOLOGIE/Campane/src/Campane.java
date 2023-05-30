
public class Campane  {

	public static void main(String[] args) {

		MioThread campane = new MioThread("DIN");
		MioThread campane2= new MioThread ("DON");
		
		campane.start();
		campane2.start();
		
		for(int i = 0;i<3;i++) {
		System.out.println(Thread.currentThread().getName());
	}
		}

}

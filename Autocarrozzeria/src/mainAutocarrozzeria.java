import java.util.Scanner;
public class mainAutocarrozzeria {

	public static void main(String[] args) throws InterruptedException{
		Scanner in = new Scanner(System.in);
		
		Auto auto = new Auto (4,2);
		
		Operaio o1= new Operaio(auto,"ceratura");
		Operaio o2 = new Operaio(auto,"lucidatura");
		
		o1.start();
		o2.start();
	}

}

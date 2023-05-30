package classeVectorString;
import java.util.Collections;
import java.util.Vector;
import java.util.Scanner;

public class classeVectorString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int dim = 5;
		Vector v = new Vector(dim);
		
		v.add("Giovanna");
		v.add("Alberto");
		v.add("Carmine");
		v.add("Giuseppe");
		v.add("Anna");
	
		
		v.remove("Alberto");
		System.out.println("dopo aver rimosso Alberto il vettore risulta : " +v);
		
		System.out.println("vettore normale " +v);
		v.set(0,new String("Gianna"));
		System.out.println("dopo aver invertito il nome di Giovanna Con Gianna il vettore risulta : " +v);

		System.out.println("situazione attuale del vettore " +v);
		System.out.println("questo vettore contiene il nome Anna?: " );
		System.out.println(v.contains("Anna"));
		
		System.out.println("E ora, quanti nomi ci sono nel vettore?" +dim);
}
}

package riempiopila;
import java.util.*;
public class riempiopila {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Stack <Integer> pila = new Stack <Integer> ();
		int i,dim;
		
		do {
			System.out.println("Inserire la dimensione della pila");
			dim = in.nextInt();
		} while (dim<1);
		
		for (i=1;i<dim+1;i++) {
			pila.push(i*2);
		}
		
		System.out.println("Pila: " +pila);
		
		while (!pila.isEmpty()) {
			pila.pop();
		}
		
		System.out.println("Pila: " +pila);
	}

}

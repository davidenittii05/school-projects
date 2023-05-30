package pilasimulazioneverifica;
import java.util.*;
public class pilasimulazioneverifica {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Stack <Integer> pila = new Stack <Integer> ();
		Stack <Integer> pila2 = new Stack <Integer> ();
		int i,puntata,vincita;
		
		System.out.println("inserire il valore dei puntata");
		puntata=in.nextInt();
		
		for (i=1;i<5;i++) {
			pila.push(i*2);
		}
		
		System.out.println("Pila1: " +pila);
		
		for (i=1;i<5;i++) {	
			if (pila.pop()>pila.peek()) {
				pila2.push(pila.pop());
			}
		}
	while(!pila2.isEmpty()) {
	for (i=1;i<4;i++) {
		pila2.pop();
	}
	}
	
	System.out.println("Pila1: " +pila);
	System.out.println("Pila2: " +pila2);
	
	
	vincita= puntata * pila2.pop();
	System.out.println("Il valore della vincita è di " +vincita);
	}

}

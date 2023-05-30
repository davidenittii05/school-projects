import java.util.*;
public class palindromapila {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Stack <Integer> pila = new Stack <Integer> ();
		Stack <Integer> pila2 = new Stack <Integer> ();
		Stack <Integer> pila3 = new Stack <Integer> ();
		int i,dim;
		boolean flag=false;
		
		do {
			System.out.println("inserire la dimensione della pila");
			dim=in.nextInt();
		}while(dim<1);
		
		for (i=1;i<dim+1;i++) {
			pila.push(i*2);
			pila2.push(i*2);
		}
		
		System.out.println("Pila1 : " +pila);
		System.out.println("Pila2 : " +pila2);
		System.out.println("Pila3 : " +pila3);
		
		while (!pila.isEmpty()) {
			pila3.push(pila.pop());
		}
		
		System.out.println("Pila1 : " +pila);
		System.out.println("Pila2 : " +pila2);
		System.out.println("Pila3 : " +pila3);
		
		for (i=1;i<dim+1;i++) {
			if(pila.pop().equals(pila3.pop())) {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.println("La sequenza di numeri è palindroma");
		} else {
			System.out.println("La sequenza di numeri non è palindroma");
		}
		}
		
	}



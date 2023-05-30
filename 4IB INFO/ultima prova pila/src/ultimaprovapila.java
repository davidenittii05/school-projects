import java.util.*;
public class ultimaprovapila {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Stack <Integer> pila1 = new Stack <Integer> ();
		Stack <Integer> pila2 = new Stack <Integer> ();
		Stack <Integer> pila3 = new Stack <Integer> ();
		
		int i,j,dim1,dim2;
		
		do {
			System.out.println("Inserire la dimensione della prima pila");
			dim1=in.nextInt();
		} while(dim1<1);
		
		do {
			System.out.println("Inserire la dimensione della seconda pila");
			dim2=in.nextInt();
		} while(dim2<1);
		
		for (i=1;i<dim1+1;i++ ) {
			pila1.push(i*2);
		}
		
		for (j=1;j<dim2+1;j++) {
			pila2.push(j*3);
		}
		
		System.out.println("Pila1: " +pila1);
		System.out.println("Pila2: " +pila2);
		System.out.println("Pila3: " +pila3);
		
		
		while (!pila1.isEmpty() && !pila2.isEmpty()) { 
			if (pila1.peek()>pila2.peek()) {
				pila3.push(pila1.pop());
			} else {
				pila3.push(pila2.pop());
			}
		}
		
		
		System.out.println("Pila1: " +pila1);
		System.out.println("Pila2: " +pila2);
		System.out.println("Pila3: " +pila3);
		
		while (!pila1.isEmpty()) {
			pila3.push(pila1.pop());
		}
		
		while (!pila2.isEmpty()) {
			pila3.push(pila2.pop());
		}
		System.out.println("Pila3 : " +pila3);
	}
	

}

package listaOrdinata;
import java.util.*;
public class listaOrdinata {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		LinkedList <Integer> lista1 = new LinkedList <Integer> ();
		LinkedList <Integer> lista2 = new LinkedList <Integer> ();
		int dim1,dim2;
		
		do {
			System.out.println("Inserire la dimensione della prima lista");
			dim1=in.nextInt();
		}while(dim1<1);
		
		do {
			System.out.println("Inserire la dimensione della seconda lista");
			dim2=in.nextInt();
		}while(dim2<1);
		
		
		for (int i=0;i<dim1;i++) {
			lista1.add(i+1);
		}
	
	
	for (int i=0;i<dim2;i++) {
		lista2.add(i+3);
	}
	
	System.out.println("lista1: " +lista1);
	System.out.println("lista2: " +lista2);
	
	while(lista1.isEmpty() && lista2.isEmpty()) {
		lista1.addAll(lista2);
	}
	
	System.out.println("lista1: " +lista2);
}
}
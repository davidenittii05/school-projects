import java.util.*;
public class c3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Queue <Integer> coda1 = new LinkedList <> ();
		Queue <Integer> coda2 = new LinkedList <> ();
		Queue <Integer> coda3 = new LinkedList <> ();
		Stack <Integer> pila1 = new Stack <Integer> () ;
		int i, dim1,dim2,v1,v2;
		
		do {
			System.out.println("Inserire la dimensione");
			dim1=in.nextInt();
		}while (dim1<1);
		
		dim2=dim1/2;
		System.out.println("La dimensione della seconda coda è di: " +dim2);
		
		for (i=0;i<dim1;i++) {
			System.out.println("Inserire il valore nella prima coda");
			v1=in.nextInt();
			coda1.add(v1);
		}
		
		for (i=0;i<dim2;i++) {
		System.out.println("Inserire il valore nella seconda coda");
		v2=in.nextInt();
		coda2.add(v2);
	}
		
		for (i=0;i<dim1/2;i++) {
			coda3.add(coda1.poll());
		}
		
		while(!coda2.isEmpty()) {
			coda3.add(coda2.poll());
		}
		
		while (!coda1.isEmpty()) {
			coda3.add(coda1.poll());
		}
		
		System.out.println("Coda1: " +coda1);
		System.out.println("Coda2: " +coda2);
		System.out.println("Coda3: " +coda3);
		
		while (!coda3.isEmpty()) {
			pila1.push(coda3.poll());
		}
		while (!pila1.isEmpty()) {
			coda3.add(pila1.pop());
		}
		
		System.out.println("Coda3 invertita: " +coda3);
	}
}

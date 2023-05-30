import java.util.*;
public class c2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Queue <Integer> coda1 = new LinkedList <> ();
		Queue <Integer> coda2 = new LinkedList <> ();
		Queue <Integer> coda3 = new LinkedList <> ();
		 int dim1,dim2,i,v1,v2;
		do {
			System.out.println("Inserire la dimensione della coda1");
			dim1=in.nextInt();
		}while (dim1<1);
		
		do {
			System.out.println("Inserire la dimensione della coda2");
			dim2=in.nextInt();
		}while(dim2<1 || dim2==dim1);
		
		for (i=0;i<dim1;i++) {
			System.out.println("Inserisci il valore");
			v1=in.nextInt();
			coda1.add(v1);
		}
		
		for (i=0;i<dim2;i++) {
			System.out.println("Inserire il valore");
			v2=in.nextInt();
			coda2.add(v2);
		}
		
		while (!coda1.isEmpty() && !coda2.isEmpty()) {
			coda3.add(coda1.poll());
			coda3.add(coda2.poll());
		}
		
		while (!coda1.isEmpty()) {
			coda3.add(coda1.poll());
		}
		
		while(!coda2.isEmpty()) {
			coda3.add(coda2.poll());
		}
		
		System.out.println("Coda1: " +coda1 );
		System.out.println("Coda2: " +coda2 );
		System.out.println("Coda3: " +coda3 );
	}

}

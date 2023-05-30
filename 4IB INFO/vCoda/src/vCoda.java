import java.util.*;
public class vCoda {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Queue <Integer> coda1 = new LinkedList <>();
		Queue <Integer> coda2 = new LinkedList <>();
		Queue <Integer> coda3= new LinkedList <> ();
		int i,dim1,dim2,v1,v2,totale=0;
		
		do {
			System.out.println("La dimensione della prima coda: ");
			dim1=in.nextInt();
		}while(dim1<2);
		
		do {
			System.out.println("La dimensione della seconda coda: ");
			dim2=in.nextInt();
		}while(dim2>dim1);
		
		for (i=0;i<dim1;i++) {
			System.out.println("inserire il valore nella coda1");
			v1=in.nextInt();
			while(v1!=5 && v1!=10 && v1!=20 && v1 !=50 && v1!=100 && v1!=200) {
				System.out.println("Valore non valido, inserirne un altro");
				v1=in.nextInt();
			}
			coda1.add(v1);
		}
		
		for (i=0;i<dim2;i++) {
			System.out.println("Inserire il valore della seconda coda");
			v2=in.nextInt();
			while(v2!=5 && v2!=10 && v2!=20 && v2 !=50 && v2!=100 && v2!=200) {
				System.out.println("Valore non valido, inserirne un altro");
				v2=in.nextInt();
			}
			coda2.add(v2);
		}
		
		while (!coda1.isEmpty() && !coda2.isEmpty()) {
			if (coda1.peek() > coda2.peek()) {
				coda3.add(coda1.poll());
			} else if (coda2.peek() > coda1.peek()) {
				coda3.add(coda2.poll());
			}
		}
		
		while (!coda1.isEmpty()) {
			coda3.add(coda1.poll());
		}
		
		while (!coda2.isEmpty()) {
			coda3.add(coda2.poll());
		}
		
		System.out.println("coda1: " +coda1);
		System.out.println("coda2: " +coda2);
		System.out.println("coda3: " +coda3);
		
		
		for (i=0;i<dim1+dim2;i++) {
			totale=totale+coda3.poll();
		}
		System.out.println("Il totale è di: " +totale);
		
		
	}

}


import java.util.*;
public class v1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Queue <Integer> coda1= new LinkedList <> ();
		Queue <Integer> coda2= new LinkedList <> ();
		Queue <Integer> coda3= new LinkedList <> ();
		Queue <Integer> coda4= new LinkedList <> ();
		int dim1,i,v1;
		do {
			System.out.println("Inserire la dimensione");
			dim1=in.nextInt();
		}while(dim1!=21);
		
		v1=9;
		for(i=0;i<dim1;i++) {
			v1=v1+1;
			coda1.add(v1);
		}
		
		System.out.println("Coda1: " +coda1);
		
		while(!coda1.isEmpty()) {
			if (coda1.peek()%2==0) {
				coda2.add(coda1.poll());
			} else {
				coda3.add(coda1.poll());
			}
			}
		
		System.out.println("Coda2: " +coda2);
		System.out.println("Coda3: " +coda3);
		
		for (i=0;i<coda3.size();i++) {
			if (coda3.peek()%3==0 && coda3.peek()%5==0) {
				coda3.poll();
			} else {
				coda4.add(coda3.poll());
			}
		}
		
		System.out.println("Coda3: " +coda3);
		System.out.println("Coda4: " +coda4);
		
	}

}

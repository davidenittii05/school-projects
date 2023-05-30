import java.util.*;
public class c1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Queue <Integer> coda1 = new LinkedList <> ();
		Queue <Integer> coda2 = new LinkedList <> ();
		Queue <Integer> coda3 = new LinkedList <> ();
        int i,dim,v1,sommaP=0,sommaN=0,mediaN,mediaP,coda2size, vAssMediaP, vAssMediaN,coda3size;
        
        do {
        	System.out.println("Inserire la dimensione della coda");
        	dim=in.nextInt();
        }while(dim<1);
        
        for (i=0;i<dim;i++) {
        	System.out.println("Inserire il valore");
        	v1=in.nextInt();
        	coda1.add(v1);
        }
        
        System.out.println("Coda1. " +coda1);
        
        while (!coda1.isEmpty()) {
        	if (coda1.peek()>=0) {
        		coda2.add(coda1.poll());
        	} else if (coda1.peek()<0) {
        		coda3.add(coda1.poll());
        	}
        }
        System.out.println("Coda1. " +coda1);
        System.out.println("Coda2. " +coda2);
        System.out.println("Coda3. " +coda3);
         
        
        coda2size=coda2.size();
        while (!coda2.isEmpty()) {
        	sommaP=sommaP+coda2.poll();
        }
        mediaP=sommaP/coda2size;
        System.out.println("La media dei valori all'interno della coda2 è: " +mediaP);
        
         coda3size=coda3.size();
         while (!coda3.isEmpty()) {
        	 sommaN=sommaN+coda3.poll();
         }
         mediaN=sommaN/coda3size;
         System.out.println("La media dei valori all'interno della coda3 è: " +mediaN);

         vAssMediaP= Math.abs(mediaP);
         vAssMediaN= Math.abs(mediaN);
         
         if (vAssMediaP>vAssMediaN) {
        	 System.out.println("Il valore assoluto della MediaP è maggiore rispetto a quello della MediaN");
         } else if (vAssMediaN>vAssMediaP) {
        	 System.out.println("Il valore assoluto della MediaN è maggiore rispetto a quello della MediaP");

         }
		}

}
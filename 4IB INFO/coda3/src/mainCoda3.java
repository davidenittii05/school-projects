import java.util.*;
public class mainCoda3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Queue <Prodotto> coda1 = new LinkedList <Prodotto> ();
		Stack <Integer> pila1 = new Stack <Integer> ();
		int i,dim,quantita,somma=0;
		double costo;
		
		do {
			System.out.println("Quanto è il numero di prodotti");
			dim=in.nextInt();
		}while(dim<1);
		
		for (i=0;i<dim;i++) {
			System.out.println("Inserire il numero di prodotti acquistati");
			quantita=in.nextInt();
			System.out.println("Inserire il costo del prodotto");
			costo=in.nextInt();
			somma=(int) (somma+costo);
		}
		
		System.out.println("La somma finale è di: " +somma);
		
		
		
	}

}

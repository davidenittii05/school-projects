package lista;
import java.util.*;
public class lista {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		LinkedList <Integer> lista = new LinkedList <Integer>();
		
		int i,N,elemento;
		
		do {
			System.out.println("Inserisci il numero di valori all'interno della lista");
			N=in.nextInt();
		}while(N<1);
		
		for (i=0;i<N;i++) {
			lista.add(i+1);
		}
		
		System.out.println("Lista " +lista);
		
		System.out.println("Inserisci l'eemento all'interno della lista");
		elemento=in.nextInt();
		lista.add(elemento);
		System.out.println("Lista " +lista);
	}

}

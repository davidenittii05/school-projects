package listaAggiungiNumero;
import java.util.*;
public class listaRimuoviNumero {

	public static void main(String[] args) {
		ArrayList <Integer> lista = new ArrayList <>();
		Scanner in = new Scanner (System.in);
		int elemento,i=0;
		
		lista.add(1);
		lista.add(3);
		lista.add(5);
		lista.add(7);
		lista.add(9);
		
		System.out.println("Inserire il numero da eliminare");
		elemento=in.nextInt();
		
		boolean controllo=false;
		while (i<lista.size()) {
			if (lista.get(i)==elemento) {
				lista.remove(i);
				controllo=true;
			} else {
				i++;
			}
		}
		
		if(controllo==true) {
			System.out.println("Il valore è stato eliminato");
		}else {
			System.out.println("Il numero non è presente nella lista");
		}
		
		System.out.println("Lista: " +lista);
		

	}

}

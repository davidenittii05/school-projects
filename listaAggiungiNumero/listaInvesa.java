package listaAggiungiNumero;
import java.util.*;
public class listaInvesa {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		ArrayList <Integer> lista = new ArrayList <>();
		Stack <Integer> pila = new Stack <>();
		
		lista.add(1);
		lista.add(3);
		lista.add(5);
		lista.add(7);
		lista.add(9);
		
		System.out.println("Lista: " +lista);
		
		while(!lista.isEmpty()) {
			pila.push(lista.remove(0));
		}
		
		while(!pila.isEmpty()){
			lista.add(pila.pop());
		}
		
		System.out.println("Lista rovesciata: " +lista);
	}

}

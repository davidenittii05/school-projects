package listaAggiungiNumero;
import java.util.*;
public class listaAggiungiNumero {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList <Integer> lista = new ArrayList <>();
		int elemento,i=0;
		
		lista.add(1);
		lista.add(3);
		lista.add(5);
		lista.add(7);
		lista.add(9);
	
		System.out.println("aggiugni elemento");
		elemento=in.nextInt();
		lista.add(elemento);
		
		System.out.println("lista con elemento aggiunto: " +lista);
		
	while (i<lista.size() && elemento>lista.get(i)) {
		i++;
	}
	lista.add(i,elemento);
	System.out.println("Lista ordinata: " + lista);
	}

}

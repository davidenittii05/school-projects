package lista1;
import java.util.*;
public class lista1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		LinkedList <Integer> lista1 = new LinkedList<>();
		int elemento,capacita,i=0;
		lista1.add(10);
		lista1.add(25);
		lista1.add(30);
		lista1.add(41);
		System.out.println("visualizzazione lista : " +lista1);
		
		do {
		System.out.println("Inserire l'elemento per la lista");
		elemento=in.nextInt();
		}while(elemento<0);
		
		capacita=lista1.size();
		
		while(i<capacita) {
			if(elemento<lista1.get(i)) {
				lista1.add(elemento,i);
			}
			i=i+1;
		}
		
		System.out.println("seconda visualizzazione lista : " +lista1);

	}

}
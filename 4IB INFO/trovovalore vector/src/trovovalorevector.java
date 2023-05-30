import java.util.*;
public class trovovalorevector {
	
	public static void main(String[] args) {
		
	
	Scanner in = new Scanner (System.in);
	int dim;
	do {
		System.out.println("inserire la dimensione");
		 dim = in.nextInt();
	} while(dim<1);

	Vector v = new Vector(dim);

	for(int i=0; i<dim; i++) {
	System.out.println("inserire il "+(i+1)+"°  elemento");
	v.add(in.nextInt());
	}

	System.out.println("Il vettore contiene l'elemento '5'?" +v.contains(5));
	System.out.println("Il vettore contiene l'elemento '7'?" +v.contains(7));
	System.out.println("Il vettore contiene l'elemento '80'?" +v.contains(80));
	System.out.println("Il vettore contiene l'elemento '21'?" +v.contains(21));


	int vCercato,i, j;
	
	
	do {
		System.out.println("Inserire il valore da cercare");
		vCercato = in.nextInt();
	}while(vCercato < 1 || vCercato > 10);
	
	i = 0;
	j = 0;
	
	for(i=0; i<dim; i++) {
		if( (int) v.get(i) == vCercato) {
			j++;
		}
	}
	if (j != 0) {
		System.out.println("Il valore "+vCercato+" è presente nel vettore "+j+" volte");
	}else {
		System.out.println("Il valore cercato non è presente nel vettore");
	}
}


}

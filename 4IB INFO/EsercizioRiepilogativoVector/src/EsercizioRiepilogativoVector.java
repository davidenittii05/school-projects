import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
public class EsercizioRiepilogativoVector {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int dim=12, i, auto, somma, media, meseMax, iMeseMax, iCento;
		boolean flag;
		
		Vector vett= new Vector(dim);
		
		for(i=0; i<dim; i++) {
			do {
				System.out.println("Inserire il numero di auto vendute il "+(i+1)+"° mese");
				auto=in.nextInt();
				vett.add(auto);
			} while(auto<0);
		}
		
		somma=0;
		for(i=0; i<dim; i++) {
			somma=somma+(int)vett.get(i);
		}
		media=somma/dim;
		
		meseMax=(int)vett.get(0);
		iMeseMax=0;
		iCento=0;
		for(i=0; i<dim; i++) {
			if((int)vett.get(i)>meseMax) {
				meseMax=(int)vett.get(i);
				iMeseMax=i;
			}
			
			if((int)vett.get(i)==100) {
				iCento=iCento+1;
			}
		}
		
		flag=vett.contains(media);
		
		Collections.sort(vett);
		
		System.out.println(vett.toString());
		System.out.println("Il mese in cui sono state vendute più auto è il numero "+(iMeseMax+1));
		System.out.println("Il numero massimo di auto vendute è: "+vett.get(dim-1));
		System.out.println("Il numero minimo di auto vendute è: "+vett.get(0));
		System.out.println("Il numero di mesi in cui sono state vendute 100 auto è "+iCento);
		System.out.println("Vi è almeno un mese in cui sono state vendute auto per un numero pari alla media dell’anno? "+flag);

	}

}

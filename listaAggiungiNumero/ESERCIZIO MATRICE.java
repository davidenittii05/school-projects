package matrice2;
import java.util.*;
public class matrice2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int f,i,j = 0,righe,colonne,centro,inizio,dimensioneVettore,fine;
		boolean booleanMare;
		String min,max,scambio,somma,vCercato,parolaMare;
		do {
		System.out.println("inserire i numero delle righe");
		righe=in.nextInt();
		}while(righe<1);

		do {
		System.out.println("inserire i numero delle colonne");
		colonne=in.nextInt();
		}while(colonne<1);

		String[][] matrice= new String [righe][colonne];
		
		for(i=0;i<righe;i++) {
			for(j=0;j<colonne;j++) {
				System.out.println("inserire l'elemento di riga " +i+ " e colonna " +j);
				matrice[i][j]=in.next();
			}

		
		max=matrice[0][0];
		min=matrice[0][0];

		for(i=0;i<righe;i++) {
		for(j=0;j<colonne;j++) {
		if(matrice[i][j].toLowerCase().compareTo(max)>0) {
			max=matrice[i][j];
			} else if (matrice[i][j].toLowerCase().compareTo(min)<0) {
				min=matrice[i][j];
		}
		}
		}

		System.out.println("la prima parola in ordine alfabetico è : " +min);
		System.out.println("l'ultima parola in ordine alfabetico è : " +max);

		
		f=0;
		for(i=0;i<righe;i++) {
			for(j=0;j<colonne;j++) {
				if(matrice[i][j].toLowerCase().equals("lago")) {
					f++;
				}
			}
			}
		
		if(f!=0) {
			System.out.println("la parola lago è presente nella matrice ben " +f+ " volte");
		} else {
			System.out.println("la parola lago non è presente nella matrice ");
		}
		
		boolean flag=false;
		for(i=0;i<righe && !flag ;i++) {
			for(j=0;j<colonne && !flag;j++) {
				if(matrice[i][j].toLowerCase().equals("mare")) {
					flag=true;
				}
			}
		
		}
		if(flag) {
			System.out.println("la parola mare è presente nella matrice ");
		} else {
			System.out.println("la parola mare non è presente nella matrice ");
		}
		
	} 
		
		
	}
}


		
		
			
		
	



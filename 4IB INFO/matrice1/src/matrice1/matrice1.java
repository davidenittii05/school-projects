package matrice1;
import java.util.*;

public class matrice1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m,n,somma,media;
		int matrice [][]=  new int [3][4];
		
		for(m=0;m<3;m++) {
			for(n=0;n<4;n++) {
				System.out.println("inserire l'elemento di riga " +m+ " e colonna " +n);
				matrice[m][n]=in.nextInt();
			}
			
			somma=0;
			for(m=0;m<3;m++) {
				for(n=0;n<4;n++) {
					somma=somma+matrice[m][n];
				}
		}
			media=somma/matrice[m][n];
			System.out.println("la media della matrice è di : " +media);
		}
	}
}
}
	




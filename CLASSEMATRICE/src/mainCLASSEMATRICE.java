import java.util.Scanner;
public class mainCLASSEMATRICE {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Inserisci il numero di righe della matrice");
		int row=in.nextInt();
		
		System.out.println("Inserisci il numero di colonne della matrice");
		int col=in.nextInt();
		
		Matrix matrix=new Matrix(row, col);
		
		System.out.println("Inserisci i valori nella matrice");
		matrix.add();
		
		System.out.println("Inserisci il valore da cercare");
		double value=in.nextDouble();
		
		if(matrix.contains(value)) {
			System.out.println("Il valore è presente nella matrice");
		} else {
			System.out.println("Il valore non è presente nella matrice");
		}
		
		System.out.println(matrix.toString());
		
		in.close();

	}

}
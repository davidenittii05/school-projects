package veri;
import java.util.Scanner;
public class veri {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int i,j,row,col;
			double sum=0,average,min,max;
			
			
			System.out.println("inserire il numero di righe");
			row=in.nextInt();
			System.out.println("inserire il numero di colonne");
			col=in.nextInt();
			int matrix[][]= new int [row][col];
			
			
			for (i=0;i<row;i++) {
				sum=sum+matrix[i][0];
				for (j=0;j<col;j++) {
					sum=sum+matrix[j][0];
			}
				average=sum/matrix[i][j];
				
}
			
		min=matrix[i][0];
		for(i=0;i<matrix.getRow();i++) {
			if(max>matrix[i][j]) {
				max=matrix[i][j];
			}
		}
		
		min=matrix[j][0];
		for(j=0;j<matrix.getCol();i++) {
			if(max>matrix[i][j]) {
				max=matrix[i][j];
			}
		}
		
	
			
	}}
	
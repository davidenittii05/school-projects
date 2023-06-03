import java.util.*;

public class CLASSEMATRICE {
	private int row;
	private int col; 
	private double matrix[][];
	/**
	 * @param row
	 * @param col
	 * @param matrix
	 */
	
	public CLASSEMATRICE() {
		row=(int) (Math.random()*10)+1;
		col=(int) (Math.random()*10)+1;
		matrix = new double[row][col];
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				matrix[i][j]=(int) (Math.random()*10)+1;
			}	
		}
	}
	
	public CLASSEMATRICE(int row, int col) {
		this.row = row;
		this.col = col;
		matrix = new double[row][col];
		this.matrix=matrix;
	}
	
	//
	public void add(double value) {
		int counter=0;
		matrix[(int)counter/col][counter%col]=value;
		counter++;
	}
	
	public void diagonals() { //capire se la dimensione del vettore è quadrata o meno
		  int n = this.row;
		  int m = this.col;
		  if (n != m)
		   System.out.println("Matrice non quadrata!");                                      // che i+j=n-1, per cui j=n-1-i
		   }

	public double average() { //media della matrice
		int i, j;
		double sum=0;
		for (i=0; i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				sum=sum+matrix[i][j];
			}
		}
		return sum/(row*col);
	}
	
	public int capacity() { // capacità della matrice
		return row*col;
	}
	
	public boolean contains(double value) { //verificare se uno specifico valore è presente all'interno della matrice
		int i, j;
		boolean flag=false;
		for (i=0; i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				if (matrix[i][j]==value) {
					flag=true;
				}
			}
		}
		return flag;
	}
	
	public double firstElement() {
		return matrix[0][0];
	}
	
	public double lastElement() {
		return matrix[row-1][col-1];
	}
	
	public double max() {
		int i, j;
		double max=matrix[0][0];
		for (i=0; i<getRow(); i++) {
			for (j=1; j<getCol(); j++) {
				if(matrix[i][j]>max) {
					max=matrix[i][j];
				}
			}
		}
		return max;
	}
	
	public double min() {
		int i, j;
		double min=matrix[0][0];
		for (i=0; i<getRow(); i++) {
			for (j=1; j<getCol(); j++) {
				if(matrix[i][j]<min) {
					min=matrix[i][j];
				}
			}
		}
		return min;
	}
	
	public double sum() {
		int i, j;
		double sum=0;
		for (i=0; i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				sum=sum+matrix[i][j];
			}
		}
		return sum;
	}
	
	public void show() { //visualizzazione della matrice
        for (int i = 0; i<row; i++) {
            for (int j = 0; j<col; j++)
                System.out.println(matrix[i][j]);
        }
    }
	
	 public void swap(int i, int j) { //scambiare il valore delle righe con quello delle colonne o viceversa
	        double[] temp = matrix[i];
	        matrix[i] = matrix[j];
	        matrix[j] = temp;
	    }
	
	public int ricercaCompleta(double soughtValue) {
		int cont=0;
		for (int i=0; i<row;i++) {
			for (int j=0; j<col;j++) {
				if (matrix[i][j] == soughtValue) {
					cont++;
				}
			}
		}
		
		return cont;
	}
	
	public double[][] scalarProduct(int value) {
		int i,j;
		double[][] matrix1 = new double[row][col];
		for (i=0; i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				matrix1[i][j]=matrix[i][j]*value;
			}
		}
		return matrix1;
	}
	 public void set(double value, int indexRow, int indexCol) {
	 matrix[indexRow-1][indexCol-1]=value;
	 }
	 
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public double[][] getMatrix() {
		return matrix;
	}
	
	public void setRow(int row) {
		this.row=row;
	}
	
	public void setCol(int col) {
		this.col=col;
	}
	
	public void setMatrix(double[][] matrix) {
		this.matrix = matrix;
	}
	
	
	public String toString() {
		int i;
		int j;
		String matrixString="";
		for (i=0; i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				matrixString=matrixString+matrix[i][j]+" ";
			}
		}
		return matrixString;
	}
	
	
}
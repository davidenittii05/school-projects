import java.util.*;
public class StringVector {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 int dim,i;
 String nome;
 boolean flagSillaba,flagAnna,flagGiovanna;;
 
 do {
	 System.out.println("inserire la dimensiine del vettore");
	 dim=in.nextInt();
 }while (dim<0);
 
  Vector <Integer>v = new Vector(dim);
  
    for (i=0;i<dim;i++) {
    	System.out.println("inserire il nome");
    	nome=in .next();  
    }
   
    	
    
    if (v.contains("Anna")==true) {
    	System.out.println("Anna è presente nel vettore");
    } else {
    	System.out.println("Anna non è presente nel vettore");
    }
    
    
    	
    }
	}



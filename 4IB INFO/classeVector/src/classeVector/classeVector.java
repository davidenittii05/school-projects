package classeVector;

import java.util.*;

public class classeVector {
	 public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
	int i;
	Vector <Integer> auto = new Vector <Integer>(12);
	for(i=0;i<12;i++) {
		System.out.println("inserire le auto per il " +(i+1)+ " mese");
		auto.add(in.nextInt());
	}
  Collections.min(auto);
  int minNumber;
  minNumber=Collections.min(auto);
  System.out.println("il numero di auto minore è : " +minNumber);
  Collections.max(auto);
  int maxNumber;
  maxNumber=Collections.max(auto);
  System.out.println("il numero di auto maggiore è : " +maxNumber);
}
}


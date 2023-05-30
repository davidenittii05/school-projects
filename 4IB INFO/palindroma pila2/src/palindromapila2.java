import java.util.*;

public class palindromapila2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//instanziamo il primo oggetto
		Stack<Integer> numeri1 = new Stack<Integer>();
		//instanziamo il secondo oggetto
		Stack<Integer> numeri2 = new Stack<Integer>();
		//instanziamo il terzo oggetto
		Stack<Integer> numeri3 = new Stack<Integer>();
		
		int i,numele,n;
		boolean flag;
		
		do {
			System.out.println("inserisci il numero di elementi");
			n=in.nextInt();
		}while(n<1);
		
		for(i=1;i<=n;i++) {
			
			System.out.println("inserisci il numero da inserire nella pila");
			int calcolo=in.nextInt();
			//int calcolo=i*2;
			numeri1.push(calcolo);
			numeri2.push(calcolo);
		}
		
		System.out.println("Pila 1: " +numeri1);
		System.out.println("Pila 2: " +numeri2);
		System.out.println("Pila 3: " +numeri3);
		
		while(!numeri1.empty()) {
			numeri3.push(numeri1.pop());
		}
		System.out.println("passo i numeri dalla pila 1 alla pila 3");
		
		System.out.println("Pila 1: " +numeri1);
		System.out.println("Pila 2: " +numeri2);
		System.out.println("Pila 3: " +numeri3);
		
		flag=false;
		while(!numeri2.empty()&&!flag) {
		
			if(!numeri2.pop().equals(numeri3.pop())) {
				flag=true;
			
			}
		}
		if(flag) {
			System.out.println("la sequenza di numeri non è palindroma");
		}else {
			System.out.println("la sequenza di numeri è palindroma");
		}
		
		
	}

}

import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        
    	
    	Stack<Integer> numeri= new Stack<Integer>();

        // Aggiunge elementi alla Pila (Stack)
        numeri.push(15);
        numeri.push(-10);
        numeri.push(5000);

        System.out.println("Pila: " + numeri);
        
        
        // Estrazione elemento dalla pila 
        Integer elemento = numeri.pop();
        System.out.println("numero eliminato: " + elemento);
        System.out.println("Pila: " + numeri);
        
        // Restituzione dell'elemento in cima alla pila 
        elemento = numeri.peek();
        System.out.println("Elemento al top della pila:  " + elemento);
        System.out.println("Pila: " + numeri);
        
        
       // Ricerca di un elemento 
        
        int posizione = numeri.search(15);
        System.out.println("Posizione del numero ricercato (15): " + posizione);
        posizione = numeri.search(-10);
        System.out.println("Posizione del numero ricercato (-10): " + posizione);
        posizione = numeri.search(5000);
        System.out.println("Posizione del numero ricercato (5000): " + posizione);
        
        
        if (numeri.empty()) {
        	System.out.println("la pila è vuota");
        }
        else{
        	System.out.println("la pila è piena");
        }  
        
    }
        
   }
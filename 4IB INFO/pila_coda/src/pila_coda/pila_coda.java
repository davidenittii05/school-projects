package pila_coda;
import java.util.*;

public class pila_coda {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> coda = new LinkedList<>();
        Stack<Integer> pila = new Stack<>();

        int nPostiMax, nBiglietti;
        String attrazione = "Scivolo";

        System.out.println("L'attrazione di cui stiamo parlando è: " + attrazione);

        System.out.println("Inserire il numero massimo di biglietti per la giostra: ");
        nPostiMax = in.nextInt();

        int postiAcquistati = 0;
        while (postiAcquistati < nPostiMax) {
            System.out.println("Inserire il numero di biglietti da acquistare per la giostra: ");
            nBiglietti = in.nextInt();

            if (nBiglietti > nPostiMax) {
                pila.push(nBiglietti);
                System.out.println("Numero di biglietti superiore al numero massimo. Aggiunto alla pila.");
            } else {
                if (postiAcquistati + nBiglietti <= nPostiMax) {
                    coda.add(nBiglietti);
                    postiAcquistati = postiAcquistati + nBiglietti;
                    System.out.println("Numero di biglietti aggiunto alla coda.");
                } else {
                    System.out.println("Non è possibile acquistare tutti i biglietti richiesti.");
                }
            }

            System.out.println("Coda: " + coda);
            System.out.println("Pila: " + pila);
        }
    }
}

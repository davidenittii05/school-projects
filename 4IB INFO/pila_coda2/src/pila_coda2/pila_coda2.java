package pila_coda2;
import java.util.*;

public class pila_coda2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> coda = new LinkedList<>();
        Stack<Integer> pila = new Stack<>();

        int nPostiMax, nBiglietti;
        String attrazioneScelta;
        String[] attrazioni = { "Scivolo", "RuotaPanoramica", "MontagneRusse" };

        System.out.println("Attrazioni disponibili:");
        for (int i = 0; i < attrazioni.length; i++) {
            System.out.println("- " + attrazioni[i]);
        }

        System.out.println("Inserire l'attrazione desiderata: ");
        attrazioneScelta = in.next();

        int indiceAttrazione = -1;
        for (int i = 0; i < attrazioni.length; i++) {
            if (attrazioni[i].equalsIgnoreCase(attrazioneScelta)) {
                indiceAttrazione = i;
                break;
            }
        }

        if (indiceAttrazione != -1) {
            System.out.println("Inserire il numero massimo di biglietti per l'attrazione " + attrazioni[indiceAttrazione] + ": ");
            nPostiMax = in.nextInt();

            while (true) {
                System.out.println("Inserire il numero di biglietti da acquistare per l'attrazione " + attrazioni[indiceAttrazione] + ": ");
                nBiglietti = in.nextInt();

                if (nBiglietti > nPostiMax) {
                    pila.push(nBiglietti);
                    System.out.println("Numero di biglietti superiore al numero massimo. Aggiunto alla pila.");
                } else {
                    if (coda.size() + nBiglietti <= nPostiMax) {
                        coda.add(nBiglietti);
                        System.out.println("Numero di biglietti aggiunto alla coda.");
                    } else {
                        System.out.println("Non è possibile acquistare tutti i biglietti richiesti.");
                    }
                }

                System.out.println("Coda: " + coda);
                System.out.println("Pila: " + pila);

                System.out.println("Desideri continuare ad acquistare biglietti per l'attrazione " + attrazioni[indiceAttrazione] + "? (s/n)");
                String scelta = in.next();
                if (scelta.equalsIgnoreCase("n")) {
                    break;
                }
            }
        } else {
            System.out.println("Attrazione non valida.");
        }
    }
}

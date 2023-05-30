 import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
Queue<RichiestaIntervento> coda = new LinkedList<>();
Stack<RichiestaIntervento> pila = new Stack<>();
int numRichieste = 0;
int numMaxRichieste = 3;
String tipoGuasto, descrizione,nome;

do {
        System.out.print("Inserire il nome del cliente (0 per terminare)");
        nome = in.next();
        if (!nome.equals("0")) {
            System.out.print("Inserire il tipo di guasto: ");
            tipoGuasto = in.next();
            System.out.print("Inserire una descrizione del guasto: ");
            descrizione = in.next();
            numRichieste++;
            RichiestaIntervento richiesta = new RichiestaIntervento(numRichieste, nome, tipoGuasto, descrizione);
            if (numRichieste < numMaxRichieste) {
                coda.add(richiesta);
            } else {
                pila.push(richiesta);
            }
        }
    } while (!nome.equals("0"));

    System.out.println("Numero di richieste: " + numRichieste);
    System.out.println("Coda: " +coda);
    System.out.println("Pila: " +pila);
}
}
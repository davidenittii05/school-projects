
public class Espressione2 extends Thread {
Espressione dati;

public Espressione2(Espressione d) {
	dati=d;
}

public void run() {
	dati.ris2=7*dati.b+3;
	System.out.println("ris2 equivale a : " +dati.ris2);
}
}

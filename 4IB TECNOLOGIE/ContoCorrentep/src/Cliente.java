
public class Cliente implements Runnable {
private Conto conto;
private boolean genitore;
private double importo;

public Cliente (Conto conto, boolean genitore, double importo) {
	this.conto=conto;
	this.genitore=genitore;
	this.importo=importo;
}

public void run () {
	for(int i=0;i<5;i++) {
		if (genitore) {
			synchronized(conto) {
				conto.versa(importo);
				System.out.println("dopo il versamento: " +conto.getSaldo());
			}
		} synchronized(conto) {
			conto.preleva(50);
			System.out.println("dopo il prelievo: " +conto.getSaldo());

		}
	}
}
}

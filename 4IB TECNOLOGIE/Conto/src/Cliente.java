public class Cliente implements Runnable {
	private boolean genitore;
	private Conto conto;
	
	public Cliente (Conto conto, boolean genitore){
		this.conto=conto;
		this.genitore=genitore;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			if(genitore) {
				conto.versa(100);
			} else {
			conto.preleva(50);
		}
			System.out.println("Saldo conto: " +conto.getSaldo());
		}
		
	}
}

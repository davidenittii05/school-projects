
public class Conto {
	private String nome;
	private double saldo;
	
	public Conto (String nome, double saldo) {
		this.nome=nome;
		this.saldo=saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public double versa(double importo) {
		return saldo+importo;
	}
	
	public double preleva (double importo) {
		return saldo-importo;
	}
	
}

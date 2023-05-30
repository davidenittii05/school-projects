
public class Conto {
private double saldo;
private String nome;

public Conto (double saldo, String nome) {
	this.saldo=saldo;
	this.nome=nome;
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

public void versa(double importo) {
	saldo=saldo+importo;
}

public void preleva (double importo) {
	saldo=saldo-importo;
}



}
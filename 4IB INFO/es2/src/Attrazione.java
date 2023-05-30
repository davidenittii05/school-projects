public class Attrazione {
	private int numPosti;
	private String attrazione;
	private double costoBiglietto;


public Attrazione (int numPosti, String attrazione, double costoBiglietto) {
	this.numPosti=numPosti;
	this.attrazione=attrazione;
	this.costoBiglietto=costoBiglietto;
}

public int getNumPosti() {
	return numPosti;
}

public String getAttrazione() {
	return attrazione;
}

public double getCostoBiglietto() {
	return costoBiglietto;
}

public void setNumPosti (int numPosti) {
	this.numPosti=numPosti;
}

public void setAttrazione (String attrazione) {
	this.attrazione=attrazione;
}

public void setCostoBiglietto (double costoBiglietto) {
	this.costoBiglietto=costoBiglietto;
}

public String toString() {
	return "NumPosti: " + numPosti + ", Attrazione: " + attrazione + ", costoBiglietto: " + costoBiglietto ;
}

}

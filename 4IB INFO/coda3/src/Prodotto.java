public class Prodotto {
//attributi
private double costoUnitario;
private int quantita;
private String descrizione;

//metodi
public Prodotto() {
descrizione="Bello";
quantita=20;
costoUnitario=5;
}

public Prodotto(String descrizione, int quantita, double costoUnitario) {
this.descrizione=descrizione;
this.quantita=quantita;
this.costoUnitario=costoUnitario;
}

public double costoTotale() {
double costoTotale;
return costoTotale=quantita*costoUnitario;
}

public double getCostoUnitario() {
return costoUnitario;
}

public void setCostoUnitario(double costoUnitario) {
this.costoUnitario = costoUnitario;
}

public int getQuantita() {
return quantita;
}

public void setQuantita(int quantita) {
this.quantita = quantita;
}

public String getDescrizione() {
return descrizione;
}

public void setDescrizione(String descrizione) {
this.descrizione = descrizione;
}

public String toString() {
return descrizione+" "+quantita+" "+costoUnitario;
}


}
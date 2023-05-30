package esriepilogativoVector;
import java.util.Collections;
import java.util.Vector;
import java.util.Scanner;

public class esriepilogativoVector {


public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.println("inserire il numero di auto vendute nel 2021");
int dim = in.nextInt();

Vector v = new Vector(dim);



for(int i=0; i<dim; i++) {
System.out.println("inserire il prezzo della "+(i+1)+"°  macchina");
v.add(in.nextInt());
}

for(int i=0; i<dim; i++) {
System.out.println((i+1)+"°  elemento: "+v.get(i));
}

Vector mesi = new Vector(12);
for(int i=0; i<11; i++) {
System.out.println("inserire il numero di macchine vendute nel " +i+ " mese");
mesi.add(in.nextInt());
}


int iMese,autoMese;
autoMese=(int)v.get(0);
iMese=0;
for (int i=0; i<dim; i++) {
if((int)v.get(i)>autoMese){
autoMese=(int)v.get(i);
iMese=i;
}
}
System.out.println(" il mese in cui sono state vendute più auto è : " +(iMese+1));
Collections.sort(v);


System.out.println("Ordinamento vettore in ordine crescente" + v);


int minNumber, maxNumber;

minNumber= (int) Collections.min(v);
maxNumber= (int) Collections.max(v);

System.out.println("valore max nel vettore "+ maxNumber);

System.out.println("valore min nel vettore : "+ minNumber);

int somma=0, media=0;
for (int i=0; i<dim; i++) {
	somma=somma+(int)v.get(i);
}
media=somma/dim;
System.out.println("la media equivale a : " +media);

boolean auto100;
for (int i=0; i<11; i++) {
	if((int)mesi.get(i)==media) {
		System.out.println("esiste almeno un mese dove sono state vendute auto per un numero pari alla media dell'anno");
	}
if((int)mesi.get(i)==100 ) {
auto100= true;
System.out.println("C'è un mese/più mesi dove sono state vendute un numero pari a 100 auto?" +auto100);
} 
}

}

}

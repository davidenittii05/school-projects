package pensionamenti;

import java.util.*;
public class pensionamenti {

public static void main(String[] args) {

Scanner in=new Scanner(System.in);


String mesi[]= new String[12];
mesi[0]="Gennaio";
mesi[1]="Febbraio";
mesi[2]="Marzo";
mesi[3]="Aprile";
mesi[4]="Maggio";
mesi[5]="Giugno";
mesi[6]="Luglio";
mesi[7]="Agosto";
mesi[8]="Settembre";
mesi[9]="Ottobre";
mesi[10]="Novembre";
mesi[11]="Dicembre";

Vector v = new Vector();
System.out.println("Inserire il  numero di pensionati nel mese di Gennaio");
v.add(in.nextInt());
int i=0;
for(i=0; i<12; i++) {
System.out.println("Inserire il  numero di pensionati di " +(mesi[i+1]));
v.add(in.nextInt());
}

int mediaSemestre,sommaSemestre;
 sommaSemestre = (int) v.get(1);


}
}


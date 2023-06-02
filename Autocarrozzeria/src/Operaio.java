
public class Operaio extends Thread {
private Auto auto;
private String faseSpecifica;

public Operaio(Auto auto, String faseSpecifica) {
	this.auto=auto;
	this.faseSpecifica=faseSpecifica;
}
public void run () {
	for (int i=0; i<auto.getNAuto();i++) {
		for (int j=0;j<auto.nFasi();j++) {
			if (faseSpecifica=="lucidatura") {
				synchronized(auto) {
					System.out.println("ceratura");
				} 
				}else {
					synchronized(auto) {
					System.out.println("lucidatura");
					}
			}
		}
	}
}
}

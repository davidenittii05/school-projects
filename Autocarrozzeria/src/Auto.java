
public class Auto extends Thread{
private int nAuto;
private int nFasi;

public Auto (int nAuto, int nFasi) {
	this.nAuto=nAuto;
	this.nFasi=nFasi;
}

public int getNAuto() {
 return nAuto;	
}

public int nFasi () {
	return nFasi;
}

public void setNAuto (int nAuto) {
	this.nAuto = nAuto;
}

public void setNFasi (int nFasi) {
	this.nFasi=nFasi;
}


}

package hu.pallas;

public class Two {
private int szam;

public int getSzam() {
	return szam;
}

public void setSzam(int szam) {
	this.szam = szam;
}

public void kiir() {
	for (int i = 0; i <3; i++) {
		System.out.println(szam);
	}
}

}

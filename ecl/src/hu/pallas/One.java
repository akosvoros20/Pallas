package hu.pallas;

public class One {
	private String szoveg;
	
	public String getSzoveg()
	{
		return szoveg;
	}
	
	public void setSzoveg(String szoveg) {
		this.szoveg = szoveg;
	}
	
	
	public void kiir() {
		for (int i = 0; i < 10; i++) {
			System.out.print(szoveg + ", "); 
		}
	}
	

}

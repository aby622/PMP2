package aufgabenblatt1;

public class Pruefungsleistung {
	
	private int NOTE;
	private String MODUL;
	
	public Pruefungsleistung(int note, String modul){
		this.NOTE= note;
		this.MODUL= modul;		
	}
	

	public int getNOTE() {
		return NOTE;
	}

	public void setNOTE(int nOTE) {
		NOTE = nOTE;
	}

	public String getMODUL() {
		return MODUL;
	}

	public void setMODUL(String mODUL) {
		MODUL = mODUL;
	}
}

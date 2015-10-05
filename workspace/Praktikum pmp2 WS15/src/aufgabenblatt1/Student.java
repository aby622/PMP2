package aufgabenblatt1;

import java.util.LinkedList;
import java.util.List;

public class Student {

	private String VORNAME;
	private String NACHNAHME;
	private int MATRIKELNUMMER;
	private List<Pruefungsleistungen> eintraege = new LinkedList<Pruefungsleistungen>();

	public void neuePruefungsleistungen(String modul, int note){
		eintraege.add(new Pruefungsleistungen(modul, note));
	}
}

package aufgabenblatt1;

import java.util.Comparator;

public class Student<Pruefungsleistung> implements Comparable<Pruefungsleistung>, Comparator<Pruefungsleistung> {

	private final String VORNAME;
	private final String NACHNAHME;
	private int MATRIKELNUMMER;
	private Pruefungsleistung NOTE;
	private Pruefungsleistung MODUL;

	public Student(String vorname, String nachnahme, int matrikelnummer, Pruefungsleistung note,
			Pruefungsleistung modul) {

		this.VORNAME = vorname;
		this.NACHNAHME = nachnahme;
		this.MATRIKELNUMMER = matrikelnummer;
		this.NOTE = note;
		this.MODUL = modul;
	}

	public int compareTo(Student<String> student1, Student<Pruefungsleistung> student2) {
		
		student1 = new Student<String>("Peter", "Lustig", 2230300, "13", "ET");
		
	
		return 0;
	}

	@Override
	public int compare(Pruefungsleistung student1, Pruefungsleistung student2) {

		return 0;
	}

	@Override
	public int compareTo(Pruefungsleistung o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

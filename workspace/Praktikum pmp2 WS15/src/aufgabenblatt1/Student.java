package aufgabenblatt1;

import java.util.Comparator;

public class Student<Pruefungsleistung> implements Comparable<Student>, Comparator<Student> {

	private final String VORNAME;
	private final String NACHNAHME;
	private final int MATRIKELNUMMER;
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

	@Override
	public int compare(Student o1, Student o2) {
		o1 = new Student<String>("Peter", "Siegfried", 213204, "15", "PMP2");
		o2 = new Student<String>("Klaus", "Eberhard", 213456, "11", "PMP2");
		return 0;
	}

	@Override
	public int compareTo(Student o) {
		o =  new Student<String>("Mannfred", "Joseph", 213205, "12", "PMP2");
		return 0;
	}

	
}
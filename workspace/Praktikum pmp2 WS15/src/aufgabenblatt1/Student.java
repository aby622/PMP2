package aufgabenblatt1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student<Pruefungsleistung>
		implements Comparable<Student<Pruefungsleistung>>, Comparator<Student<Pruefungsleistung>> {

	private final String VORNAME;
	private final String NACHNAME;
	private final int MATRIKELNUMMER;

	private List<Pruefungsleistung> liste1 = new LinkedList<Pruefungsleistung>();

	public void eintragHinzufuegen(Pruefungsleistung pruefungsleistung) {
		liste1.add(pruefungsleistung);
	}

	public String toString() {
		return liste1.stream().map((Pruefungsleistung pruefungsleistung) -> {
			return pruefungsleistung.toString();
		}).collect(Collectors.joining(", "));
	}

	public Student(String vorname, String nachname, int matrikelnummer, List<Pruefungsleistung> liste1) {

		this.VORNAME = vorname;
		this.NACHNAME = nachname;
		this.MATRIKELNUMMER = matrikelnummer;
		this.liste1 = liste1;
	}

	@Override
	public int compare(Student o1, Student o2) {
		return 0;
	}

	@Override
	public int compareTo(Student<Pruefungsleistung> o) {
		return 0;
	}

	public static void main(String[]args){
		
		
		
		Student student1 = new Student("Fritz", "Müller", 1234567, liste1.add("PM2", "10"));
		
		
		
	}

}

package aufgabenblatt1;

import java.util.ArrayList;
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
	private Pruefungsleistung NOTE;
	private Pruefungsleistung MODUL;

	private List<Pruefungsleistung> liste1 = new LinkedList<Pruefungsleistung>();

	public void eintragHinzufuegen(int note, Pruefungsleistung modul) {
		liste1.add(note, modul);
	}

	public String toString() {
		return liste1.stream().map((Pruefungsleistung pruefungsleistung) -> {
			return pruefungsleistung.toString();
		}).collect(Collectors.joining());
	}

	public Student(String vorname, String nachname, int matrikelnummer) {

		this.VORNAME = vorname;
		this.NACHNAME = nachname;
		this.MATRIKELNUMMER = matrikelnummer;
	}

	@Override
	public int compare(Student o1, Student o2) {
		return 0;
	}

	@Override
	public int compareTo(Student<Pruefungsleistung> o) {
		return 0;
	}

	public static void main(String[] args) {
	
		List<Student> liste1 = new LinkedList<Student>();
		Student student = new Student("Peter", "Lustig", 123445);
		student.eintragHinzufuegen(10, "PMP2");
		System.out.print(liste1);

	}

}

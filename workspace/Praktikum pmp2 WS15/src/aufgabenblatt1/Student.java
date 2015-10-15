package aufgabenblatt1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student implements Comparable<Student> {

	private final String VORNAME;
	private final String NACHNAME;
	private final int MATRIKELNUMMER;

	private List<Pruefungsleistung> liste1 = new LinkedList<Pruefungsleistung>();

	@Override
	public String toString() {
		return MATRIKELNUMMER + " | " + NACHNAME + " 	| " + VORNAME;
	}
	
	public void addPruefungsleistung(Pruefungsleistung pruefungsleistung){
		liste1.add(pruefungsleistung);
	}

	public Student(String vorname, String nachname, int matrikelnummer, List<Pruefungsleistung> pruefungsleistung) {

		this.VORNAME = vorname;
		this.NACHNAME = nachname;
		this.MATRIKELNUMMER = matrikelnummer;
		this.liste1 = pruefungsleistung;
	}

	public String getVORNAME() {
		return VORNAME;
	}

	public String getNACHNAME() {
		return NACHNAME;
	}

	public int getMATRIKELNUMMER() {
		return MATRIKELNUMMER;
	}

	public static void main(String[] args) {

		List<Student> liste1 = new LinkedList<Student>();

		Student student = new Student("Peter", "Lustig", 923445);
		
		Student student2 = new Student("Siegfried", "Mustermax", 234411);
		
		Student student3 = new Student("Siegfriedd", "Mustermannn", 234421);
		
		Pruefungsleistung pruefungsleistung1 = new Pruefungsleistung(10, "Mathe");
		Pruefungsleistung pruefungsleistung2 = new Pruefungsleistung(8, "Mathe");
		Pruefungsleistung pruefungsleistung3 = new Pruefungsleistung(12, "Mathe");
		
		student.addPruefungsleistung(pruefungsleistung1);
		student2.addPruefungsleistung(pruefungsleistung2);
		student3.addPruefungsleistung(pruefungsleistung3);
		
		liste1.add(student);
		liste1.add(student2);
		liste1.add(student3);

		Collections.sort(liste1);
		for(Student elemente : liste1){
			System.out.println(elemente);
		}
		int vergleich = new CompareStudent().compare(student, student2);
		System.out.println(vergleich);
		

	}


	@Override
	public int compareTo(Student student) {
		return getMATRIKELNUMMER() - student.getMATRIKELNUMMER();
	}
}

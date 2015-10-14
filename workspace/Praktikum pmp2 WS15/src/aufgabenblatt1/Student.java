package aufgabenblatt1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Student<Pruefungsleistung>
		implements Comparable<Student<Pruefungsleistung>>, Comparator<Student<Pruefungsleistung>> {

	private final String VORNAME;
	private final String NACHNAME;
	private final int MATRIKELNUMMER;
	private Pruefungsleistung NOTE;
	private Pruefungsleistung MODUL;

	private List<Pruefungsleistung> liste1 = new LinkedList<Pruefungsleistung>();

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

	

	public String getVORNAME() {
		return VORNAME;
	}

	public String getNACHNAME() {
		return NACHNAME;
	}

	public int getMATRIKELNUMMER() {
		return MATRIKELNUMMER;
	}

	public Pruefungsleistung getNOTE() {
		return NOTE;
	}

	public void setNOTE(Pruefungsleistung nOTE) {
		NOTE = nOTE;
	}

	public Pruefungsleistung getMODUL() {
		return MODUL;
	}

	public void setMODUL(Pruefungsleistung mODUL) {
		MODUL = mODUL;
	}
	public static void main(String[] args) {
	
		
		Student<String> student = new Student<String>("Peter", "Lustig", 123445);
		student.setMODUL("ET");
		student.setNOTE("12");
		
		System.out.print(student.getMODUL());

	}
}

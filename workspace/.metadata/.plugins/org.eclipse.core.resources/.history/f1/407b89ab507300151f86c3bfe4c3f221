package aufgabenblatt1;

import java.util.Comparator;

public class CompareStudent implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		int wert = student1.getNACHNAME().compareTo(student2.getNACHNAME());
		if (wert == 0) {
			return student1.getVORNAME().compareTo(student2.getVORNAME());
		}
		return wert;
	}

}

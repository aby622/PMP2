package aufgabenblatt1;

import java.util.Comparator;

public class CompareStudent implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		
		if (student1.getNACHNAME() == null && student2.getNACHNAME() == null) {
			return student1.getVORNAME().compareTo(student2.getVORNAME());

			
		
		}else{
			if (student1.getNACHNAME() == null) {
				return 1;
			}
			if (student2.getNACHNAME() == null) {
				return -1;
			}
			
		}
		return student1.getNACHNAME().compareTo(student2.getNACHNAME());
		
		
		
	}
/*
	if (student1.getNACHNAME() == null) {
		return 1;
	}
	if (student2.getNACHNAME() == null) {
		return -1;
	}
	if (student1.getNACHNAME() == null && student2.getNACHNAME() == null) {
		return 0;
	}

	return student1.getNACHNAME().compareTo(student2.getNACHNAME());
	*/
	/*
	if (student1.getVORNAME() == null) {
		return 1;
	}
	if (student2.getVORNAME() == null) {
		return -1;
	}
	if (student1.getVORNAME() == null && student2.getVORNAME() == null) {
		
	}

	return student1.getVORNAME().compareTo(student2.getVORNAME());
	*/
}

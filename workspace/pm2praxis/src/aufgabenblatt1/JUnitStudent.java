package aufgabenblatt1;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class JUnitStudent {
  
  @Test
  public void testStudentNachNamen(){
	List<Student> liste1 = new LinkedList<Student>();

	Student student = new Student("Justus", "Jonas", 11111111);
	Student student2 = new Student("Peter", "Shawer", 22222222);
	Student student3 = new Student("Bob", "Andrews", 33333333);
	Student student4 = new Student("Horst", "Schlemmer", 44444444);
	Student student5 = new Student("Angela", "Schlemmer", 55555555);
	Student student6 = new Student("Peter", "Panne", 66666666);

	Pruefungsleistung pruefungsleistung = new Pruefungsleistung(10, "Mathe");
	Pruefungsleistung pruefungsleistung2 = new Pruefungsleistung(10, "Mathe");
	Pruefungsleistung pruefungsleistung3 = new Pruefungsleistung(8, "Mathe");
	Pruefungsleistung pruefungsleistung4 = new Pruefungsleistung(9, "Mathe");
	Pruefungsleistung pruefungsleistung5 = new Pruefungsleistung(15, "Mathe");
	Pruefungsleistung pruefungsleistung6 = new Pruefungsleistung(13, "Mathe");

	student.addPruefungsleistung(pruefungsleistung);
	student2.addPruefungsleistung(pruefungsleistung2);
	student3.addPruefungsleistung(pruefungsleistung3);
	student4.addPruefungsleistung(pruefungsleistung4);
	student5.addPruefungsleistung(pruefungsleistung5);
	student6.addPruefungsleistung(pruefungsleistung6);

	liste1.add(student);
	liste1.add(student2);
	liste1.add(student3);
	liste1.add(student4);
	liste1.add(student5);
	liste1.add(student6);
	CompareStudent vergleich = new CompareStudent();
	Collections.sort(liste1, vergleich);
	String result = "[33333333AndrewsBob, 11111111JonasJustus, 66666666PannePeter, 55555555SchlemmerAngela, 44444444SchlemmerHorst, 22222222ShawerPeter]";
	assertEquals(liste1.toString(), result);
  }
  @Test
  public void testStudentNachMatrikel(){
	List<Student> liste1 = new LinkedList<Student>();

	Student student = new Student("Justus", "Jonas", 11111111);
	Student student2 = new Student("Peter", "Shawer", 22222222);
	Student student3 = new Student("Bob", "Andrews", 33333333);
	Student student4 = new Student("Horst", "Schlemmer", 44444444);
	Student student5 = new Student("Angela", "Schlemmer", 55555555);
	Student student6 = new Student("Peter", "Panne", 66666666);

	Pruefungsleistung pruefungsleistung = new Pruefungsleistung(10, "Mathe");
	Pruefungsleistung pruefungsleistung2 = new Pruefungsleistung(10, "Mathe");
	Pruefungsleistung pruefungsleistung3 = new Pruefungsleistung(8, "Mathe");
	Pruefungsleistung pruefungsleistung4 = new Pruefungsleistung(9, "Mathe");
	Pruefungsleistung pruefungsleistung5 = new Pruefungsleistung(15, "Mathe");
	Pruefungsleistung pruefungsleistung6 = new Pruefungsleistung(13, "Mathe");

	student.addPruefungsleistung(pruefungsleistung);
	student2.addPruefungsleistung(pruefungsleistung2);
	student3.addPruefungsleistung(pruefungsleistung3);
	student4.addPruefungsleistung(pruefungsleistung4);
	student5.addPruefungsleistung(pruefungsleistung5);
	student6.addPruefungsleistung(pruefungsleistung6);

	liste1.add(student);
	liste1.add(student2);
	liste1.add(student3);
	liste1.add(student4);
	liste1.add(student5);
	liste1.add(student6);
	for(Student studentx : liste1){
	  for(Student studenty : liste1){
		studentx.compareTo(studenty);
	  }
	}
	Collections.sort(liste1);
	
	String result = "[11111111JonasJustus, 22222222ShawerPeter, 33333333AndrewsBob, 44444444SchlemmerHorst, 55555555SchlemmerAngela, 66666666PannePeter]";
	assertEquals(liste1.toString(), result);
  }
  @Test
  public void testStudentPruefungsleistung(){

	Student student = new Student("Justus", "Jonas", 11111111);
	Pruefungsleistung pruefungsleistung = new Pruefungsleistung(10, "Mathe");
	Pruefungsleistung pruefungsleistung2 = new Pruefungsleistung(9, "Mathe");
	student.addPruefungsleistung(pruefungsleistung);
	student.addPruefungsleistung(pruefungsleistung2);
	String result = "Mathe, 10";
	String result2 = "Mathe, 9";
	assertEquals(student.getPruefungsleistung()[0].toString(), result);
	assertEquals(student.getPruefungsleistung()[1].toString(), result2);
  }
}

/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 1, Aufgabe 1.2
 */
package aufgabenblatt1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Klasse Student implementiert Comparable<Student> Ein Student hat einen
 * Vornamen, einen Nachnamen und eine Matrikelnummer. Au�erdem erh�lt er �ber
 * die Klasse Pruefungsleistung eine Pruefungsleistung zugeordnet, die aus einer
 * Note und einem Modul besteht.
 * 
 * @author Leon & Jannes
 *
 */
public class Student implements Comparable<Student> {
  /**
   * privates finales String Objekt f�r den Vornamen
   */
  private String vorname;
  /**
   * privates finales String Objekt f�r den Nachnamen
   */
  private String nachname;
  /**
   * privates finales int Objekt f�r die Matrikelnummer
   */
  private int matrikelnummer;
  /**
   * privates Liste in die die Pruefungsleistungen integriert werden
   */

  private List<Pruefungsleistung> liste1 = new LinkedList<Pruefungsleistung>();

  /**
   * Ueberschriebene toString() Methode, die Matrikelnummer, Nachname, Vorname,
   * Modul und Note ausgegeben
   * 
   * @return String
   */
  @Override
  public String toString() {
	System.out.print("| " + matrikelnummer + " | " + nachname + " , " + vorname + "	: ");
	for (Pruefungsleistung elemente2 : liste1) {
	  System.out.print(elemente2.toString());
	}
	return "	|";
  }

  /**
   * Methode addPruefungsleistung f�gt eine Pruefungsleistung zu der Liste hinzu
   */
  public void addPruefungsleistung(Pruefungsleistung pruefungsleistung) {
	liste1.add(pruefungsleistung);
  }

  /**
   * Konstruktor
   */
  public Student(String vorname, String nachname, int matrikelnummer) {

	this.vorname = vorname;
	this.nachname = nachname;
	this.matrikelnummer = matrikelnummer;
  }

  /**
   * Getter
   */
  public String getVORNAME() {
	return vorname;
  }

  /**
   * Getter
   */
  public String getNACHNAME() {
	return nachname;
  }

  /**
   * Getter
   */
  public int getMATRIKELNUMMER() {
	return matrikelnummer;
  }

  /**
   * �berschriebene compareTo Methode, die die Matrikelnummer der Studenten
   * vergleicht
   * 
   * @return int gibt eine Nummer aus, die uns erkennen l�sst welcher Matrikelnummer gr��er ist.
   */
  @Override
  public int compareTo(Student student) {
	return getMATRIKELNUMMER() - student.getMATRIKELNUMMER();
  }

  /**
   * Main Methode
   */
  public static void main(String[] args) {

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

	System.out.println("	-----unsortiert-----");

	for (Student elemente : liste1) {
	  System.out.println(elemente);
	}

	System.out.println("	-----geordnet-----");
	Collections.sort(liste1);

	for (Student elemente : liste1) {
	  System.out.println(elemente);
	}

	System.out.println("	-----Nachname/Vorname-----");

	CompareStudent vergleich = new CompareStudent();
	Collections.sort(liste1, vergleich);

	for (Student elemente : liste1) {
	  System.out.println(elemente);
	}
  }

}

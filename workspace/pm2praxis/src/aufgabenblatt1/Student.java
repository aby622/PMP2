/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 1, Aufgabe 1.2
 */
package aufgabenblatt1;

import java.util.LinkedList;
import java.util.List;

/**
 * Klasse Student implementiert Comparable<Student> Ein Student hat einen
 * Vornamen, einen Nachnamen und eine Matrikelnummer. Außerdem erhält er über
 * die Klasse Pruefungsleistung eine Pruefungsleistung zugeordnet, die aus einer
 * Note und einem Modul besteht.
 * 
 * @author Leon & Jannes
 *
 */
public class Student implements Comparable<Student> {
  /**
   * privates finales String Objekt für den Vornamen
   */
  private String vorname;
  /**
   * privates finales String Objekt für den Nachnamen
   */
  private String nachname;
  /**
   * privates finales int Objekt für die Matrikelnummer
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
	return matrikelnummer + nachname + vorname;
  }

  /**
   * Methode addPruefungsleistung fügt eine Pruefungsleistung zu der Liste hinzu
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

  public Object[] getPruefungsleistung(){
	return liste1.toArray();
  }
  /**
   * Überschriebene compareTo Methode, die die Matrikelnummer der Studenten
   * vergleicht
   * 
   * @return int gibt eine Nummer aus, die uns erkennen lässt welcher Matrikelnummer größer ist.
   */
  @Override
  public int compareTo(Student student) {
	return getMATRIKELNUMMER() - student.getMATRIKELNUMMER();
  }
}

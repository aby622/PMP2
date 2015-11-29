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
	return matrikelnummer + nachname + vorname;
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

  public Object[] getPruefungsleistung(){
	return liste1.toArray();
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
}

/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 1, Aufgabe 1.2
 */
package aufgabenblatt1;

import java.util.Comparator;

/**
 * Klasse CompareStudent Soll zwei Studenten nach ihrem Nachnamen sortieren,
 * wenn der Nachname gleich ist anhand des Vornamens
 * 
 * @author Leon & Jannes
 */
public class CompareStudent implements Comparator<Student> {
  /**
   * Ueberschriebene compare Methode aus Comparator Interface Sie vergleicht den
   * Nachnamen zweier Studenten und lädt den Wert in ein int Objekt. ist das
   * Objekt 0, also gleich, soll die Methode den Vornamen vergleichen und gibt
   * dann einen int Wert zurück
   * 
   * @param student wird mit der Vergleichsnummer gefüllt
   * @return student gibt die Vergleichsnummer zurück
   */
  @Override
  public int compare(Student student1, Student student2) {

	int student = student1.getNACHNAME().compareTo(student2.getNACHNAME());
	if (student == 0) {
	  return student1.getVORNAME().compareTo(student2.getVORNAME());
	}
	return student;
  }
}

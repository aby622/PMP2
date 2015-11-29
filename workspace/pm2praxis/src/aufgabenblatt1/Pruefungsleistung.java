/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 1, Aufgabe 1.2
 */
package aufgabenblatt1;

/**
 * Klasse Pruefungsleistung Eine Pruefungsleistung besteht aus einer Note und
 * einem Modul
 * 
 * @author Leon & Jannes
 */
public class Pruefungsleistung {

  /**
   * privates int Objekt f�r die Note
   */
  private int note;

  /**
   * privates String Objekt f�r das Modul
   */
  private String modul;

  /**
   * Konstruktor
   */
  public Pruefungsleistung(int note, String modul) {
	this.note = note;
	this.modul = modul;
  }

  /**
   * Getter
   */
  public int getNOTE() {
	return note;
  }

  /**
   * Getter
   */
  public String getMODUL() {
	return modul;
  }

  /**
   * Ueberschriebene toString() Methode
   * 
   * @return String
   */
  @Override
  public String toString() {
	return modul + ", " + note;

  }
}

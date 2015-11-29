/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 3, Aufgabe 1
 */

package aufgabenblatt3;

/**
 * Klasse Rangierbahnhof stellt einen Bahnhof dar, der �ber ein Array vom Typ
 * Zug verf�gt und kennt seine Anzahl von Gleisen.
 * 
 * @author Leon
 *
 */
public class Rangierbahnhof {
  /**
   * int anzahlGleise
   */
  protected int anzahlGleise = 3;
  /**
   * Zug[] zuege
   */
  protected Zug[] zuege = new Zug[anzahlGleise];

  /**
   * Getter
   * 
   * @return
   */
  public Zug[] getZug() {
	return zuege;
  }

  /**
   * synchronized Methode ausfahren �berschreibt eine Zelle des �bergebenen Zug
   * array an dem Index welcher dem Gleis entspricht
   * 
   * @param zug
   * @param gleis
   */
  public synchronized void ausfahren(Zug[] zug, int gleis) {
	if (zug[gleis] instanceof Zug) {
	  zug[gleis] = null;
	  zuege = zug;
	  System.err.println("ausfahren--->");
	  System.err.println("" + zuege[0] + "		" + zuege[1] + "		" + zuege[2]);
	}
	notify();
  }

  /**
   * synchronized Methode einfahren �berschreibt eine Zelle des �bergebenen Zug
   * array an dem Index welcher dem Gleis entspricht
   * 
   * @param zug
   * @param gleis
   */
  public synchronized void einfahren(Zug[] zug, int gleis) {
	if (zug[gleis] == null) {
	  zug[gleis] = new Zug();
	  zuege = zug;
	  System.err.println("<--- einfahren");
	  System.err.println("" + zuege[0] + "		" + zuege[1] + "		" + zuege[2]);
	}
	notify();
  }
}
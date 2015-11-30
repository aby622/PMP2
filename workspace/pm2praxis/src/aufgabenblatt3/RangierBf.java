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
public class RangierBf {
  /**
   * int anzahlGleise
   */
  protected int anzahlGleise = 3;
  /**
   * Zug[] zuege
   */
  protected Zug[] gleise = new Zug[anzahlGleise];

  /**
   * synchronized Methode ausfahren �berschreibt eine Zelle des �bergebenen Zug
   * array an dem Index welcher dem Gleis entspricht
   * 
   * @param zug
   * @param gleis
   */
  public synchronized void ausfahren(int gleis) {

	while (gleise[gleis] == null) {
	  try {
		System.err.println("Kaffeepause");
		wait();
	  } catch (InterruptedException e) {

	  }
	}
	System.err.println("Fahre jz aus");
	gleise[gleis] = null;
	System.err.println("ausgefahren--->");
	System.err.println("" + gleise[0] + "		" + gleise[1] + "		" + gleise[2]);
	notifyAll();
  }

  /**
   * synchronized Methode einfahren �berschreibt eine Zelle des �bergebenen Zug
   * array an dem Index welcher dem Gleis entspricht
   * 
   * @param zug
   * @param gleis
   */
  public synchronized void einfahren(Zug zug, int gleis) {
	// solange gleis nicht frei: warten
	// dann, wenn frei: belegen + notifyAll

	while (gleise[gleis] != null) {
	  try {
		System.err.println("Kaffeepause");
		wait();
	  } catch (InterruptedException e) {
	  }
	}
	System.err.println("Fahre jz ein");
	gleise[gleis] = zug;
	System.err.println("<--- eingefahren");
	System.err.println("" + gleise[0] + "		" + gleise[1] + "		" + gleise[2]);
	notifyAll();

  }

  /**
   * Getter
   * 
   * @return
   */
  public Zug[] getGleise() {
	return gleise;
  }
}
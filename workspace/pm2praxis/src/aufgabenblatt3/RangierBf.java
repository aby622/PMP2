/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 3, Aufgabe 1
 */

package aufgabenblatt3;

/**
 * Klasse Rangierbahnhof stellt einen Bahnhof dar, der über ein Array vom Typ
 * Zug verfügt und kennt seine Anzahl von Gleisen.
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
   * Zug[] gleise
   */
  protected Zug[] gleise = new Zug[anzahlGleise];

  /**
   * synchronized Methode ausfahren überschreibt eine Zelle des übergebenen Zug
   * array an dem Index welcher dem Gleis entspricht
   * 
   * @param zug
   * @param gleis
   */
  public synchronized void ausfahren(int gleis) {
	while (gleise[gleis] == null) {
	  try {
		System.err.print(".");
		wait();
	  } catch (InterruptedException e) {
	  }
	}
	gleise[gleis] = null;
	try {
	  Thread.sleep(500);
	} catch (InterruptedException e) {
	  e.printStackTrace();
	}
	System.err.println("\n1:" + gleise[0] + "	2:" + gleise[1] + "	3:" + gleise[2]);
	notifyAll();
  }

  /**
   * synchronized Methode einfahren überschreibt eine Zelle des übergebenen Zug
   * array an dem Index welcher dem Gleis entspricht
   * 
   * @param zug
   * @param gleis
   */
  public synchronized void einfahren(Zug zug, int gleis) {
	while (gleise[gleis] != null) {
	  try {
		System.err.print("'");
		wait();
	  } catch (InterruptedException e) {
	  }
	}
	gleise[gleis] = zug;
	try {
	  Thread.sleep(500);
	} catch (InterruptedException e) {
	  e.printStackTrace();
	}
	System.err.println("\n1:" + gleise[0] + "	2:" + gleise[1] + "	3:" + gleise[2]);
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

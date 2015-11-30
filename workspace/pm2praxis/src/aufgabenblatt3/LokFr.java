/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 3, Aufgabe 2
 */

package aufgabenblatt3;

/**
 * Klasse Lokfuehrer extends Thread implements IbewegeZug verarbeitet ein Objekt
 * vom Typ IbewegeZug und verändert den Bahnhof
 * 
 * @author Leon
 *
 */
public class LokFr extends Thread implements IZugParken {
  /**
   * IbewegeZug
   */
  protected IZugParken aktion;

  /**
   * Konstruktor
   * 
   * @param aktion
   */
  public LokFr(IZugParken aktion) {
	this.aktion = aktion;
  }

  /**
   * @Override parken Methode aus Interface IbewegeZug es wird ein Zug übergeben
   *           und ein bestimmtes Gleis
   */
  @Override
  public void parken() {
	aktion.parken();
  }

  /**
   * @Override run Methode Der Lokführer kann Ein- und Ausfahren
   */
  @Override
  public void run() {
	  this.aktion.parken();
  }
}

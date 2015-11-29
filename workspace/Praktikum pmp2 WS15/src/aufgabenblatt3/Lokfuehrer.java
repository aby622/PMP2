/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 3, Aufgabe 2
 */

package aufgabenblatt3;

/**
 * Klasse Lokfuehrer extends Thread implements IbewegeZug verarbeitet ein Objekt
 * vom Typ IbewegeZug und ver�ndert den Bahnhof
 * 
 * @author Leon
 *
 */
public class Lokfuehrer extends Thread implements IbewegeZug {
  /**
   * IbewegeZug
   */
  protected IbewegeZug aktion;
  /**
   * Rangierbahnhof bahnhof
   */
  protected Rangierbahnhof bahnhof;

  /**
   * Konstruktor
   * 
   * @param aktion
   * @param bahnhof
   */
  public Lokfuehrer(IbewegeZug aktion, Rangierbahnhof bahnhof) {
	this.aktion = aktion;
	this.bahnhof = bahnhof;
  }

  /**
   * @Override run Methode Der Lokf�hrer kann Ein- und Ausfahren
   */
  @Override
  public void run() {
	new Lokfuehrer(new Einfahren(), bahnhof).start();
	new Lokfuehrer(new Ausfahren(), bahnhof).start();
  }

  /**
   * @Override parken Methode aus Interface IbewegeZug es wird ein Zug �bergeben
   *           und ein bestimmtes Gleis
   */
  @Override
  public void parken(Zug[] zug, int gleis) {
	aktion.parken(zug, gleis);
  }
}

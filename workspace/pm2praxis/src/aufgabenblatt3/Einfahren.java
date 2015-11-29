/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 3, Aufgabe 2
 */

package aufgabenblatt3;

/**
 * Klasse Einfahren extends Rangierbahnhof implements IbewegeZug �berschreibt
 * die parken Methode aus dem Interface IbewegeZug und verbindet es mit der
 * entsprechenden synchronized Methode aus Rangierbahnhof.
 * 
 * @author Leon
 *
 */
public class Einfahren extends Rangierbahnhof implements IbewegeZug {
  /**
   * @Override �berschreibt Methode parken aus Interface IbewegeZug
   */
  @Override
  public void parken(Zug[] zuege, int gleis) {
	einfahren(zuege, gleis);
  }

}
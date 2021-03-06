/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 1, Aufgabe 1.4
 */
package aufgabenblatt1;

/**
 * Klasse Pruefklasse
 * 
 * @author Leon & Jannes
 * @param <T>
 */
public class IsFirstElementInt {

  /**
   * Die Methode 'pruefe' pr�ft ob das erste Element des Arrays ein Integer ist.
   * 
   * @return false wenn erstes Element nicht einem Integer entspricht
   * @return true wenn erstes Element einem Integer entspricht
   */
  public static <T> boolean pruefe(ArrayListe<T> elemente) {
	if (elemente.get(0) instanceof Integer) {
	  return true;
	} else
	  return false;
  }

}
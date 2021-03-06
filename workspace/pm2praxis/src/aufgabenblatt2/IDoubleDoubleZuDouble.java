/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 1
 */
package aufgabenblatt2;

/**
 * Interface IDoubleDoubleZuDouble
 * 
 * @author Leon
 *
 */
@FunctionalInterface
public interface IDoubleDoubleZuDouble {

  /**
   * Die Methode soll zwei Doubles als Argumente akzeptieren und als Ergebnis
   * einen Double-Wert zurückliefern.
   * 
   * @param a
   * @param b
   */
  public double werteAus(double a, double b);
}

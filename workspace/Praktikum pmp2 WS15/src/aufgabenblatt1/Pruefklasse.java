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
 */
public class Pruefklasse {

	/**
	 * Array vom Typ Object.
	 */
	public static Object[] elemente;

	/**
	 * Die Methode 'pruefe' prüft ob das erste Element des Arrays ein Integer
	 * ist.
	 */
	public static boolean pruefe() {
		if (elemente[0] instanceof Integer) {
			return true;
		} else
			return false;
	}

}

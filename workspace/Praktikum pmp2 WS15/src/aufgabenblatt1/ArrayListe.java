/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 1, Aufgabe 1.4
 */
package aufgabenblatt1;

import java.util.Collections;

/**
 * Klasse ArrayListe
 * 
 * @author Leon & Jannes
 */
public class ArrayListe<T> {

	int anzahlElemente;
	private Object[] elemente;

	public ArrayListe() {

	}

	public <T> void hinzufuegen() {

	}

	public int get(int index) {
		for (Object object : elemente) {
			if (elemente[index] == elemente[index]) {
				System.out.println(object);
			}
		}
		return 0;
	}

	public <T> void entfernen() {

	}

	public void entferneElementAnIndex(int index) {

	}

	public int getAnzahlElemente() {
		anzahlElemente = elemente.length;
		return anzahlElemente;

	}

	public String toString() {
		for (Object object : elemente) {
			System.out.println(object);
		}
		return null;

	}

	public void getKleinstesElement() {
		Collections.min(elemente);

	}
}

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
		this.elemente = new Object[10];
		this.anzahlElemente = 0;

	}

	public <T> void hinzufuegen() {
		anzahlElemente = elemente.length;
		// wenn das momentane Array maximal gefüllt ist wird ein doppelt großes
		// Objektarray erstellt
		if (this.elemente.length == this.anzahlElemente) {
			Object[] neuesElemente = new Object[this.elemente.length * 2];
			// die Einträge werdenkopiert
			for (int i = 0; i < this.elemente.length; i++) {
				neuesElemente[i] = this.elemente[i];
			} // das neue Array wird typegecastetund dem Attributzugewiesen
			this.elemente = (T[]) neuesElemente;
		}
		this.elemente[this.anzahlElemente] = elemente;
		this.anzahlElemente++;
	}

	public int get(int index) {
		return (int) elemente[index];
	}

	public <T> void entfernen() {
		T t = null;
		for (int i = 0; i <= elemente.length; i++) {
			if (this.elemente[i] == t) {
				for (int j = i; j <= elemente.length - 1; j++) {
					this.elemente[j] = this.elemente[j + 1];
				}
				anzahlElemente = elemente.length - 1;
			}
		}
	}

	public void entferneElementAnIndex(int index) {
		for (int i = 0; i <= elemente.length; i++) {
			if (this.elemente[i] == elemente[index]) {
				for (int index2 = i; index2 <= elemente.length - 1; index2++) {
					this.elemente[index2] = this.elemente[index2 + 1];

				}
				anzahlElemente = elemente.length;
				this.anzahlElemente = this.anzahlElemente - 1;
			}
		}
	}

	public int getAnzahlElemente() {
		anzahlElemente = elemente.length;
		return anzahlElemente;

	}

	public String toString() {
		for (Object object : elemente) {
			System.out.println(object);
		}
		return "" + anzahlElemente;

	}

	public void getKleinstesElement() {

	}
}

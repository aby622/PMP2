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
		int laenge = elemente.length;
		if (laenge == elemente.length) {
			Object[] neuesElemente = new Object[laenge + 1];
			// die Einträge werdenkopiert
			for (int i = 0; i < laenge; i++) {
				neuesElemente[i] = elemente[i];
			} // das neue Array wird typegecastet und dem Attributt zugewiesen
			elemente = (T[]) neuesElemente;
		}
	}

	public T get(int index) {
		System.out.println(elemente[index]);
		return (T) elemente[index];
	}

	public <T> void entfernen() {
		int laenge = elemente.length;
		if (laenge == elemente.length) {
			Object[] neuesElemente = new Object[laenge - 1];
			int i = 0;
			// die Einträge werdenkopiert
			while (i > laenge) {
				neuesElemente[i] = elemente[i];
				i++;
			} // das neue Array wird typegecastet und dem Attributt zugewiesen
			elemente = (T[]) neuesElemente;
		}
	}

	public void entferneElementAnIndex(int index) {
		int laenge = elemente.length;
		Object[] neuesElemente = new Object[laenge - 1];
		for (Object object : elemente) {
			if (elemente[index] != elemente[index]) {
				int zaehler = 0;
				neuesElemente[zaehler] = elemente[zaehler];
				zaehler++;
			}
		}
		elemente = (T[]) neuesElemente;
	}

	public int getAnzahlElemente() {
		anzahlElemente = elemente.length;
		System.out.println(anzahlElemente);
		return anzahlElemente;

	}

	public String toString() {
		int elementenZahl;
		for (Object object : elemente) {
			System.out.println(object);
		}
		elementenZahl = elemente.length;
		return "" + "ANZAHL ELEMENTE: " + elementenZahl;

	}

	public void getKleinstesElement() {

	}

	public static void main(String[] args) {
		ArrayListe<Integer> liste1 = new ArrayListe<Integer>();
		System.out.println(liste1);
		liste1.hinzufuegen();
		System.out.println(liste1);
		liste1.get(3);
		liste1.getAnzahlElemente();
		System.out.println("entfernen");
		liste1.entfernen();
		System.out.println(liste1);
		liste1.entferneElementAnIndex(2);
		System.out.println(liste1);
		

	}
}

/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 1, Aufgabe 1.4
 */
package aufgabenblatt1;

/**
 * Klasse ArrayListe
 * 
 * @author Leon & Jannes
 */
public class ArrayListe<T> {

  /**
   * Array vom Typ Object und die Anzahl der Elemente
   */
  private Object[] elemente = {};

  /**
   * int anzahlElemente f�r Anzahl der Elemente
   */
  private int anzahlElemente;

  /**
   * Konstruktor
   */
  public ArrayListe() {
  }

  /**
   * Die Methode'hinzufuegen' f�gt der Arrayliste beliebige Elemente hinzu.
   */
  public void hinzufuegen(T element) {
	// Neue Arrayliste wird erstellt die ein Element mehr besitzt als die
	// Alte.
	Object[] neuesElemente = new Object[elemente.length + 1];
	// Elemente werden in die neue Liste kopiert.
	for (int i = 0; i < elemente.length; i++) {
	  neuesElemente[i] = elemente[i];
	}
	anzahlElemente = neuesElemente.length;
	// Das neue Element wird an die Liste angeh�ngt.
	neuesElemente[anzahlElemente - 1] = element;
	elemente = neuesElemente;
  }

  /**
   * Die Methode 'get' liefert das Element am Index.
   * @param rueckgabe
   * @return rueckgabe
   */
  @SuppressWarnings("unchecked")
  public T get(int index) {
	Object rueckgabe = 0;
	// Element am Index wird bestimmt
	for (int i = 0; i < elemente.length; i++) {
	  if (i == index) {
		rueckgabe = elemente[i];
	  }
	}
	return (T) rueckgabe;
  }

  /**
   * Die Methode 'entfernen' entfernt das gew�nschte Element aus der Arrayliste.
   * @param laenge ist die laenge des arrays -1 da am ende ein Element fehlt
   */
  public void entfernen(T element) {
	// Das Element bekommt den Wert null zugewiesen.
	for (int i = 0; i < elemente.length; i++) {
	  if (elemente[i] == element) {
		elemente[i] = null;
		break;
	  }
	}
	// Eine neue Liste, mit einem Element weniger wird erstellt.
	int laenge = elemente.length - 1;
	Object[] neuesElemente = new Object[laenge];
	int a = 0;
	// Alle Elemente werden aus der alten Liste kopiert, bis auf das Element
	// welches den Wert null hat.
	for (int i = 0; i < elemente.length; i++) {
	  if (elemente[i] != null) {
		neuesElemente[a] = elemente[i];
		a++;
	  }
	}
	elemente = neuesElemente;
  }

  /**
   * Die Methode 'entferneElementAnIndex' entfernt das Element welches sich an
   * dem Index befindet.
   * @param laenge elementen laenge -1 da ein Element sp�ter fehlt
   */
  public void entferneElementAnIndex(int index) {
	int laenge = elemente.length - 1;
	// Eine neue Liste mit einem Element weniger wird erstellt.
	// Das Element an Index wird entfernt und die �brigen Elemente r�cken
	// auf.
	Object[] neuesElemente = new Object[laenge];
	for (int i = 0; i < laenge; i++) {
	  neuesElemente[i] = elemente[i];
	}
	for (int i = index; i < laenge; i++) {
	  neuesElemente[i] = elemente[i + 1];
	}
	elemente = neuesElemente;
  }

  /**
   * Die Methode 'getAnzahlElemente' liefert die Anzahl der Elemente in der
   * Arrayliste.
   * @return anzahlElemente
   */
  public int getAnzahlElemente() {
	anzahlElemente = elemente.length;
	return anzahlElemente;
  }

  /**
   * Die Methode 'toString' gibt die Arrayliste als String wieder.
   * @return rueckgabe gibt String wieder
   */
  @Override
  public String toString() {
	String rueckgabe = "";
	// Die einzelnen Elemente werden dem String hinzugef�gt.
	int i = 0;
	while (i < elemente.length) {
	  rueckgabe += elemente[i] + " ";
	  i++;
	}
	return rueckgabe;
  }

  /**
   * Die Methode 'getKleinstesElement' �berpr�ft welches Element das Kleinste
   * ist und gibt dieses wieder.
   * @param ergebnis
   * @return ergebnis
   */
  @SuppressWarnings("unchecked")
  public T getKleinstesElement() {
	Object ergebnis = elemente[0];
	// Die Elemente werden miteinander verglichen und das kleinste wird
	// zur�ckgegeben
	int i = 0;
	while (i < elemente.length) {
	  if (elemente[i] instanceof Integer && (Integer) elemente[i] < (Integer) ergebnis) {
		ergebnis = elemente[i];
	  }
	  i++;
	}
	return (T) ergebnis;
  }

  /**
   * Die Methode 'berechne' gibt die Elemente der Arrayliste als Summe wieder.
   * @param ergebnis 
   * @return ergebnis
   */
  public int berechne() {
	int ergebnis = 0;
	// Die Elemente werden zusammen addiert.
	int i = 0;
	while (i < elemente.length) {
	  if (elemente[i] instanceof Integer) {
		ergebnis += (Integer) elemente[i];
	  }
	  i++;
	}
	return ergebnis;
  }

  /**
   * Methode getKleinstesElementNeu verwendet Comparable<T> damit wir beliebige
   * Elementtypen mieinander vergleichen k�nnen
   * @param ergebnis vom Typ T wird zum Vergleich ben�tigt
   * @param ergbnis2 vom Typ T wird zum Vergleich ben�tigt
   * @return ergebnis gibt das kleinste Element aus
   */
  @SuppressWarnings({ "unchecked", "hiding" })
  public <T extends Comparable<T>> T getKleinstesElementNEU() {
	T ergebnis = (T) elemente[0];
	// Die Elemente werden miteinander verglichen und das kleinste wird
	// zur�ckgegeben
	int i = 0;
	while (i < elemente.length) {
	  T original = (T) elemente[i];
	  if (original.compareTo(ergebnis) == -1) {
		ergebnis = (T) elemente[i];
	  }
	  i++;
	}
	return (T) ergebnis;
  }
}
package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitArrayListe {
  @Test
  public void testHinzufuegen() {
	ArrayListe<Integer> a = new ArrayListe<Integer>();
	ArrayListe<String> b = new ArrayListe<String>();
	a.hinzufuegen(1);
	a.hinzufuegen(2);
	a.hinzufuegen(3);
	b.hinzufuegen("A");
	b.hinzufuegen("B");
	b.hinzufuegen("C");
	String resultA = "1 2 3 ";
	String resultB = "A B C ";
	assertEquals(a.toString(), resultA);
	assertEquals(b.toString(), resultB);

  }

  @Test
  public void testEntferneElementAnIndex() {
	ArrayListe<Integer> a = new ArrayListe<Integer>();
	ArrayListe<String> b = new ArrayListe<String>();
	a.hinzufuegen(1);
	a.hinzufuegen(2);
	a.hinzufuegen(3);
	b.hinzufuegen("A");
	b.hinzufuegen("B");
	b.hinzufuegen("C");
	a.entferneElementAnIndex(1);
	b.entferneElementAnIndex(1);
	String resultA = "1 3 ";
	String resultB = "A C ";
	assertEquals(a.toString(), resultA);
	assertEquals(b.toString(), resultB);

  }

  @Test
  public void testEntferne() {
	ArrayListe<Integer> a = new ArrayListe<Integer>();
	ArrayListe<String> b = new ArrayListe<String>();
	a.hinzufuegen(1);
	a.hinzufuegen(2);
	a.hinzufuegen(3);
	b.hinzufuegen("A");
	b.hinzufuegen("B");
	b.hinzufuegen("C");
	a.entfernen(1);
	b.entfernen("A");
	String resultA = "2 3 ";
	String resultB = "B C ";
	assertEquals(a.toString(), resultA);
	assertEquals(b.toString(), resultB);

  }

  @Test
  public void testgetKleinstesElement() {
	ArrayListe<Integer> a = new ArrayListe<Integer>();
	ArrayListe<String> b = new ArrayListe<String>();
	a.hinzufuegen(1);
	a.hinzufuegen(2);
	a.hinzufuegen(3);
	b.hinzufuegen("A");
	b.hinzufuegen("B");
	b.hinzufuegen("C");
	String resultA = "1";
	String resultB = "A";
	assertEquals(a.getKleinstesElement().toString(), resultA);
	assertEquals(b.getKleinstesElement().toString(), resultB);

  }

  @Test
  public void testBerechne() {
	ArrayListe<Integer> a = new ArrayListe<Integer>();
	a.hinzufuegen(1);
	a.hinzufuegen(2);
	a.hinzufuegen(3);
	
	int resultA = 6;
	assertEquals(a.berechne(), resultA);
  }
  @Test
  public void testgetKleinstesElementNEU() {
	ArrayListe<Integer> a = new ArrayListe<Integer>();
	ArrayListe<String> b = new ArrayListe<String>();
	a.hinzufuegen(1);
	a.hinzufuegen(2);
	a.hinzufuegen(3);
	b.hinzufuegen("A");
	b.hinzufuegen("B");
	b.hinzufuegen("C");
	String resultA = "1";
	String resultB = "A";
	assertEquals(a.getKleinstesElementNEU().toString(), resultA);
	assertEquals(b.getKleinstesElementNEU().toString(), resultB);
  }
  @Test
  public void testgetAnzahlElemente() {
	ArrayListe<Integer> a = new ArrayListe<Integer>();
	ArrayListe<String> b = new ArrayListe<String>();
	a.hinzufuegen(1);
	a.hinzufuegen(2);
	a.hinzufuegen(3);
	b.hinzufuegen("A");
	b.hinzufuegen("B");
	b.hinzufuegen("C");
	int resultA = 3;
	int resultB = 3;
	assertEquals(a.getAnzahlElemente(), resultA);
	assertEquals(b.getAnzahlElemente(), resultB);
  }
  @Test
  public void testGet() {
	ArrayListe<Integer> a = new ArrayListe<Integer>();
	ArrayListe<String> b = new ArrayListe<String>();
	a.hinzufuegen(1);
	a.hinzufuegen(2);
	a.hinzufuegen(3);
	b.hinzufuegen("A");
	b.hinzufuegen("B");
	b.hinzufuegen("C");
	String resultA = "2";
	String resultB = "B";
	assertEquals(a.get(1).toString(), resultA);
	assertEquals(b.get(1).toString(), resultB);
  }
}

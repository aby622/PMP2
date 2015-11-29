/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2
 */
package aufgabenblatt2;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

/**
 * Testklasse für String Array
 * 
 * @author abx805
 *
 */
public class JUnitStreamStringArray {

  @Test
  public void testOriginalString() {

	String[] stringx = { "Eingabe ", "Äußeres ", null, "Strassen-Feger", " ein Haus" };
	List<String> resuErg = new LinkedList<String>();
	StringArray test = new StringArray();

	resuErg = test.verarbeiteArray(stringx);

	/*
	 * Ergebnis Liste
	 */
	List<String> result = new LinkedList<String>();
	result.add("EINGABE");
	result.add("AEUSSERE");
	result.add("STRASSEN");
	result.add("EIN HAUS");

	assertEquals(result, resuErg);
  }

  @Test
  public void testStringOnlyNull() {

	String[] stringx = { null, null, null, null, null };
	List<String> resuErg = new LinkedList<String>();
	StringArray test = new StringArray();

	resuErg = test.verarbeiteArray(stringx);

	/*
	 * Ergebnis Liste
	 */
	List<String> result = new LinkedList<String>();

	assertEquals(result, resuErg);
  }

  @Test
  public void testStringVariation() {

	String[] stringx = { "Ein ", "Hochseeschiffkoch aus Hamburg", null, null, "              A                      " };
	List<String> resuErg = new LinkedList<String>();
	StringArray test = new StringArray();

	resuErg = test.verarbeiteArray(stringx);
	/*
	 * Ergebnis Liste
	 */
	List<String> result = new LinkedList<String>();
	result.add("EIN");
	result.add("HOCHSEES");
	result.add("A");
	assertEquals(result, resuErg);
  }

  @Test
  public void testStringVariation2() {

	String[] stringx = { "      gabe ", "  ÄÜÖßßÄÖÜ     Ä   ", null, "1234  ABC äää  ", " ...         ...    ÄÖ A" };
	List<String> resuErg = new LinkedList<String>();
	StringArray test = new StringArray();

	resuErg = test.verarbeiteArray(stringx);

	/*
	 * Ergebnis Liste
	 */
	List<String> result = new LinkedList<String>();
	result.add("GABE");
	result.add("AEUEOESS");
	result.add("1234  AB");
	result.add("...");

	assertEquals(result, resuErg);
  }
}

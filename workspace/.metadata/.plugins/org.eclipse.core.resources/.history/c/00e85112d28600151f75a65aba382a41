package aufgabenblatt2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class JUnitStreamStringArray<T> {

  @Test
  @SuppressWarnings("unchecked")
  public void testOriginal() {

	String[] stringx = { "Eingabe ", "Äußeres ", null, "Strassen-Feger", " ein Haus" };
	List<String> liste = new LinkedList<String>();
	Stream<String> streamString;
	liste = Arrays.asList(stringx);

	/*
	 * Filtert Null Objekte aus
	 */
	streamString = liste.stream().filter(s -> s != null);
	liste = streamString.collect(Collectors.toList());

	/*
	 * entfernt Leerzeichen
	 */
	streamString = liste.stream().map(String::trim);
	liste = streamString.collect(Collectors.toList());

	/*
	 * Alles zu Capital Letters
	 */
	streamString = liste.stream().map(String::toUpperCase);
	liste = streamString.collect(Collectors.toList());

	/*
	 * Ersetzt Umlaute
	 */
	streamString = liste.stream().map(s -> s.replace("Ä", "AE"));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.replace("Ö", "OE"));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.replace("Ü", "UE"));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.replace("ß", "SS"));
	liste = streamString.collect(Collectors.toList());

	/*
	 * Kuerzt auf acht Ziffern
	 */
	streamString = liste.stream().map(s -> s + "        ");
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.substring(0, 8));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(String::trim);
	liste = streamString.collect(Collectors.toList());

	List<T> resuErg = new LinkedList<T>();
	for (String s : liste) {
	  resuErg.add((T) s);
	}

	/*
	 * Ergebnis Liste
	 */
	List<T> result = new LinkedList<T>();
	result.add((T) "EINGABE");
	result.add((T) "AEUSSERE");
	result.add((T) "STRASSEN");
	result.add((T) "EIN HAUS");

	assertEquals(result, resuErg);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testNeu() {

	String[] stringx = { null, null, null, null, null };
	List<String> liste = new LinkedList<String>();
	Stream<String> streamString;
	liste = Arrays.asList(stringx);

	/*
	 * Filtert Null Objekte aus
	 */
	streamString = liste.stream().filter(s -> s != null);
	liste = streamString.collect(Collectors.toList());

	/*
	 * entfernt Leerzeichen
	 */
	streamString = liste.stream().map(String::trim);
	liste = streamString.collect(Collectors.toList());

	/*
	 * Alles zu Capital Letters
	 */
	streamString = liste.stream().map(String::toUpperCase);
	liste = streamString.collect(Collectors.toList());

	/*
	 * Ersetzt Umlaute
	 */
	streamString = liste.stream().map(s -> s.replace("Ä", "AE"));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.replace("Ö", "OE"));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.replace("Ü", "UE"));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.replace("ß", "SS"));
	liste = streamString.collect(Collectors.toList());

	/*
	 * Kuerzt auf acht Ziffern
	 */
	streamString = liste.stream().map(s -> s + "        ");
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.substring(0, 8));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(String::trim);
	liste = streamString.collect(Collectors.toList());

	List<T> resuErg = new LinkedList<T>();
	for (String s : liste) {
	  resuErg.add((T) s);
	}

	/*
	 * Ergebnis Liste
	 */
	List<T> result = new LinkedList<T>();

	assertEquals(result, resuErg);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testNeu2() {

	String[] stringx = { "Ein ", "Hochseeschiffkoch aus Hamburg", null, null, "              A                      " };
	List<String> liste = new LinkedList<String>();
	Stream<String> streamString;
	liste = Arrays.asList(stringx);

	/*
	 * Filtert Null Objekte aus
	 */
	streamString = liste.stream().filter(s -> s != null);
	liste = streamString.collect(Collectors.toList());

	/*
	 * entfernt Leerzeichen
	 */
	streamString = liste.stream().map(String::trim);
	liste = streamString.collect(Collectors.toList());

	/*
	 * Alles zu Capital Letters
	 */
	streamString = liste.stream().map(String::toUpperCase);
	liste = streamString.collect(Collectors.toList());

	/*
	 * Ersetzt Umlaute
	 */
	streamString = liste.stream().map(s -> s.replace("Ä", "AE"));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.replace("Ö", "OE"));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.replace("Ü", "UE"));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.replace("ß", "SS"));
	liste = streamString.collect(Collectors.toList());

	/*
	 * Kuerzt auf acht Ziffern
	 */
	streamString = liste.stream().map(s -> s + "        ");
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.substring(0, 8));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(String::trim);
	liste = streamString.collect(Collectors.toList());

	List<T> resuErg = new LinkedList<T>();
	for (String s : liste) {
	  resuErg.add((T) s);
	}

	/*
	 * Ergebnis Liste
	 */
	List<T> result = new LinkedList<T>();
	result.add((T) "EIN");
	result.add((T) "HOCHSEES");
	result.add((T) "A");

	assertEquals(result, resuErg);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testNeu3() {

	String[] stringx = { "      gabe ", "  ÄÜÖßßÄÖÜ     Ä   ", null, "1234  ABC äää  ", " ...         ...    ÄÖ A" };
	List<String> liste = new LinkedList<String>();
	Stream<String> streamString;
	liste = Arrays.asList(stringx);

	/*
	 * Filtert Null Objekte aus
	 */
	streamString = liste.stream().filter(s -> s != null);
	liste = streamString.collect(Collectors.toList());

	/*
	 * entfernt Leerzeichen
	 */
	streamString = liste.stream().map(String::trim);
	liste = streamString.collect(Collectors.toList());

	/*
	 * Alles zu Capital Letters
	 */
	streamString = liste.stream().map(String::toUpperCase);
	liste = streamString.collect(Collectors.toList());

	/*
	 * Ersetzt Umlaute
	 */
	streamString = liste.stream().map(s -> s.replace("Ä", "AE"));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.replace("Ö", "OE"));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.replace("Ü", "UE"));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.replace("ß", "SS"));
	liste = streamString.collect(Collectors.toList());

	/*
	 * Kuerzt auf acht Ziffern
	 */
	streamString = liste.stream().map(s -> s + "        ");
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(s -> s.substring(0, 8));
	liste = streamString.collect(Collectors.toList());
	streamString = liste.stream().map(String::trim);
	liste = streamString.collect(Collectors.toList());

	List<T> resuErg = new LinkedList<T>();
	for (String s : liste) {
	  resuErg.add((T) s);
	}

	/*
	 * Ergebnis Liste
	 */
	List<T> result = new LinkedList<T>();
	result.add((T) "GABE");
	result.add((T) "AEUEOESS");
	result.add((T) "1234  AB");
	result.add((T) "...");

	assertEquals(result, resuErg);
  }
}

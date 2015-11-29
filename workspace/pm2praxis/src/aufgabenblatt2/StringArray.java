/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2
 */
package aufgabenblatt2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Klasse StringArray soll StringArray verarbeiten
 * @author abx805
 *
 */
public class StringArray {
  /**
   * Methode verarbeiteArray verarbeitet ein String Array
   * @param string
   * @return
   */
public List<String> verarbeiteArray(String[] string) {
	
	List<String> liste = new LinkedList<String>();
	Stream<String> streamString;
	liste = Arrays.asList(string);
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

	List<String> resuErg = new LinkedList<String>();
	for (String s : liste) {
	  resuErg.add(s);

	}
	return resuErg;
  }

}

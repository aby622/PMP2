/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 3
 */
package aufgabenblatt2;

/**
 * Klasse Rennauto
 * 
 * @author Leon, Jannes
 *
 */
public class Rennauto extends Thread implements Comparable<Rennauto> {
  /**
   * private double streckenlaenge
   */
  private double streckenlaenge;
  /**
   * private double streckenlaenge1
   */
  private double streckenlaenge1 = 0.0;
  /**
   * private double zeit
   */
  private double zeit;
  /**
   * private String name
   */
  private String name;

  /**
   * Konstruktor
   * 
   * @param name
   * @param streckenlaenge
   */
  public Rennauto(String name, double streckenlaenge) {
	this.name = name;
	this.streckenlaenge = streckenlaenge;
  }

  /**
   * Getter
   * 
   * @return
   */
  public double getZeit() {
	return zeit;
  }

  /**
   * Getter
   * 
   * @return
   */
  public String getNames() {
	return name;
  }

  /**
   * Override run Methode
   */
  @Override
  public void run() {
	while (!isInterrupted()) {
	  long geschwindigkeit = (long) (Math.random() * 400 + 800);
	  zeit += geschwindigkeit;
	  streckenlaenge1++;

	  System.err.println(name + ": " + streckenlaenge1 + "/10.0");

	  if (streckenlaenge1 == streckenlaenge) {
		interrupt();
	  }

	  try {
		Thread.sleep(geschwindigkeit);
	  } catch (InterruptedException e) {
		try {
		  Thread.sleep(2000);
		  interrupt();
		  zeit = zeit / 1000;
		  zeit = Math.round(10.0 * zeit) / 10.0;
		} catch (InterruptedException e1) {
		  e1.printStackTrace();
		}
	  }
	}
  }

  /**
   * Override CompareTo Methode und Autos nach der Zeit zu sortieren.
   */
  @Override
  public int compareTo(Rennauto auto) {
	int ergebnis = 0;
	if(getZeit() < auto.getZeit()){
	  ergebnis = -1;
	}
	if(getZeit() == auto.getZeit()){
	  ergebnis = 0;
	}
	if(getZeit() > auto.getZeit()){
	  ergebnis = 1;
	}
	return ergebnis;
  }
}

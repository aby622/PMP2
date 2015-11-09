/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 3
 */
package aufgabenblatt2;

/**
 * Klasse Rennabbruch
 * 
 * @author Leon, Jannes
 *
 */
public class Rennabbruch extends Thread {
  /**
   * private Rennauto auto1
   */
  private Rennauto auto1;
  /**
   * private Rennauto auto2
   */
  private Rennauto auto2;
  /**
   * private Rennauto auto3
   */
  private Rennauto auto3;
  
  private double runden;

  /**
   * Konstruktor
   * 
   * @param auto1
   * @param auto2
   * @param auto3
   */
  public Rennabbruch(Rennauto auto1, Rennauto auto2, Rennauto auto3, double runden) {
	this.auto1 = auto1;
	this.auto2 = auto2;
	this.auto3 = auto3;
	this.runden = runden;
  }

  /**
   * Override run Methode
   */
  @Override
  public void run() {
	while (!isInterrupted()) {
	  int zaehler = 1;
	  int abbruch = (int) (10 * Math.random() + 1);
	  zaehler++;
	  try {
		Thread.sleep(1000);
	  } catch (InterruptedException e) {
		interrupt();
	  }

	  if (abbruch == 5) {
		auto1.interrupt();
		auto2.interrupt();
		auto3.interrupt();
		interrupt();
		System.out.println("Rennabbruch");
	  }

	  if (zaehler == runden) {
		interrupt();
	  }
	}
  }

}

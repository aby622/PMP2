/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 3, Aufgabe 3
 */

package aufgabenblatt3;

import java.util.Observable;

/**
 * Klasse Simulation extends Observable implements Runnable simuliert zwei
 * Lokf�hrer die ein und ausfahren auf zuf�llige Gleise im Bereich 0-2
 * 
 * @author Leon
 *
 */
public class Simu extends Observable implements Runnable {
  /**
   * Rangierbahnhof bahnhof
   */
  protected RangierBf bahnhof = new RangierBf();

  /**
   * Konstruktor
   * 
   * @param bahnhof
   */
  public Simu(RangierBf bahnhof) {
	this.bahnhof = bahnhof;
  }

  /**
   * Getter
   * 
   * @return
   */
  public RangierBf getBahnhof() {
	return bahnhof;
  }

  /**
   * @Override run Methode erstellt zwei Lokf�hrer die ein und ausfahren, ihr
   *           Zielgleis wird alle x-millis neu festgelegt.
   */
  @Override
  public void run() {
	LokFr erster = new LokFr(new Einfahren(), bahnhof);
	LokFr zweiter = new LokFr(new Ausfahren(), bahnhof);
	while (!Thread.currentThread().isInterrupted()) {
	  try {
		Thread.sleep(500);
		int zufall1 = (int) (3 * Math.random());
		erster.parken(bahnhof.zuege, zufall1);
		setChanged();
		notifyObservers();
	  } catch (InterruptedException e) {
	  }
	  try {
		Thread.sleep(500);
		int zufall = (int) (3 * Math.random());
		zweiter.parken(bahnhof.zuege, zufall);
		setChanged();
		notifyObservers();
	  } catch (InterruptedException e) {
	  }
	}
  }
}

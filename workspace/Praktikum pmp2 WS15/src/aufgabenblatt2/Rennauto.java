/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 3
 */
package aufgabenblatt2;

public class Rennauto extends Thread {

  private double rennstrecke;
  private double rennzeit;
  String name;

  public Rennauto(String name) {
	this.rennstrecke = 0.0;
	this.name = name;
  }

  public double getRennzeit() {
	return this.rennzeit;
  }

  @Override
  public void run() {
	while (!isInterrupted()) {
	  while (rennstrecke < 10) {
		long aktuellerSpeed = (long) (Math.random() * (1200 - 800) + 800);
		rennzeit += aktuellerSpeed;
		rennstrecke++;
		System.err.println("  " + name + ": " + rennstrecke + "/10.0");

		if (rennstrecke == 10) {
		  interrupt();
		}
		try {
		  Thread.sleep(aktuellerSpeed);
		} catch (InterruptedException e) {
		  try {
			Thread.sleep(2000);
			interrupt();
			System.err.println(name + ": " + rennzeit + "Sekunden");
		  } catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		  }
		}
	  }
	}
  }
}

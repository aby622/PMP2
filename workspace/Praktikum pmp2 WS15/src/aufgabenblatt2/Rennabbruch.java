/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 3
 */
package aufgabenblatt2;

public class Rennabbruch extends Thread {
  private Rennauto golf;
  private Rennauto benz;
  private Rennauto audi;

  public Rennabbruch(Rennauto golf, Rennauto benz, Rennauto audi) {
	this.golf = golf;
	this.benz = benz;
	this.audi = audi;
  }

  @Override
  public void run() {
	while (!isInterrupted()) {
	  for (int i = 1; !isInterrupted(); i++) {
		int rennabbruchLos = (int) (Math.random() * (11 + 1) + 1);
		try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
		  interrupt();
		}
		System.out.println(rennabbruchLos);
		if (rennabbruchLos == 3) {
		  interrupt();
		  golf.interrupt();
		  benz.interrupt();
		  audi.interrupt();
		  System.out.println("Rennabbruch");
		}
		if (i == 10) {
		  interrupt();
		}
	  }
	}
  }
  public static void main(String[] args) {
	Rennauto golf = new Rennauto("golf");
	Rennauto benz = new Rennauto("benz");
	Rennauto audi = new Rennauto("audi");
	Rennabbruch achtung = new Rennabbruch(golf, benz, audi);
	achtung.start();
	golf.start();
	benz.start();
	audi.start();

	System.out.println("Das Rennen ist beendet.\n" + "Ergebnis: \n" + "golf: " + golf.getRennzeit() + "\nbenz: "
	    + benz.getRennzeit() + "\naudi: " + audi.getRennzeit());
  }
}

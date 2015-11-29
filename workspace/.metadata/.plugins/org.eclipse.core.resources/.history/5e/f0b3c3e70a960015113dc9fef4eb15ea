package aufgabenblatt3;

import java.util.Observable;



public class Simulation extends Observable implements Runnable {

  public Rangierbahnhof bahnhof = new Rangierbahnhof();

  public Simulation(Rangierbahnhof bahnhof) {
	this.bahnhof = bahnhof;
	setChanged();
	notifyObservers();
  }

	  @Override
	  public void run() {
		try {
		  int zufall1 = (int) (2 * Math.random() + 1);
		  int zufall2 = (int) (2 * Math.random() + 1);
		  int zufall3 = (int) (2 * Math.random() + 1);
		  int zufall4 = (int) (2 * Math.random() + 1);
		  Thread.sleep(500);
		  Lokfuehrer erster = new Lokfuehrer(new Einfahren(), bahnhof);
		  erster.parken(zufall1);
		  Lokfuehrer zweiter = new Lokfuehrer(new Ausfahren(), bahnhof);
		  zweiter.parken(zufall2);
		  Lokfuehrer dritter = new Lokfuehrer(new Einfahren(), bahnhof);
		  dritter.parken(zufall3);
		  Lokfuehrer vierter = new Lokfuehrer(new Ausfahren(), bahnhof);
		  vierter.parken(zufall4);
		} catch (InterruptedException e) {
		}
  }
}

package aufgabenblatt3;

import java.util.Observable;


public class Simulation extends Observable implements Runnable {

  public Rangierbahnhof bahnhof = new Rangierbahnhof();

  public Simulation(Rangierbahnhof bahnhof) {
	this.bahnhof = bahnhof;
	setChanged();
	notifyObservers();
  }

  public Rangierbahnhof getBahnhof() {
	return bahnhof;
  }

  @Override
  public void run() {
	while(true){
	try {
	  Thread.sleep(500);
	  int zufall4 = (int) (2 * Math.random() + 1);
	  Lokfuehrer vierter = new Lokfuehrer(new Ausfahren(), bahnhof);
	  vierter.parken(bahnhof.getZug(), zufall4);
	  int zufall1 = (int) (2 * Math.random() + 1);
	  Lokfuehrer erster = new Lokfuehrer(new Einfahren(), bahnhof);
	  erster.parken(bahnhof.getZug(), zufall1);
	} catch (InterruptedException e) {
	}
	setChanged();
	notifyObservers();
	}
  }
}

package aufgabenblatt3;

public class Simulation implements Runnable {


  
  @Override
  public void run() {
	Rangierbahnhof bahnhof = new Rangierbahnhof();
	  try {
		Thread.sleep(500);
		Lokfuehrer erster = new Lokfuehrer(new Einfahren(), bahnhof);
		erster.parken(0);
	  } catch (InterruptedException e) {
		
		}
  }

}
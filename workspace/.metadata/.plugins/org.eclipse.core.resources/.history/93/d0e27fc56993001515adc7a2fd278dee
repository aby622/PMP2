package aufgabenblatt3;

public class Simulation implements Runnable {

  Rangierbahnhof bahnhof1 = new Rangierbahnhof(3);
  
  @Override
  public void run() {
	int gleis = 0;
	try {
	  Thread.sleep(500);
	  gleis = (int) (3 * Math.random() + 1);
	} catch (InterruptedException e) {
	  Lokfuehrer jim = new Lokfuehrer(bahnhof1, gleis);
	  jim.start();
	}
  }

}

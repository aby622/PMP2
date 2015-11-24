package aufgabenblatt3;

public class Lokfuehrer extends Thread {

  private Rangierbahnhof bf;
  private int gleis;

  public Lokfuehrer(Rangierbahnhof bf, int gleis) {
	this.bf = bf;
	this.gleis = gleis;
  }

  @Override
  public void run() {
	while (!isInterrupted()) {
	  try {
		wait();
	  } catch (InterruptedException e) {
	  }
	}
	synchronized(getClass()) {
	  Lokfuehrer lok1 = new Lokfuehrer(bf, gleis);
	  lok1.bf.ausfahren(gleis);
	  System.err.println("ausgefahren");
	}
	synchronized(getClass()) {
	  Lokfuehrer lok2 = new Lokfuehrer(bf, gleis);
	  lok2.bf.einfahren(gleis);
	  System.err.println("eingefahren");
	}
  }
}

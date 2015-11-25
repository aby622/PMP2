package aufgabenblatt3;

public class Rangierbahnhof {

  private int anzahlGleise;

  private Zug[] zuege = new Zug[anzahlGleise];
  
  public Rangierbahnhof(int anzahlGleise){
	this.anzahlGleise = anzahlGleise;
  }

  public synchronized void ausfahren(int gleis) {
	while (zuege[gleis] == null) {
	  try {
		wait();
	  } catch (InterruptedException e) {
	  }
	}
	zuege[gleis] = null;
  }

  public synchronized void einfahren(int gleis) {
	while (zuege[gleis] != new Zug()) {
	  try {
		wait();
	  } catch (InterruptedException e) {
	  }
	}
	zuege[gleis] = new Zug();
  }
}

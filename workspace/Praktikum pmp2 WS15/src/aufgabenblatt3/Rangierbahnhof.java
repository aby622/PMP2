package aufgabenblatt3;

public class Rangierbahnhof {

  private int anzahlGleise = 3;

  private Zug[] zuege = new Zug[anzahlGleise];

  public synchronized void ausfahren(int gleis) {
	while (zuege[gleis] == null) {
	  try {
		wait();
	  } catch (InterruptedException e) {
	  }
	}
	zuege[gleis] = null;
	System.err.println("ausfahren");
  }

  public synchronized void einfahren(int gleis) {
	while (zuege[gleis] != new Zug()) {
	  try {
		wait();
	  } catch (InterruptedException e) {
	  }
	}
	zuege[gleis] = new Zug();
	System.err.println("eingefahren");
  }
}

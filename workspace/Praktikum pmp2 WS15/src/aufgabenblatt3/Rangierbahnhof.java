package aufgabenblatt3;

public class Rangierbahnhof {

  private int anzahlGleise = 3;

  private Zug[] zuege = new Zug[anzahlGleise];

  public synchronized void ausfahren(int gleis) {
	if (zuege[gleis] instanceof Zug) {
	  zuege[gleis] = null;
	  System.err.println("ausfahren");
	  notify();
	}

  }

  public synchronized void einfahren(int gleis) {
	if(zuege[gleis] == null) {
	zuege[gleis] = new Zug();
	System.err.println("eingefahren");
	notify();
	}

  }
}

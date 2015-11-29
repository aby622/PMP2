package aufgabenblatt3;

public class Rangierbahnhof {

  private int anzahlGleise = 3;

  protected Zug[] zuege = new Zug[anzahlGleise];

  public Zug[] getZug() {
	return zuege;
  }

  public synchronized void ausfahren(Zug[] zug ,int gleis) {
	
	if (zug[gleis] instanceof Zug) {
	  try {
		zug[gleis] = null;
		zuege = zug;
		System.err.println("ausfahren");
		System.err.println("" +  zuege[0]+"   " + zuege[1]+"   " + zuege[2]);
		wait();
	  } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	}
	notify();
  }
  
  public synchronized void einfahren(Zug[] zug, int gleis) {
	if (zug[gleis] == null) {
	  try {
		zug[gleis] = new Zug();
		zuege = zug;
		System.err.println("eingefahren");
		System.err.println("" +  zuege[0]+"   " + zuege[1]+"   " + zuege[2]);
		wait();
	  } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	}
	notify();
  }
}

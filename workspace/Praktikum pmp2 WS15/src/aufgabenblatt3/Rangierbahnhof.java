package aufgabenblatt3;

import javax.lang.model.type.NullType;

public class Rangierbahnhof {

  private int anzahlGleise = 3;

  private Zug[] zuege = new Zug[anzahlGleise];
  
  public Zug[] getZug(){
	return zuege;
  }

  public synchronized void ausfahren(int gleis) {
	if (zuege[gleis] instanceof NullType) {
	  try {
			wait();
		  } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	}
	  zuege[gleis] = null;
	  System.err.println("ausfahren");
	  notify();
  }

  public synchronized void einfahren(int gleis) {
	if(zuege[gleis] instanceof Zug) {
	  try {
			wait();
		  } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	}
	zuege[gleis] = new Zug();
	System.err.println("eingefahren");
	notify();
  }
}

package aufgabenblatt4;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Polygon extends Observable {
 
  private List<Punkt> punkte;

  public Polygon() {
	punkte = new ArrayList<Punkt>();
  }

  private class Punkt {

	private int x;
	private int y;

	public Punkt(int x, int y) {
	  setzeKoordinaten(x, y);
	}
	public int getY() {
	  return y;
	}
	public int getX() {
	  return x;
	}	
	public void setzeKoordinaten(int x1, int y1) {
	  x1 = x;
	  y1 = y;
	}
  }


  public synchronized void addPunkt(int x, int y) {
	punkte.add(new Punkt(x, y));
	notifyAll();
  }

  public int getY(int index) {
	return punkte.get(index).getY();
  }

  public int getX(int index) {
	return punkte.get(index).getX();
  }

  public int getAnzahlPunkte() {
	return punkte.size();
  }


}
package aufgabenblatt4;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class PolygonModell extends Observable implements Observer {

  private List<Polygon> polygone;

  private Polygon thisPolygon;

  public PolygonModell() {
	polygone = new ArrayList<>();
	thisPolygon = new Polygon();
	thisPolygon.addObserver(this);
  }

  public synchronized void finishPolygone() {
	polygone.add(thisPolygon);
	thisPolygon = new Polygon();
	thisPolygon.addObserver(this);
	notifyAll();
  }

  public synchronized void cancelPolygone() {
	thisPolygon.deleteObserver(this);
	thisPolygon = new Polygon();
	thisPolygon.addObserver(this);
	notifyAll();
  }

  @Override
  public void update(Observable arg0, Object arg1) {
	notifyAll();
  }
}

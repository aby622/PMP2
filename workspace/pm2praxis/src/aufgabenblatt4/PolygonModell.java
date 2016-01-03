package fertig;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Die Klasse verwaltet die Liste der erstellten Polygone
 * 
 *
 */
public class PolygonModell extends Observable implements Observer {
  /**
   * Liste der Polygone
   */
  private List<Polygon> polygone = new ArrayList<Polygon>();
  private Polygon thisPolygon;

  /**
   * Kostruktor
   * 
   * @param polygon
   * 
   */
  public PolygonModell(Polygon polygon) {
	thisPolygon = polygon;
  }

  /**
   * Kostruktor
   */
  public PolygonModell(Observer o) {
	thisPolygon = new Polygon(this);
	addObserver(o);
  }

  /**
   * Getter
   * 
   * @return liefert das Polygon
   */
  public Polygon getPolygon() {
	return thisPolygon;
  }

  /**
   * Getter
   * 
   * @return liefert die Liste der Polygone
   */
  public List<Polygon> getListePolygone() {
	return polygone;
  }

  /**
   * Methode zum abschliessen der Bearbeitung eines Polygons
   */
  public void bearbeitungZuEnde() {
	thisPolygon.toString();
	polygone.add(thisPolygon);
	thisPolygon = new Polygon(this);
	thisPolygon.addObserver(this);
	setChanged();
	notifyObservers();
  }

  /**
   * �berschreiben der toString Methode
   * 
   * @return Info �ber die Anzahl der Polygone in der Liste
   */
  @Override
  public String toString() {
	return polygone.size() + "Polygone in der Liste. Aktuelles Polygon: " + thisPolygon.toString();
  }

  @Override
  public void update(Observable o, Object arg) {
	setChanged();
	notifyObservers();
  }

} 

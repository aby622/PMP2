package aufgabenblatt4;

import java.util.Observable;
import java.util.Observer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class PolygonDarstellung extends Canvas implements Observer {

  public PolygonDarstellung() {
	super(400, 400);
  }

  public void zeichnePolygon(Polygon polygonD) {
	
	
	GraphicsContext gc = getGraphicsContext2D();
	
	
	gc.clearRect(0, 0, getWidth(), getHeight());
	gc.setFill(Color.WHITE);
	
	gc.fillRect(0, 0, getWidth(), getHeight());
	gc.setStroke(Color.BLACK); 
	
	
	
	for (int i = 0; i < polygonD.getAnzahlPunkte(); i++) {
	  int x = polygonD.getX(i);
	  int y = polygonD.getY(i);
	  gc.strokeOval(x + 5, y + 5, 20, 20);
	  
	}
  }
  
  @Override
  public void update(Observable arg0, Object arg1) {
	
	
  }
}

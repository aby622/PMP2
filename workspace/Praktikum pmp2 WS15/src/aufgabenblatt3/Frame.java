/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 3, Aufgabe 4
 */

package aufgabenblatt3;

import java.util.Observable;
import java.util.Observer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

/**
 * Klasse Frame extends Apllicants implements Observer beobachtet Klasse
 * Simulation und reagiert auf Ver�nderungen
 * 
 * @author Leon
 */
public class Frame extends Application implements Observer {
  /**
   * Zug[] zuege
   */
  private Zug[] zuege;
  /**
   * GridPane thisGridPane
   */
  private GridPane thisGridPane = new GridPane();

  /**
   * Main
   * 
   * @param args
   */
  public static void main(String[] args) {
	Application.launch();
  }

  /**
   * Konstruktor
   */
  public Frame() {
	Simulation obs = new Simulation(new Rangierbahnhof());
	obs.addObserver(this);
	new Thread(obs).start();
	zuege = obs.getBahnhof().getZug();
  }

  /**
   * @Override start Methode
   */
  @Override
  public void start(Stage primaryStage) {
	StackPane root = new StackPane();
	root.getChildren().add(thisGridPane);
	primaryStage.setTitle("Bahnhof");
	primaryStage.setScene(new Scene(root, 200, 300));
	primaryStage.show();
  }

  /**
   * Zeichnet den Bahnhof und f�gt der GridPane Zuege hinzu wenn der jeweilige
   * Zug[] index einer Instanz von der Klasse Zug entspricht.
   * 
   * @param zuege
   * @param gridpane
   * @return
   */
  private GridPane setzeZugIf(Zug[] zuege, GridPane gridpane) {
	gridpane.setPadding(new Insets(5));
	gridpane.setHgap(5);
	gridpane.setVgap(5);
	Pane bahnhof = new Pane();
	Pane bahnhof1 = new Pane();
	Pane bahnhof2 = new Pane();
	addBahnhof(bahnhof);
	addBahnhof(bahnhof1);
	addBahnhof(bahnhof2);
	gridpane.add(bahnhof, 0, 0);
	gridpane.add(bahnhof1, 0, 1);
	gridpane.add(bahnhof2, 0, 2);
	if (zuege[0] instanceof Zug) {
	  Pane zug = new Pane();
	  addZug(zug);
	  gridpane.add(zug, 0, 0);
	}
	if (zuege[1] instanceof Zug) {
	  Pane zug1 = new Pane();
	  addZug(zug1);
	  gridpane.add(zug1, 0, 1);
	}
	if (zuege[2] instanceof Zug) {
	  Pane zug2 = new Pane();
	  addZug(zug2);
	  gridpane.add(zug2, 0, 2);
	}
	return gridpane;
  }

  /**
   * F�gt einer Pane eine 2D Zeichnung hinzu, die den Bahnhof repres�ntieren
   * soll.
   * 
   * @param bahnhof
   */
  private void addBahnhof(Pane bahnhof) {
	Path path = new Path();
	MoveTo moveTo = new MoveTo();
	moveTo.setX(150);
	moveTo.setY(0);
	LineTo lineTo1 = new LineTo();
	lineTo1.setX(0);
	lineTo1.setY(0);
	LineTo lineTo2 = new LineTo();
	lineTo2.setX(0);
	lineTo2.setY(75);
	LineTo lineTo3 = new LineTo();
	lineTo3.setX(150);
	lineTo3.setY(75);
	path.getElements().add(moveTo);
	path.getElements().add(lineTo1);
	path.getElements().add(lineTo2);
	path.getElements().add(lineTo3);
	path.setStrokeType(StrokeType.CENTERED);
	path.setStrokeWidth(3);
	path.setStroke(Color.BLACK);
	bahnhof.getChildren().add(path);
  }

  /**
   * F�gt einer Pane eine 2D Zeichnung hinzu, die den Bahnhof repr�sentieren
   * soll.
   * 
   * @param zug
   */
  private void addZug(Pane zug) {
	Path path = new Path();
	MoveTo moveTo = new MoveTo();
	moveTo.setX(140);
	moveTo.setY(10);
	LineTo lineTo1 = new LineTo();
	lineTo1.setX(10);
	lineTo1.setY(10);
	LineTo lineTo2 = new LineTo();
	lineTo2.setX(10);
	lineTo2.setY(65);
	LineTo lineTo3 = new LineTo();
	lineTo3.setX(140);
	lineTo3.setY(65);
	LineTo lineTo4 = new LineTo();
	lineTo4.setX(140);
	lineTo4.setY(10);
	path.getElements().add(moveTo);
	path.getElements().add(lineTo1);
	path.getElements().add(lineTo2);
	path.getElements().add(lineTo3);
	path.getElements().add(lineTo4);
	path.setStrokeType(StrokeType.CENTERED);
	path.setStrokeWidth(3);
	path.setStroke(Color.BLACK);
	zug.getChildren().add(path);
  }

  /**
   * @Override update Methode aktualisiert thisGridPane und setzt die neuen Z�ge
   *           durch Methode setzeZugIf.
   */
  @Override
  public void update(Observable o, Object arg) {
	zuege = ((Simulation) o).getBahnhof().getZug();
	Platform.runLater(new Runnable() {
	  @Override
	  public void run() {
		thisGridPane.getChildren().clear();
		thisGridPane = setzeZugIf(zuege, thisGridPane);
	  }
	});
  }
}
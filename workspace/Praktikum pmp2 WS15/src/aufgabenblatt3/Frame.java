package aufgabenblatt3;

import java.util.Observable;
import java.util.Observer;

import javafx.application.Application;
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

public class Frame extends Application implements Observer {

  private Rangierbahnhof bahnhof = new Rangierbahnhof();
  private Simulation simu = new Simulation(bahnhof);

  public static void main(String[] args) {

	launch(args);
  }

  @Override
  public void start(Stage primaryStage) {

	Frame frame = new Frame();
	simu.addObserver(frame);
	
	Zug[] zuege = simu.bahnhof.getZug();
	update(simu, zuege);
	StackPane root = new StackPane();

	GridPane gridpane = new GridPane();

	root.getChildren().add(gridpane);

	gridpane = setzeZugIf(zuege, gridpane);
	
	primaryStage.setTitle("Bahnhof");
	primaryStage.setScene(new Scene(root, 200, 300));
	primaryStage.show();
  }

  private GridPane setzeZugIf(Zug[] zuege, GridPane gridpane) {

	gridpane.setPadding(new Insets(5));
	gridpane.setHgap(5);
	gridpane.setVgap(5);

	Pane bahnhof = new Pane();
	Pane zug = new Pane();
	addBahnhof(bahnhof);
	addZug(zug);
	Pane bahnhof1 = new Pane();
	Pane zug1 = new Pane();
	addBahnhof(bahnhof1);
	addZug(zug1);
	Pane bahnhof2 = new Pane();
	Pane zug2 = new Pane();
	addBahnhof(bahnhof2);
	addZug(zug2);
	Pane zug3 = new Pane();
	addZug(zug3);
	
	gridpane.add(bahnhof, 0, 0);
	gridpane.add(bahnhof1, 0, 1);
	gridpane.add(bahnhof2, 0, 2);

	if (zuege[0] instanceof Zug) {
	  gridpane.add(zug, 0, 0);
	}
	if (zuege[1] instanceof Zug) {
	  gridpane.add(zug1, 0, 1);
	}
	if (zuege[2] instanceof Zug) {
	  gridpane.add(zug2, 0, 2);
	}

	return gridpane;

  }

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

  @Override
  public void update(Observable o, Object arg) {
	bahnhof.getZug();

  }

}

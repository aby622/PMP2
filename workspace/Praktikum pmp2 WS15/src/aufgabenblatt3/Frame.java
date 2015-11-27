package aufgabenblatt3;

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
import javafx.stage.Stage;

public class Frame extends Application {

  public static void main(String[] args) {
	launch(args);
  }

  @Override
  public void start(Stage primaryStage){
	primaryStage.setTitle("Bahnhof");
	
	
	StackPane root = new StackPane();
	GridPane gridpane = new GridPane();
	root.getChildren().add(gridpane);
	gridpane.setPadding(new Insets(5));
	gridpane.setHgap(5);
	gridpane.setVgap(5);
	GridPane gridpane2 = new GridPane();
	root.getChildren().add(gridpane2);
	gridpane2.setPadding(new Insets(15));
	gridpane2.setHgap(15);
	gridpane2.setVgap(15);
	addBahnhof(gridpane);
	addZug(gridpane2);
	primaryStage.setScene(new Scene(root, 200, 300));
	primaryStage.show();
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
	path.setStrokeWidth(3);
	path.setStroke(Color.BLACK);
	zug.getChildren().add(path);
  }




}

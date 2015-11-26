package aufgabenblatt3;

import javafx.application.Application;
import javafx.scene.Scene;
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

  private void addBahnhof(Pane bahnhof) {
	Path path = new Path();
	MoveTo moveTo = new MoveTo();
	moveTo.setX(0);
	moveTo.setY(0);
	LineTo lineTo1 = new LineTo();
	lineTo1.setX(150);
	lineTo1.setY(0);
	MoveTo moveTo2 = new MoveTo();
	moveTo.setX(0);
	moveTo.setY(10);
	LineTo lineTo2 = new LineTo();
	lineTo2.setX(150);
	lineTo2.setY(20);
	MoveTo moveTo3 = new MoveTo();
	moveTo.setX(0);
	moveTo.setY(150);
	LineTo lineTo3 = new LineTo();
	lineTo3.setX(150);
	lineTo3.setY(30);
	
	path.getElements().add(moveTo);
	path.getElements().add(lineTo1);	
	path.getElements().add(moveTo2);
	path.getElements().add(lineTo2);
	path.getElements().add(moveTo3);
	path.getElements().add(lineTo3);


	path.setStrokeWidth(3);
	path.setStroke(Color.BLACK);
	bahnhof.getChildren().add(path);
  }

  @Override
  public void start(Stage primaryStage){
	primaryStage.setTitle("Bahnhof");
	
	
	StackPane root = new StackPane();
	addBahnhof(root);
	
	primaryStage.setScene(new Scene(root, 500, 500));
	primaryStage.show();
  }


}

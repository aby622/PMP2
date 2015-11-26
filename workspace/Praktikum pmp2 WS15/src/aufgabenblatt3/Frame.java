package aufgabenblatt3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
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
	moveTo.setY(100);
	bahnhof.getChildren().add(path);
  }

  @Override
  public void start(Stage primaryStage){
	primaryStage.setTitle("Bahnhof");
	
	
	StackPane root = new StackPane();
	addBahnhof(root);
	
	primaryStage.setScene(new Scene(root, 300, 100));
	primaryStage.show();
  }


}
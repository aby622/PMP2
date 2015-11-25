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

  private void addBahnhof(Pane bahnhof) {
	Path path = new Path();
	MoveTo moveTo = new MoveTo();
	moveTo.setX(0);
	moveTo.setY(100);
	bahnhof.getChildren().add(path);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
	primaryStage.setTitle("Bahnhof");
	GridPane gridpane = new GridPane();
	gridpane.setPadding(new Insets(5));
	gridpane.setHgap(5);
	gridpane.setVgap(5);
	StackPane root = new StackPane();
	root.getChildren().add(gridpane);
	
	primaryStage.setScene(new Scene(root, 300, 100));
	primaryStage.show();
  }

  public static void main(String[] args) {
	launch(args);
  }
}

package aufgabenblatt4;

import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFxGUI extends Application {

  private Stage primaryStage;

  private final int width = 700;
  private final int height = 700;

  private PolygonDarstellung zeichenFlaeche;

  public JavaFxGUI(Stage primaryStageD) {
	primaryStage = primaryStageD;
	try {
	  start(primaryStageD);
	} catch (Exception e) {
	  e.printStackTrace();
	}
  }

  @Override
  public void start(Stage primaryStagePar) throws Exception {
	primaryStage.setTitle("Interaktiver Zeicheneditor fuer Polygone");
	primaryStage.setScene(new Scene(javaFxGui(), width, height));
	primaryStage.show();
	Polygon polygon = new Polygon();
	polygon.addPunkt(10, 10);
	zeichenFlaeche.zeichnePolygon(polygon);
  }

  private Pane javaFxGui() {
	BorderPane pane = new BorderPane();
	pane.setRight(polygoneListe());
	pane.setCenter(zeichenflaeche());
	pane.setBottom(befehlsEingabe());
	return pane;
  }

  private Pane befehlsEingabe() {
	BorderPane pane = new BorderPane();
	TextArea eingabe = new TextArea();
	pane.setCenter(eingabe);
	pane.setBottom(buttonBefehle());
	return pane;
  }

  private Pane buttonBefehle() {
	HBox pane = new HBox();
	Button bestaetige = new Button("Bestaetigen");
	Button verschieben = new Button("Verschieben");
	pane.getChildren().addAll(bestaetige, verschieben);
	return pane;
  }

  private PolygonDarstellung zeichenflaeche() {
	zeichenFlaeche = new PolygonDarstellung();
	return zeichenFlaeche;
  }

  // LISTE FERTIGER POLYGONE
  private Pane polygoneListe() {
	ObservableList<List> oList = FXCollections.observableArrayList();
	Label label = new Label("Polygon");
	
	TableView table = new TableView();
	table.setEditable(true);
	BorderPane pane = new BorderPane();

	table.setItems(oList);
	pane.setCenter(table);
	return pane;
  }
}

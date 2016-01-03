package fertig;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Die Klasse stellt das Benutzerinterace dar
 * 
 *
 */
public class JavaFxGUI extends Application {

  /**
   * Variablen
   */
  private Stage primaryStage;
  private Pane pane;
  private TableView<Polygon> tabelle;
  private PolygonTabelle polygonTabelle;
  private TextArea flaeche;
  private PolygonSkripting regulaererAusdruck = new PolygonSkripting();
  private final int width, height;
  private PolygonDarstellung zeichenFlaeche;

  /**
   * Konstruktor
   */
  public JavaFxGUI() {
	height = 700;
	width = 700;
  }

  /**
   * Getter
   * 
   * @return pane
   */
  public Pane getPane() {
	return pane;
  }

  /**
   * Die Methode erstellt die GUI
   * 
   * @return pane
   */
  private Pane erstellePane() {
	BorderPane pane = new BorderPane();
	pane.setRight(polygonTabelle());
	pane.setCenter(zeichenflaeche());
	pane.setBottom(befehlInput());
	return pane;
  }

  /**
   * Die Methode erstellt die Buttons
   * 
   * @return pane
   */
  private Pane befehlButtons() {
	HBox pane = new HBox();
	Button befehl = new Button("Eingabe");
	befehl.setOnAction(event -> {
	  String text = flaeche.getText();
	  try {
		zeichenFlaeche.getModell().getPolygon().setPunkt(regulaererAusdruck.getX(text), regulaererAusdruck.getY(text));
		flaeche.clear();
	  } catch (Exception e) {
		flaeche.setText("Ungültiger Befehl!");
	  }
	});
	Button fertig = new Button("Fertig");
	fertig.setOnAction(event -> {
	  zeichenFlaeche.getModell().bearbeitungZuEnde();
	  polygonTabelle.updateTabelle();
	  flaeche.clear();
	});
	pane.getChildren().addAll(befehl, fertig);
	return pane;
  }

  /**
   * Die Methode erstellt die Polygondarstellung
   * 
   * @return Gibt die PolygonDarstellung zurueck
   */
  private Pane zeichenflaeche() {
	StackPane pane = new StackPane();
	zeichenFlaeche = new PolygonDarstellung(pane);
	return pane;
  }

  /**
   * Die Methode erstellt die Befehlseingabe
   * 
   * @return pane
   */
  private Pane befehlInput() {
	BorderPane pane = new BorderPane();
	flaeche = new TextArea();
	flaeche.setMaxHeight(50);
	pane.setCenter(flaeche);
	pane.setBottom(befehlButtons());
	return pane;
  }

  /**
   * Die Methode erstellt eine Tabelle der Polygone
   * 
   * @return pane
   */
  private Pane polygonTabelle() {
	BorderPane pane = new BorderPane();
	tabelle = new TableView<Polygon>();
	pane.setCenter(tabelle);
	return pane;
  }

  /**
   * Die Methode baut die GUI
   */
  @Override
  public void start(Stage primaryStagePar) {
	primaryStage = primaryStagePar;
	primaryStage.setTitle("Zeicheneditor");
	pane = erstellePane();
	primaryStage.setScene(new Scene(pane, width, height));
	PolygonModell modell = new PolygonModell(zeichenFlaeche);
	zeichenFlaeche.setModell(modell);
	polygonTabelle = new PolygonTabelle(this.tabelle, modell);
	polygonTabelle.erstelleTabelle();
	primaryStage.show();
  }

  /**
   * Programmstart
   */
  public static void main(String[] args) {
	launch(args);
  }
}
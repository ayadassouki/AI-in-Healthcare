import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Results {
    private Scene scene;

    public Results(Stage primaryStage) {
        VBox vbox = new VBox(20);
        Text title = new Text("List of Matching Treatments");
        title.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        ObservableList<String> treatments = FXCollections.observableArrayList("Treatment A", "Treatment B",
                "Treatment C", "Treatment D", "Treatment E", "Treatment F", "Treatment G", "Treatment H");
        ListView<String> listView = new ListView<>(treatments);
        vbox.getChildren().addAll(title, listView);
        this.scene = new Scene(vbox, 400, 400);
    }

    public Scene getScene() {
        return scene;
    }
}

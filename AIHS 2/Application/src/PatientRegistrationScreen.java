import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PatientRegistrationScreen {
    private Scene scene;

    public PatientRegistrationScreen(Stage primaryStage) {
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20, 20, 20, 20));

        TextField patientNameField = new TextField();
        patientNameField.setPromptText("Enter patient name");

        ToggleGroup diabetesGroup = new ToggleGroup();
        RadioButton type1Radio = new RadioButton("Type 1");
        type1Radio.setToggleGroup(diabetesGroup);
        RadioButton type2Radio = new RadioButton("Type 2");
        type2Radio.setToggleGroup(diabetesGroup);

        CheckBox pregnancyCheckbox = new CheckBox("Pregnancy");
        CheckBox allergyCheckbox = new CheckBox("Allergy");
        CheckBox medicationCheckbox = new CheckBox("Already taking prescribed Medication");
        CheckBox geneticDiseaseCheckbox = new CheckBox("Genetic Disease");
        CheckBox cardioCheckbox = new CheckBox("Cardio");

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            Results resultsScreen = new Results(primaryStage);
            primaryStage.setScene(resultsScreen.getScene());
        });

        vbox.getChildren().addAll(new Text("Enter patient name: "), patientNameField,
                new Text("Select type of diabetes: "), type1Radio, type2Radio,
                new Text("Select all conditions that apply: "), pregnancyCheckbox, allergyCheckbox,
                medicationCheckbox, geneticDiseaseCheckbox, cardioCheckbox, submitButton);

        this.scene = new Scene(vbox, 300, 500);
    }

    public Scene getScene() {
        return scene;
    }
}

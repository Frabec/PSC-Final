package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends Parent implements Initializable{
	@FXML Text attack;
	@FXML Text normal;
	@FXML
	private void handleBrowserButonAction(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		 fileChooser.setTitle("Open Resource File");
		 fileChooser.getExtensionFilters().addAll(
		         new ExtensionFilter("Text Files", "*.txt"));
		 File selectedFile = fileChooser.showOpenDialog(Main.primaryStage); //Le fichier est ensuite sélectionné pour être passé par le programme
		 
	}
	@FXML
	private void handleAnalysisButonAction (ActionEvent event) {
		attack.visibleProperty().set(true);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		attack.visibleProperty().set(false);
		normal.visibleProperty().set(false);
			
	}
}

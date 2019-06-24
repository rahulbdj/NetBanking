package application;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class ComboboxController implements Initializable{
	@FXML
public Label occupation;
@FXML
public ComboBox<String> combobox;
ObservableList<String> list=FXCollections.observableArrayList("Service","Business","Student","Farmer","Others");
@Override
public void initialize(URL location, ResourceBundle resources) {
	combobox.setItems(list);// TODO Auto-generated method stub
	
}

public void comboboxaction(ActionEvent event) {
	occupation.setText(combobox.getValue());
}

}

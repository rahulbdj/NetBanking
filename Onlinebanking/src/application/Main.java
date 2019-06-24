package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("frontpage.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 
	public void login(ActionEvent event) {
		Parent a;
				try {
					a=FXMLLoader.load(getClass().getResource("Login.fxml"));
					Scene b = new Scene(a);
					Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
					window.setScene(b);
					window.show();
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
	}
	
	
		
	public static void main(String[] args) {
		launch(args);
	}
}

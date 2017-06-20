package chap17.sec07.exam01_button;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/* 버튼 컨트롤 이벤트 처리 */
public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = (Parent)FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

package Testing;


import applicationModule.BoardUIElement;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class DesiredUI extends Application {

	
	//LAUNCH APPLICATION
	//*************************************************
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BoardUIElement board=new BoardUIElement();
		//03_Set Final Scene
		Scene scene=new Scene(board.getBoard());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	



	
}





















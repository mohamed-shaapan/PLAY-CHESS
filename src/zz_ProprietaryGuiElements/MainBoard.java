package zz_ProprietaryGuiElements;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class MainBoard extends Application {
	
	//01_ATTRIBUTES
	//*************************************************************
	private Initializer initializer;
	private Pane layout;
	
	
	//02_RUN APPLICATION
	//*************************************************************
	public static void main(String[] args) {
		launch(args);
	}

	//*************************************************************
	public void start(Stage primaryStage) throws Exception {
		
		//01_Initialize Application
		initializer=new Initializer(this);
		initializer.initialize();
		
		//02_show final window
		Scene scene=new Scene(layout);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Chess Game");
		//primaryStage.setMinHeight(550);
		//primaryStage.setMinWidth(900);
		primaryStage.show();
	}
	

	//03_SOME GETTERS
	//*************************************************************
	public void setLayout(Pane layout){
		this.layout=layout;
	}
	
	

	
}



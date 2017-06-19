package applicationModule;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class PendingInterface extends Application {
	
	//private Stage primaryWindow;
	//private Pane layout;
	private Rectangle[] whiteBlocks;
	private Rectangle[] coloredBlocks;
	private GridPane innerField;

	private void initializeElements(){
		whiteBlocks=new Rectangle[32];
		coloredBlocks=new Rectangle[32];
		innerField=new GridPane();
	}
	
	private void setElementStyling(){
		createBlocks();
		innerField.setPadding(new Insets(30,30,30,30));
		innerField.setGridLinesVisible(true);
		//innerField.setVgap(60);
		//innerField.setHgap(60);
	}
	
	private void initializeWindowLayout(){
		addBlocks();
	}

		
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		initializeElements();
		setElementStyling();
		initializeWindowLayout();
		
		
		
		//01_Initialize Application
			//initializeApplication();
			//primaryWindow=primaryStage;
		//02_Set the final Scene:
			Scene scene=new Scene(innerField);
			primaryStage.setScene(scene);
			//primaryStage.setResizable(false);
			//primaryStage.setMinHeight(550);
			//primaryStage.setMinWidth(900);
		//03_Set Hot Keys----------------------------------------------
			//setHotKeyEvents();
			primaryStage.show();
		
	}
	
	private void createBlocks(){
		for(int i=1; i<=32; i++){
			Rectangle whiteBlock=new Rectangle(60,60);
			whiteBlock.setFill(Color.SANDYBROWN);
			whiteBlocks[i-1]=whiteBlock;
			whiteBlock.setOnMouseClicked(e ->{
				System.out.println("A7A");
			});
			
			Rectangle coloredBlock=new Rectangle(60,60);
			coloredBlock.setFill(Color.CHOCOLATE);
			coloredBlocks[i-1]=coloredBlock;
		}
	}
	
	private void addBlocks(){
		int pointer1=1;
		int pointer2=1;
		for(int row=1; row<=8; row++){
			if(row%2==0){
				for(int col=1; col<=8; col++){
					if(col%2==0){
						innerField.add(whiteBlocks[pointer1-1], row-1, col-1);
						pointer1++;
					}else{
						innerField.add(coloredBlocks[pointer2-1], row-1, col-1);
						pointer2++;
					}
				}
			}else{
				for(int col=1; col<=8; col++){
					if(col%2==0){
						innerField.add(coloredBlocks[pointer2-1], row-1, col-1);
						pointer2++;
					}else{
						innerField.add(whiteBlocks[pointer1-1], row-1, col-1);
						pointer1++;
					}
				}
			}
		}
		
	}
	


	
}





















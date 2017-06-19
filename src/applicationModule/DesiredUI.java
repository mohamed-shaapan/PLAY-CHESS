package applicationModule;


import java.io.FileInputStream;
import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class DesiredUI extends Application {
	

	//01_APPLICATION ELEMENTS
	//*************************************************
	private Rectangle[] whiteBlocks;
	private Rectangle[] coloredBlocks;
	private GridPane innerField;

	
	//02_LAUNCH APPLICATION
	//*************************************************
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//01_Initialize Application
		initializeElements();
		setElementStyling();
		initializeWindowLayout();
		
		//02_Do extra stuff
		String fileLoc="resources/images/white_team/queen.png";
		InputStream location = new FileInputStream(fileLoc);
        ImageView img=new ImageView(new Image(location));
        innerField.add(img, 5, 5);

		//03_Set Final Scene
		Scene scene=new Scene(innerField);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	//*********************************************************
	//*********************************************************
	//*********************************************************
	private void initializeElements(){
		whiteBlocks=new Rectangle[32];
		coloredBlocks=new Rectangle[32];
		innerField=new GridPane();
	}
	
	private void setElementStyling(){
		createBlocks();
		innerField.setPadding(new Insets(30,30,30,30));
		innerField.setGridLinesVisible(true);
	}
	
	private void initializeWindowLayout(){
		addBlocks();
	}

		
	//*********************************************************
	//*********************************************************
	//*********************************************************
	private void createBlocks(){
		for(int i=1; i<=32; i++){
			Rectangle whiteBlock=new Rectangle(60,60);
			whiteBlock.setFill(Color.SANDYBROWN);
			whiteBlocks[i-1]=whiteBlock;
			
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





















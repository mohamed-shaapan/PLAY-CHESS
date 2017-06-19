package applicationModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BoardUI{
	
	
	//01_ATTRIBUTES
	//*************************************************
	private Rectangle[] whiteBlocks;
	private Rectangle[] coloredBlocks;
	private GridPane boardLayout;
	
	
	//02_CONSTRUCTOR
	//*************************************************
	public BoardUI() throws FileNotFoundException{
		//initialize board
		initializeElements();
		setElementStyling();
		initializeWindowLayout();
		//do some extra stuff
		/*String fileLoc="resources/images/white_team/queen.png";
		InputStream location = new FileInputStream(fileLoc);
        ImageView img=new ImageView(new Image(location));
        boardLayout.add(img, 5, 5);*/
		
	}
	
	//03_PRIVATE METHODS
	//*********************************************************
	private void initializeElements(){
		whiteBlocks=new Rectangle[32];
		coloredBlocks=new Rectangle[32];
		boardLayout=new GridPane();
	}
	
	private void setElementStyling(){
		createBlocks();
		boardLayout.setPadding(new Insets(30,30,30,30));
		boardLayout.setGridLinesVisible(true);
	}
	
	private void initializeWindowLayout() throws FileNotFoundException{
		addBlocks();
		addPieces();
	}

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
						boardLayout.add(whiteBlocks[pointer1-1], row-1, col-1);
						pointer1++;
					}else{
						boardLayout.add(coloredBlocks[pointer2-1], row-1, col-1);
						pointer2++;
					}
				}
			}else{
				for(int col=1; col<=8; col++){
					if(col%2==0){
						boardLayout.add(coloredBlocks[pointer2-1], row-1, col-1);
						pointer2++;
					}else{
						boardLayout.add(whiteBlocks[pointer1-1], row-1, col-1);
						pointer1++;
					}
				}
			}
		}
		
	}
	
	private void addPieces() throws FileNotFoundException{
		String whiteTeamLoc="resources/images/white_team/";
		//String blackTeamLoc="resources/images/white_team/";
		
		String imgLoc=whiteTeamLoc+"king.png";
		InputStream location = new FileInputStream(imgLoc);
        ImageView img=new ImageView(new Image(location));
        boardLayout.add(img, 5, 5);
	}
	
	//*********************************************************
	//*********************************************************
	
	//04_INTERFACE METHODS
	public Pane getBoard(){
		return boardLayout;
	}
	
	public void applyMove(int fromRow, int fromCol, int toRow, int toCol){
		
	}
	
	public void removePiece(int row, int col){
		
	}
	
	public void revivePromotePiece(int row, int col, String team, String pieceName){
		
	}
	


	
}





















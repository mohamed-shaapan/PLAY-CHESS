package applicationModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

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
	private ImageView boardPieces[][];
	
	
	//02_CONSTRUCTOR
	//*************************************************
	public BoardUI() throws FileNotFoundException{
		
		initializeBoardElements();
		setBoardStyling();
		initializeBoardLayout();
		
	}
	
	//03_PRIVATE METHODS
	//*********************************************************
	private void initializeBoardElements(){
		boardPieces=new ImageView[8][8];
		whiteBlocks=new Rectangle[32];
		coloredBlocks=new Rectangle[32];
		boardLayout=new GridPane();
	}
	
	private void setBoardStyling(){
		createBoardBlocks();
		boardLayout.setPadding(new Insets(30,30,30,30));
		boardLayout.setGridLinesVisible(true);
	}
	
	private void initializeBoardLayout() throws FileNotFoundException{
		addBlocksToLayout();
		addPiecesToLayout();
	}

	//*********************************************************
	private void createBoardBlocks(){
		for(int i=1; i<=32; i++){
			Rectangle whiteBlock=new Rectangle(65,65);
			whiteBlock.setFill(Color.SANDYBROWN);
			whiteBlocks[i-1]=whiteBlock;
			
			Rectangle coloredBlock=new Rectangle(65,65);
			coloredBlock.setFill(Color.CHOCOLATE);
			coloredBlocks[i-1]=coloredBlock;
		}
	}
	
	private void addBlocksToLayout(){
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
	
	//*********************************************************
	private void addPiecesToLayout() throws FileNotFoundException{
		createWhitePieces();
		createBlackPieces();
	}
	
	private void createWhitePieces() throws FileNotFoundException{
		String whiteTeamLoc="resources/images/white_team/";
		
        ImageView king=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"king.png")));
        ImageView queen=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"queen.png")));
        ImageView bishop1=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"bishop.png")));
        ImageView bishop2=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"bishop.png")));
        ImageView knight1=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"knight.png")));
        ImageView knight2=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"knight.png")));
        ImageView rook1=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"rook.png")));
        ImageView rook2=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"rook.png")));
        ImageView pawn1=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"pawn.png")));
        ImageView pawn2=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"pawn.png")));
        ImageView pawn3=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"pawn.png")));
        ImageView pawn4=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"pawn.png")));
        ImageView pawn5=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"pawn.png")));
        ImageView pawn6=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"pawn.png")));
        ImageView pawn7=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"pawn.png")));
        ImageView pawn8=new ImageView(new Image(new FileInputStream(whiteTeamLoc+"pawn.png")));
        
        boardLayout.add(king, 4, 7); boardPieces[7][4]=king;
        boardLayout.add(queen, 3, 7); boardPieces[7][3]=queen;
        boardLayout.add(bishop1, 2, 7); boardPieces[7][2]=bishop1;
        boardLayout.add(bishop2, 5, 7); boardPieces[7][5]=bishop2;
        boardLayout.add(knight1, 1, 7); boardPieces[7][1]=knight1;
        boardLayout.add(knight2, 6, 7); boardPieces[7][6]=knight2;
        boardLayout.add(rook1, 0, 7); boardPieces[7][0]=rook1;
        boardLayout.add(rook2, 7, 7); boardPieces[7][7]=rook2;
        boardLayout.add(pawn1, 0, 6); boardPieces[6][0]=pawn1;
        boardLayout.add(pawn2, 1, 6); boardPieces[6][1]=pawn2;
        boardLayout.add(pawn3, 2, 6); boardPieces[6][2]=pawn3;
        boardLayout.add(pawn4, 3, 6); boardPieces[6][3]=pawn4;
        boardLayout.add(pawn5, 4, 6); boardPieces[6][4]=pawn5;
        boardLayout.add(pawn6, 5, 6); boardPieces[6][5]=pawn6;
        boardLayout.add(pawn7, 6, 6); boardPieces[6][6]=pawn7;
        boardLayout.add(pawn8, 7, 6); boardPieces[6][7]=pawn8;
	}
	
	private void createBlackPieces() throws FileNotFoundException{
		String blackTeamLoc="resources/images/black_team/";
		
        ImageView king=new ImageView(new Image(new FileInputStream(blackTeamLoc+"king.png")));
        ImageView queen=new ImageView(new Image(new FileInputStream(blackTeamLoc+"queen.png")));
        ImageView bishop1=new ImageView(new Image(new FileInputStream(blackTeamLoc+"bishop.png")));
        ImageView bishop2=new ImageView(new Image(new FileInputStream(blackTeamLoc+"bishop.png")));
        ImageView knight1=new ImageView(new Image(new FileInputStream(blackTeamLoc+"knight.png")));
        ImageView knight2=new ImageView(new Image(new FileInputStream(blackTeamLoc+"knight.png")));
        ImageView rook1=new ImageView(new Image(new FileInputStream(blackTeamLoc+"rook.png")));
        ImageView rook2=new ImageView(new Image(new FileInputStream(blackTeamLoc+"rook.png")));
        ImageView pawn1=new ImageView(new Image(new FileInputStream(blackTeamLoc+"pawn.png")));
        ImageView pawn2=new ImageView(new Image(new FileInputStream(blackTeamLoc+"pawn.png")));
        ImageView pawn3=new ImageView(new Image(new FileInputStream(blackTeamLoc+"pawn.png")));
        ImageView pawn4=new ImageView(new Image(new FileInputStream(blackTeamLoc+"pawn.png")));
        ImageView pawn5=new ImageView(new Image(new FileInputStream(blackTeamLoc+"pawn.png")));
        ImageView pawn6=new ImageView(new Image(new FileInputStream(blackTeamLoc+"pawn.png")));
        ImageView pawn7=new ImageView(new Image(new FileInputStream(blackTeamLoc+"pawn.png")));
        ImageView pawn8=new ImageView(new Image(new FileInputStream(blackTeamLoc+"pawn.png")));
        
        boardLayout.add(king, 4, 0); boardPieces[0][4]=king;
        boardLayout.add(queen, 3, 0); boardPieces[0][3]=queen;
        boardLayout.add(bishop1, 2, 0); boardPieces[0][2]=bishop1;
        boardLayout.add(bishop2, 5, 0); boardPieces[0][5]=bishop2;
        boardLayout.add(knight1, 1, 0); boardPieces[0][1]=knight1;
        boardLayout.add(knight2, 6, 0); boardPieces[0][6]=knight2;
        boardLayout.add(rook1, 0, 0); boardPieces[0][0]=rook1;
        boardLayout.add(rook2, 7, 0); boardPieces[0][7]=rook2;
        boardLayout.add(pawn1, 0, 1); boardPieces[1][0]=pawn1;
        boardLayout.add(pawn2, 1, 1); boardPieces[1][1]=pawn2;
        boardLayout.add(pawn3, 2, 1); boardPieces[1][2]=pawn3;
        boardLayout.add(pawn4, 3, 1); boardPieces[1][3]=pawn4;
        boardLayout.add(pawn5, 4, 1); boardPieces[1][4]=pawn5;
        boardLayout.add(pawn6, 5, 1); boardPieces[1][5]=pawn6;
        boardLayout.add(pawn7, 6, 1); boardPieces[1][6]=pawn7;
        boardLayout.add(pawn8, 7, 1); boardPieces[1][7]=pawn8;
	}
	
	//*********************************************************
	//*********************************************************
	
	//04_INTERFACE METHODS
	public Pane getBoard(){
		return boardLayout;
	}
	
	public void applyMove(int fromRow, int fromCol, int toRow, int toCol){
		//remove from current location
		ImageView piece=boardPieces[fromRow][fromCol];
		boardLayout.getChildren().remove(piece);
		boardPieces[fromRow][fromCol]=null;
		//add to new location
		boardLayout.add(piece, toCol, toRow);
		boardPieces[toRow][toCol]=piece;
	}
	
	public void removePiece(int row, int col){
		ImageView piece=boardPieces[row][col];
		boardLayout.getChildren().remove(piece);
	}
	
	public void revivePromotePiece(int row, int col, String team, String pieceName){
		
	}
	


	
}





















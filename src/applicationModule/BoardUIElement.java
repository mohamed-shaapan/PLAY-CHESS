package applicationModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class BoardUIElement{
	
	
	//01_ATTRIBUTES
	//*************************************************
	final int cellSize=65;
	private Rectangle[] whiteBlocks;
	private Rectangle[] coloredBlocks;
	private GridPane innerBoard;
	private ImageView boardPieces[][];
	private HashMap<Rectangle, Integer[]> boardCells;
	private GridPane overallBoardShape;
	
	
	//02_CONSTRUCTOR
	//*************************************************
	public BoardUIElement() throws FileNotFoundException{
		
		initializeBoardElements();
		setBoardStyling();
		initializeBoardLayout();
		setActionListeners();
		createOverallBoard();
		
	}
	
	//03_PRIVATE METHODS
	//*********************************************************
	private void initializeBoardElements(){
		boardPieces=new ImageView[8][8];
		boardCells=new HashMap<Rectangle, Integer[]>();
		whiteBlocks=new Rectangle[32];
		coloredBlocks=new Rectangle[32];
		innerBoard=new GridPane();
		overallBoardShape=new GridPane();
	}
	
	private void setBoardStyling(){
		createBoardBlocks();
		innerBoard.setGridLinesVisible(true);
	}
	
	private void initializeBoardLayout() throws FileNotFoundException{
		addBlocksToLayout();
		addPiecesToLayout();
	}

	//*********************************************************
	private void createBoardBlocks(){
		for(int i=1; i<=32; i++){
			Rectangle whiteBlock=new Rectangle(cellSize,cellSize);
			whiteBlock.setFill(Color.SANDYBROWN);
			whiteBlocks[i-1]=whiteBlock;
			
			Rectangle coloredBlock=new Rectangle(cellSize,cellSize);
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
						innerBoard.add(whiteBlocks[pointer1-1], row-1, col-1);
						//boardCells[row-1][col-1]=whiteBlocks[pointer1-1];
						boardCells.put(whiteBlocks[pointer1-1], new Integer[]{row-1, col-1});
						pointer1++;
					}else{
						innerBoard.add(coloredBlocks[pointer2-1], row-1, col-1);
						boardCells.put(coloredBlocks[pointer2-1], new Integer[]{row-1, col-1});
						pointer2++;
					}
				}
			}else{
				for(int col=1; col<=8; col++){
					if(col%2==0){
						innerBoard.add(coloredBlocks[pointer2-1], row-1, col-1);
						boardCells.put(coloredBlocks[pointer2-1], new Integer[]{row-1, col-1});
						pointer2++;
					}else{
						innerBoard.add(whiteBlocks[pointer1-1], row-1, col-1);
						boardCells.put(whiteBlocks[pointer1-1], new Integer[]{row-1, col-1});
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
        
        innerBoard.add(king, 4, 7); boardPieces[7][4]=king;
        innerBoard.add(queen, 3, 7); boardPieces[7][3]=queen;
        innerBoard.add(bishop1, 2, 7); boardPieces[7][2]=bishop1;
        innerBoard.add(bishop2, 5, 7); boardPieces[7][5]=bishop2;
        innerBoard.add(knight1, 1, 7); boardPieces[7][1]=knight1;
        innerBoard.add(knight2, 6, 7); boardPieces[7][6]=knight2;
        innerBoard.add(rook1, 0, 7); boardPieces[7][0]=rook1;
        innerBoard.add(rook2, 7, 7); boardPieces[7][7]=rook2;
        innerBoard.add(pawn1, 0, 6); boardPieces[6][0]=pawn1;
        innerBoard.add(pawn2, 1, 6); boardPieces[6][1]=pawn2;
        innerBoard.add(pawn3, 2, 6); boardPieces[6][2]=pawn3;
        innerBoard.add(pawn4, 3, 6); boardPieces[6][3]=pawn4;
        innerBoard.add(pawn5, 4, 6); boardPieces[6][4]=pawn5;
        innerBoard.add(pawn6, 5, 6); boardPieces[6][5]=pawn6;
        innerBoard.add(pawn7, 6, 6); boardPieces[6][6]=pawn7;
        innerBoard.add(pawn8, 7, 6); boardPieces[6][7]=pawn8;
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
        
        innerBoard.add(king, 4, 0); boardPieces[0][4]=king;
        innerBoard.add(queen, 3, 0); boardPieces[0][3]=queen;
        innerBoard.add(bishop1, 2, 0); boardPieces[0][2]=bishop1;
        innerBoard.add(bishop2, 5, 0); boardPieces[0][5]=bishop2;
        innerBoard.add(knight1, 1, 0); boardPieces[0][1]=knight1;
        innerBoard.add(knight2, 6, 0); boardPieces[0][6]=knight2;
        innerBoard.add(rook1, 0, 0); boardPieces[0][0]=rook1;
        innerBoard.add(rook2, 7, 0); boardPieces[0][7]=rook2;
        innerBoard.add(pawn1, 0, 1); boardPieces[1][0]=pawn1;
        innerBoard.add(pawn2, 1, 1); boardPieces[1][1]=pawn2;
        innerBoard.add(pawn3, 2, 1); boardPieces[1][2]=pawn3;
        innerBoard.add(pawn4, 3, 1); boardPieces[1][3]=pawn4;
        innerBoard.add(pawn5, 4, 1); boardPieces[1][4]=pawn5;
        innerBoard.add(pawn6, 5, 1); boardPieces[1][5]=pawn6;
        innerBoard.add(pawn7, 6, 1); boardPieces[1][6]=pawn7;
        innerBoard.add(pawn8, 7, 1); boardPieces[1][7]=pawn8;
	}
	
	
	private void createOverallBoard(){
		
		//row names
		overallBoardShape.add(new Label("a"), 1, 0); overallBoardShape.add(new Label("a"), 1, 9);
		overallBoardShape.add(new Label("b"), 2, 0); overallBoardShape.add(new Label("b"), 2, 9);
		overallBoardShape.add(new Label("c"), 3, 0); overallBoardShape.add(new Label("c"), 3, 9);
		overallBoardShape.add(new Label("d"), 4, 0); overallBoardShape.add(new Label("d"), 4, 9);
		overallBoardShape.add(new Label("e"), 5, 0); overallBoardShape.add(new Label("e"), 5, 9);
		overallBoardShape.add(new Label("f"), 6, 0); overallBoardShape.add(new Label("f"), 6, 9);
		overallBoardShape.add(new Label("g"), 7, 0); overallBoardShape.add(new Label("g"), 7, 9);
		overallBoardShape.add(new Label("h"), 8, 0); overallBoardShape.add(new Label("h"), 8, 9);
		for(Node tmp: overallBoardShape.getChildren()){
			Label label=(Label)tmp;
			label.setMinSize(cellSize, 40);
			label.setAlignment(Pos.CENTER); //GridPane.setHalignment(label, HPos.RIGHT);
			label.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
		}

		//column names
		overallBoardShape.add(new Label("1"), 0, 1); overallBoardShape.add(new Label("1"), 9, 1);
		overallBoardShape.add(new Label("2"), 0, 2); overallBoardShape.add(new Label("2"), 9, 2);
		overallBoardShape.add(new Label("3"), 0, 3); overallBoardShape.add(new Label("3"), 9, 3);
		overallBoardShape.add(new Label("4"), 0, 4); overallBoardShape.add(new Label("4"), 9, 4);
		overallBoardShape.add(new Label("5"), 0, 5); overallBoardShape.add(new Label("5"), 9, 5);
		overallBoardShape.add(new Label("6"), 0, 6); overallBoardShape.add(new Label("6"), 9, 6);
		overallBoardShape.add(new Label("7"), 0, 7); overallBoardShape.add(new Label("7"), 9, 7);
		overallBoardShape.add(new Label("8"), 0, 8); overallBoardShape.add(new Label("8"), 9, 8);
		for(int index=16; index<overallBoardShape.getChildren().size(); index++){
			Node tmp=overallBoardShape.getChildren().get(index);
			Label label=(Label)tmp;
			label.setMinSize(40, cellSize);
			label.setAlignment(Pos.CENTER); //GridPane.setHalignment(label, HPos.RIGHT);
			label.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
		}
		
		//actual board
		overallBoardShape.add(innerBoard, 1, 1, 8, 8);
		
	}
	
	//*********************************************************
	//*********************************************************
	
	//04_INTERFACE METHODS
	public Pane getBoard(){
		return overallBoardShape;
	}
	
	public void applyMove(int fromRow, int fromCol, int toRow, int toCol){
		//remove from current location
		ImageView piece=boardPieces[fromRow][fromCol];
		innerBoard.getChildren().remove(piece);
		boardPieces[fromRow][fromCol]=null;
		//add to new location
		innerBoard.add(piece, toCol, toRow);
		boardPieces[toRow][toCol]=piece;
		//other stuff
		piece.setOpacity(1);
		selectedPiece=null;
	}
	
	public void removePiece(int row, int col){
		ImageView piece=boardPieces[row][col];
		innerBoard.getChildren().remove(piece);
	}
	
	public void revivePromotePiece(int row, int col, String team, String pieceName){
		
	}
	
	//*********************************************************************
	private int moveFromRow;
	private int moveFromCol;
	
	private int currentRow;
	private int currentCol;
	
	private ImageView selectedPiece;
	

	private void setActionListeners(){
		//Board Cells
		for(Rectangle shape:whiteBlocks){
			setCellEvents(shape);
		}
		for(Rectangle shape:coloredBlocks){
			setCellEvents(shape);
		}
		//Board Pieces
		for(ImageView row[]:boardPieces){
			for(ImageView piece:row){
				if(piece==null){continue;}
				setPieceEvents(piece);
			}
		}
	}
	
	
	private void setCellEvents(Rectangle cell){
		cell.setOnMouseEntered(e ->{
			Integer[] cellLocation=boardCells.get(cell);
			currentRow=cellLocation[1];
			currentCol=cellLocation[0];
			//System.out.println("Row : "+currentRow+"    Col : "+currentCol);
		});
		cell.setOnMouseClicked(e ->{
			if(selectedPiece!=null){
				applyMove(moveFromRow, moveFromCol, currentRow, currentCol);
			}
		});
	}
	
	private void setPieceEvents(ImageView piece){
		piece.setOnMouseClicked(e ->{
			moveFromRow=currentRow;
			moveFromCol=currentCol;
			if(selectedPiece==null){
				piece.setOpacity(0.5);
				selectedPiece=piece;
			}else{
				selectedPiece.setOpacity(1);
				if(selectedPiece.equals(piece)){
					selectedPiece=null;
				}else{
					piece.setOpacity(0.5);
					selectedPiece=piece;
				}
			}
		});
	}
	
	
	/*
	private double cursorOriginalX;
	private double cursorOriginalY;
	
	private void setPieceDragEvent(ImageView shape){
		shape.setOnMousePressed(e ->{
			cursorOriginalX=e.getX();
			cursorOriginalY=e.getY();
			
			moveFromRow=currentRow;
			moveFromCol=currentCol;
			
		});
		shape.setOnMouseDragged(e ->{
			double deltaX=e.getX()-cursorOriginalX;
			double deltaY=e.getY()-cursorOriginalY;
			
			shape.setTranslateX(shape.getTranslateX()+deltaX);
			shape.setTranslateY(shape.getTranslateY()+deltaY);
		});
		
		shape.setOnMouseDragReleased(e ->{
			
			System.out.println("Success");
			//applyMove(moveFromRow, moveFromCol, currentRow, currentCol);
		});
	}*/

	
}





















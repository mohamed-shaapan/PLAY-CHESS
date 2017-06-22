package zz_ProprietaryGuiElements;

import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class ActionListeners {

	
	//01_ATTRIBUTES
	//********************************************************
	private Elements boardElements;
	
	private int moveFromRow;
	private int moveFromCol;
	
	private int currentRow;
	private int currentCol;
	
	private ImageView selectedPiece;
	
	//02_CONSTRUCTOR
	//**************************************************
	public ActionListeners(Elements boardElements) {
		this.boardElements=boardElements;
	}
	
	
	//03_INTERFACE METHODS
	//**************************************************
	public void generateActionListeners(){
		//Board Cells
		for(Rectangle shape:boardElements.getWhiteBlocks()){
			setCellEvents(shape);
		}
		for(Rectangle shape:boardElements.getBlackBlocks()){
			setCellEvents(shape);
		}
		//Board Pieces
		for(ImageView row[]:boardElements.getBoardPieces()){
			for(ImageView piece:row){
				if(piece==null){continue;}
				setPieceEvents(piece);
			}
		}
	}
	
	//**************************************************
	private void setCellEvents(Rectangle cell){
		
		cell.setOnMouseEntered(e ->{
			Integer[] cellLocation=boardElements.getBoardCells().get(cell);
			currentRow=cellLocation[1];
			currentCol=cellLocation[0];
		});
		
		cell.setOnMouseClicked(e ->{
			if(selectedPiece!=null){
				boolean validMove=boardElements.getGameEngine().movePiece(moveFromRow, moveFromCol, currentRow, currentCol);
				if(validMove==true){
					applyMove(moveFromRow, moveFromCol, currentRow, currentCol);
				}
				
			}
		});
	}
	
	//**************************************************
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
	
	
	
	//CHESS BOARD METHODS
	//**************************************************
	private void applyMove(int fromRow, int fromCol, int toRow, int toCol){
		//remove enemy from target cell if exists
		ImageView enemyPiece=boardElements.getBoardPieces()[toRow][toCol];
		boardElements.getInnerBoard().getChildren().remove(enemyPiece);
		//remove from current location
		ImageView piece=boardElements.getBoardPieces()[fromRow][fromCol];
		boardElements.getInnerBoard().getChildren().remove(piece);
		boardElements.getBoardPieces()[fromRow][fromCol]=null;
		//add to new location
		boardElements.getInnerBoard().add(piece, toCol, toRow);
		boardElements.getBoardPieces()[toRow][toCol]=piece;
		//other stuff
		piece.setOpacity(1);
		selectedPiece=null;
	}
	
	public void removePiece(int row, int col){
		ImageView piece=boardElements.getBoardPieces()[row][col];
		boardElements.getInnerBoard().getChildren().remove(piece);
	}
	
	public void revivePromotePiece(int row, int col, String team, String pieceName){
		
	}
	
	
	

	
	
	
	
	/*
	//**************************************************
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

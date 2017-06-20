package commandHandlingModule;

import battlePiecesModule.BlankPiece;
import battlePiecesModule.Piece;
import gameSetModule.ChessBoardSet;

public class MovePieceCommand {
	
	//01_ATTRIBUTES
	//*************************************************************************
	private ChessBoardSet chessBoard;
	private int fromRow; private int fromCol;
	private int toRow; private int toCol;
	
	
	//02_CONSTRUCTOR
	//*************************************************************************
	public MovePieceCommand(ChessBoardSet chessBoard, int fromRow, int fromCol, int toRow, int toCol){
		this.chessBoard=chessBoard;
		this.fromRow=fromRow;
		this.fromCol=fromCol;
		this.toRow=toRow;
		this.toCol=toCol;
	}
	
	
	//03_INTERFACE METHODS
	//*************************************************************************
	public void execute(){
		//kill target enemy (if exists)
		String enemy=chessBoard.getGameBoard()[fromRow][fromCol].getEnemy();
		String targetCellTeam=chessBoard.getGameBoard()[toRow][toCol].getTeam();
		if(targetCellTeam.equalsIgnoreCase(enemy)){
			chessBoard.getGameBoard()[fromRow][fromCol].setActive(false);
		}
		//move piece to specified location
		Piece pieceToMove=chessBoard.getGameBoard()[fromRow][fromCol];
		chessBoard.getGameBoard()[fromRow][fromCol]=new BlankPiece();
		chessBoard.getGameBoard()[toRow][toCol]=pieceToMove;
		pieceToMove.setCurrentRow(toRow); pieceToMove.setCurrentColumn(toCol);
		//examine promotion eligibility
		//
		
	}
	
	
	
	
}

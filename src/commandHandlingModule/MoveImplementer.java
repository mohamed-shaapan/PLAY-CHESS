package commandHandlingModule;

import battlePiecesModule.BlankPiece;
import battlePiecesModule.Piece;
import gameSetModule.ChessBoardSet;

public class MoveImplementer {
	
	public void movePiece(ChessBoardSet chessBoard, int fromRow, int fromCol, int toRow, int toCol){
		Piece pieceToMove=chessBoard.getGameBoard()[fromRow][fromCol];
		Piece targetBlock=chessBoard.getGameBoard()[toRow][toCol];
		
		if(targetBlock.getType().equalsIgnoreCase("blank")){
			pieceToMove.setCurrentRow(toRow);
			pieceToMove.setCurrentColumn(toCol);
			targetBlock.setCurrentRow(fromRow);
			targetBlock.setCurrentColumn(fromCol);
			Piece tmp=targetBlock;
			chessBoard.getGameBoard()[toRow][toCol]=pieceToMove;
			chessBoard.getGameBoard()[fromRow][fromCol]=tmp;
		}else{
			targetBlock.setActive(false);
			pieceToMove.setCurrentRow(toRow);
			pieceToMove.setCurrentColumn(toCol);
			chessBoard.getGameBoard()[toRow][toCol]=pieceToMove;
			chessBoard.getGameBoard()[fromRow][fromCol]=new BlankPiece();
		}
		
	}

}

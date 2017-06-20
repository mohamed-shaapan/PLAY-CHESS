package battlePiecesModule;

import gameSetModule.ChessBoardSet;
import validLocationModule.QueenValidLocations;

public class Queen extends Piece{
	
	//01_Constructor**********************
	//*************************************************************************

	public Queen(ChessBoardSet gameBoard, String displayName, String type, String team, String enemy, int step,
			boolean active, int initialRow, int initialColumn, int currentRow, int currentColumn) {
		super(gameBoard, displayName, type, team, enemy, step, active, initialRow, initialColumn, currentRow, currentColumn);
		//valid locations object
		validLocations=new QueenValidLocations(this, getGameBoard());
	}

	

}

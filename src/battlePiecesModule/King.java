package battlePiecesModule;

import gameSetModule.ChessBoardSet;
import validLocationModule.KingValidLocations;

public class King extends Piece{
	
	//01_Constructor**********************
	//*************************************************************************
	
	public King(ChessBoardSet gameBoard, String displayName, String type, String team, String enemy, int step,
			boolean active, int initialRow, int initialColumn, int currentRow, int currentColumn) {
		super(gameBoard, displayName, type, team, enemy, step, active, initialRow, initialColumn, currentRow, currentColumn);
		//valid locations object
		validLocations=new KingValidLocations(this, getGameBoard());
	}
	

}

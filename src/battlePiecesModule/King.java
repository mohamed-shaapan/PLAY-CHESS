package battlePiecesModule;

import gameSetModule.ChessBoardSet;
import validLocationModule.KingValidLocations;
import validLocationModule.ValidLocations;

public class King extends Piece{
	
	//01_Constructor**********************
	//*************************************************************************
	
	public King(ChessBoardSet gameBoard, String displayName, String type, String team, String enemy, int step,
			boolean active, int initialRow, int initialColumn, int currentRow, int currentColumn) {
		super(gameBoard, displayName, type, team, enemy, step, active, initialRow, initialColumn, currentRow, currentColumn);
		// TODO Auto-generated constructor stub
	}

	//02_Methods**************************
	//*************************************************************************
	@Override
	public void setNextValidLocations() {
		return new KingValidLocations(this, getGameBoard());
	}
	
	

}

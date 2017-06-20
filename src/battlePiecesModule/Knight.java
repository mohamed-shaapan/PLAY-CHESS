package battlePiecesModule;

import gameSetModule.ChessBoardSet;
import validLocationModule.KnightValidLocations;
import validLocationModule.ValidLocations;

public class Knight extends Piece{
	
	//01_Constructor**********************
	//*************************************************************************

	
	public Knight(ChessBoardSet gameBoard, String displayName, String type, String team, String enemy, int step,
			boolean active, int initialRow, int initialColumn, int currentRow, int currentColumn) {
		super(gameBoard, displayName, type, team, enemy, step, active, initialRow, initialColumn, currentRow, currentColumn);
		// TODO Auto-generated constructor stub
	}

	//02_Methods**************************
	//*************************************************************************
	@Override
	public void setNextValidLocations() {
		return new KnightValidLocations(this, getGameBoard());
	}
}

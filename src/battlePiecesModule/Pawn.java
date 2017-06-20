package battlePiecesModule;

import gameSetModule.ChessBoardSet;
import validLocationModule.PawnValidLocations;
import validLocationModule.ValidLocations;

public class Pawn extends Piece{

	//01_Constructor**********************
	//*************************************************************************

	public Pawn(ChessBoardSet gameBoard, String displayName, String type, String team, String enemy, int step,
			boolean active, int initialRow, int initialColumn, int currentRow, int currentColumn) {
		super(gameBoard, displayName, type, team, enemy, step, active, initialRow, initialColumn, currentRow, currentColumn);
		// TODO Auto-generated constructor stub
	}

	//03_Methods**************************
	//*************************************************************************
	@Override
	public void setNextValidLocations() {
		return new PawnValidLocations(this, getGameBoard());
	}

}

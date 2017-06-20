package battlePiecesModule;

import validLocationModule.ValidLocations;

public class BlankPiece extends Piece{
	
	//01_Constructor**********************
	//*************************************************************************
	public BlankPiece() {
		super(null, "    ", "blank", "neutral", "neutral", -1, true, -1, -1, -1, -1);
	}

	//02_Methods**************************
	//*************************************************************************
	@Override
	public void setNextValidLocations() {
		return null;
	}
	
	

	
	
	

}

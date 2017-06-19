package commandHandlingModule;

import gameSetModule.ChessBoardSet;

public class MovePieceCommand {
	
	//01_Attributes***********************
	//*************************************************************************
	private ChessBoardSet chessBoard;
	private int fromRow; private int fromCol;
	private int toRow; private int toCol;
	
	
	//02_Constructor**********************
	//*************************************************************************
	public MovePieceCommand(ChessBoardSet chessBoard, int fromRow, int fromCol, int toRow, int toCol){
		this.chessBoard=chessBoard;
		this.fromRow=fromRow;
		this.fromCol=fromCol;
		this.toRow=toRow;
		this.toCol=toCol;
	}
	
	
	//03_Methods**************************
	//*************************************************************************
	public void execute(){
		/*boolean playerTurnTest=testPlayerTurn();
		boolean validTargetCell=validateTargetCell();
		//FreeRouteTester.
		if(playerTurnTest&&validTargetCell){
			applyMove();
		}*/
		
	}
	
	//**********************************************************************************
	private boolean testPlayerTurn(){
		String playerTurn=chessBoard.getPlayerTurn();
		String currentPlayer=chessBoard.getGameBoard()[fromRow][fromCol].getTeam();
		if(currentPlayer.equalsIgnoreCase(playerTurn)){
			return true;
		}
		return false;
	}
	//**********************************************************************************
	/*private boolean validateTargetCell(){
		int[][][] nextValidLocations=chessBoard.getGameBoard()[fromRow][fromCol].getNextValidLocations();
		int height=nextValidLocations.length;
		int width=nextValidLocations[0].length;
		for(int i=1; i<=height; i++){
			for(int j=1; j<=width; j++){
				int possibleValidRow=nextValidLocations[i-1][j-1][0];
				int possibleValidCol=nextValidLocations[i-1][j-1][1];
				if((possibleValidRow==toRow)||(possibleValidCol==toCol)){
					return true;
				}
			}
		}
		return false;
	}*/
	//**********************************************************************************
	private void applyMove(){
		
	}
	
	
	
	
	
	
}

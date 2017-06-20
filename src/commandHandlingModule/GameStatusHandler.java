package commandHandlingModule;

import java.util.ArrayList;

import battlePiecesModule.Piece;
import gameSetModule.ChessBoardSet;

public class GameStatusHandler {

	//01_ATTRIBUTES
	//*********************************************************
	private boolean gameOver;
	private ChessBoardSet gameBoard;
	private MoveValidator moveValidator;
	
	
	//02_CONSTRUCTOR
	//*********************************************************
	public GameStatusHandler(ChessBoardSet gameBoard) {
		gameOver=false;
		this.gameBoard=gameBoard;
		moveValidator=new MoveValidator(gameBoard);
	}
	
	
	//03_INTERFACE METHODS
	//*********************************************************
	public boolean isGameOver(){
		return gameOver;
	}
	
	public void updateGameStatus(String nextPlayerTurn){
		//01_identify team to examine************
		Piece kingToTest;
		if(nextPlayerTurn.equalsIgnoreCase("white")){
			kingToTest=gameBoard.getWhiteTeam().getKing();
		}else{
			kingToTest=gameBoard.getBlackTeam().getKing();
		}
		//02_perform examinations****************
		if(isCheckMate(kingToTest)){
			gameOver=true;
			System.out.println("CHECK MATE! - GAME OVER");
		}else if(isStaleMate(kingToTest)){
			gameOver=true;
			System.out.println("STALE MATE! - GAME OVER");
		}else{
			boolean isKingInDanger=KingStatusHandler.isKingInDanger(gameBoard, kingToTest);
			if(isKingInDanger==true){
				System.out.println("CHECK! - "+kingToTest.getTeam());	
			}
		}
		
	}
	
	
	//04_INTERNAL METHODS
	//*********************************************************
	private boolean isCheckMate(Piece king){
		//01_king is in danger
		boolean isKingInDanger=KingStatusHandler.isKingInDanger(gameBoard, king);
		//02_no other piece has valid moves
		boolean noValidMoves=noMoreValidMoves(king.getTeam());
		//return test result
		if(isKingInDanger&&noValidMoves){
			return true;
		}
		return false;
	}
		
	//*********************************************************
	private boolean isStaleMate(Piece king){
		//01_king is not in danger
		boolean isKingInDanger=KingStatusHandler.isKingInDanger(gameBoard, king);
		//02_no other piece has valid moves
		boolean noValidMoves=noMoreValidMoves(king.getTeam());
		//return test result
		if((!isKingInDanger)&&noValidMoves){
			return true;
		}
		return false;
	}
		
	//*********************************************************
	private boolean noMoreValidMoves(String team){
		//identify team************************
		Piece[] teamPieces;
		if(team.equalsIgnoreCase("white")){
			teamPieces=gameBoard.getWhiteTeam().getWhiteTeam();
		}else{
			teamPieces=gameBoard.getBlackTeam().getBlackTeam();
		}
		//try out all team mates***************
		for(Piece mate:teamPieces){
			//skip if mate is dead
			if(mate.isActive()==false){
				continue;
			}
			//get current location
			int fromRow=mate.getCurrentRow(); int fromCol=mate.getCurrentColumn();
			//try all possible locations
			ArrayList<int[]> nextValidLocations=mate.generateNextValidLocations();
			for(int[] cell:nextValidLocations){
				int toRow=cell[0]; int toCol=cell[1];
				boolean isValidMove=moveValidator.validateMove(fromRow, fromCol, toRow, toCol);
				if(isValidMove==true){
					return false;
				}
			}
		}
		
		return true;
	}
	
}

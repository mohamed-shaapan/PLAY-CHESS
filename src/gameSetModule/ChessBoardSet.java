package gameSetModule;

import battlePiecesModule.BlankPiece;
import battlePiecesModule.Piece;

public class ChessBoardSet {

	//01_Attributes***********************
	//*************************************************************************
	private Piece[][] gameBoard;
	private WhiteTeam whiteTeam;
	private BlackTeam blackTeam;
	private String playerTurn;
	private String gameStatus;
		
		
	//02_Constructor**********************
	//*************************************************************************
	public ChessBoardSet(){
		gameBoard=new Piece[8][8];
		whiteTeam=new WhiteTeam(this);
		blackTeam=new BlackTeam(this);
		initializeBoardCells();
		playerTurn="white";
		gameStatus="ONGOING";
	}
	//************************************
	private void initializeBoardCells(){
		for(int row=1; row<=8; row++){
			for(int col=1; col<=8; col++){
				gameBoard[row-1][col-1]=new BlankPiece();
			}
		}
		for(int i=1; i<=16; i++){
			int row=whiteTeam.getWhiteTeam()[i-1].getInitialRow();
			int column=whiteTeam.getWhiteTeam()[i-1].getInitialColumn();
			gameBoard[row][column]=whiteTeam.getWhiteTeam()[i-1];
		}
		for(int i=1; i<=16; i++){
			int row=blackTeam.getBlackTeam()[i-1].getInitialRow();
			int column=blackTeam.getBlackTeam()[i-1].getInitialColumn();
			gameBoard[row][column]=blackTeam.getBlackTeam()[i-1];
		}
	}
	
	
	//03_Methods**************************
	//*************************************************************************
	public Piece[][] getGameBoard() {
		return gameBoard;
	}
	public WhiteTeam getWhiteTeam() {
		return whiteTeam;
	}
	public BlackTeam getBlackTeam() {
		return blackTeam;
	}
	public String getPlayerTurn() {
		return playerTurn;
	}
	public String getGameStatus(){
		return gameStatus;
	}
	
	
	
	
		
		
		
		
		
	

}

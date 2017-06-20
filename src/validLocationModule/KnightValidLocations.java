package validLocationModule;

import java.util.ArrayList;

import battlePiecesModule.Piece;
import gameSetModule.ChessBoardSet;

public class KnightValidLocations implements ValidLocations{

	//01_Attributes***********************
	//*************************************************************************
	private ArrayList<int[]> nextValidLocations;
	private Piece piece;
	private ChessBoardSet gameBoard;
	private int currentRow; private int currentCol;
	
	
	//02_Constructor**********************
	//*************************************************************************
	public KnightValidLocations(Piece piece, ChessBoardSet gameBoard) {
		this.piece=piece;
		this.gameBoard=gameBoard;
		nextValidLocations=new ArrayList<int[]>();
		currentRow=-1; currentCol=-1;
	}
	
	
	//03_Methods**************************
	//*************************************************************************
	@Override
	public ArrayList<int[]> generateNextValidLocations() {
		nextValidLocations.clear();
		currentRow=piece.getCurrentRow(); 
		currentCol=piece.getCurrentColumn();
		setupLocationA(); setupLocationB();
		setupLocationC(); setupLocationD();
		setupLocationE(); setupLocationF();
		setupLocationG(); setupLocationH();
		return nextValidLocations;
	}

	//01_setup directional moves
	//*********************************************************
	private void setupLocationA(){
		int row=currentRow-2; int col=currentCol+1;
		try{
			boolean withinBoardLimits=(col>=0)&&(col<=7)&&(row>=0)&&(row<=7);
			boolean noTeamMate=!(gameBoard.getGameBoard()[row][col].getTeam().equalsIgnoreCase(piece.getTeam()));
			if(withinBoardLimits&&noTeamMate){
				nextValidLocations.add(new int[]{row, col});
			}
		}catch(Exception ex){}
	}
	private void setupLocationB(){
		int row=currentRow-1; int col=currentCol+2;
		try{
			boolean withinBoardLimits=(col>=0)&&(col<=7)&&(row>=0)&&(row<=7);
			boolean noTeamMate=!(gameBoard.getGameBoard()[row][col].getTeam().equalsIgnoreCase(piece.getTeam()));
			if(withinBoardLimits&&noTeamMate){
				nextValidLocations.add(new int[]{row, col});
			}
		}catch(Exception ex){}
	}
	private void setupLocationC(){
		int row=currentRow+1; int col=currentCol+2;
		try{
			boolean withinBoardLimits=(col>=0)&&(col<=7)&&(row>=0)&&(row<=7);
			boolean noTeamMate=!(gameBoard.getGameBoard()[row][col].getTeam().equalsIgnoreCase(piece.getTeam()));
			if(withinBoardLimits&&noTeamMate){
				nextValidLocations.add(new int[]{row, col});
			}
		}catch(Exception ex){}
	}
	private void setupLocationD(){
		int row=currentRow+2; int col=currentCol+1;
		try{
			boolean withinBoardLimits=(col>=0)&&(col<=7)&&(row>=0)&&(row<=7);
			boolean noTeamMate=!(gameBoard.getGameBoard()[row][col].getTeam().equalsIgnoreCase(piece.getTeam()));
			if(withinBoardLimits&&noTeamMate){
				nextValidLocations.add(new int[]{row, col});
			}
		}catch(Exception ex){}
	}
	private void setupLocationE(){
		int row=currentRow+2; int col=currentCol-1;
		try{
			boolean withinBoardLimits=(col>=0)&&(col<=7)&&(row>=0)&&(row<=7);
			boolean noTeamMate=!(gameBoard.getGameBoard()[row][col].getTeam().equalsIgnoreCase(piece.getTeam()));
			if(withinBoardLimits&&noTeamMate){
				nextValidLocations.add(new int[]{row, col});
			}
		}catch(Exception ex){}
	}
	private void setupLocationF(){
		int row=currentRow+1; int col=currentCol-2;
		try{
			boolean withinBoardLimits=(col>=0)&&(col<=7)&&(row>=0)&&(row<=7);
			boolean noTeamMate=!(gameBoard.getGameBoard()[row][col].getTeam().equalsIgnoreCase(piece.getTeam()));
			if(withinBoardLimits&&noTeamMate){
				nextValidLocations.add(new int[]{row, col});
			}
		}catch(Exception ex){}
	}
	private void setupLocationG(){
		int row=currentRow-1; int col=currentCol-2;
		try{
			boolean withinBoardLimits=(col>=0)&&(col<=7)&&(row>=0)&&(row<=7);
			boolean noTeamMate=!(gameBoard.getGameBoard()[row][col].getTeam().equalsIgnoreCase(piece.getTeam()));
			if(withinBoardLimits&&noTeamMate){
				nextValidLocations.add(new int[]{row, col});
			}
		}catch(Exception ex){}
	}
	private void setupLocationH(){
		int row=currentRow-2; int col=currentCol-1;
		try{
			boolean withinBoardLimits=(col>=0)&&(col<=7)&&(row>=0)&&(row<=7);
			boolean noTeamMate=!(gameBoard.getGameBoard()[row][col].getTeam().equalsIgnoreCase(piece.getTeam()));
			if(withinBoardLimits&&noTeamMate){
				nextValidLocations.add(new int[]{row, col});
			}
		}catch(Exception ex){}
	}
	
}

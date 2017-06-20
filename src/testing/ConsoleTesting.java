package testing;

import commons.BoardPrinter;
import gameSetModule.ChessBoardSet;

public class ConsoleTesting {

	//01_RUN TESTS
	//*****************************************************
	public static void main(String[] args) {
		
		genericTest();
	
	}

	//02_TEST CRITERIA
	//*****************************************************
	private static void genericTest(){
		ChessBoardSet gameBoard=new ChessBoardSet();
		BoardPrinter boardPrinter=new BoardPrinter(gameBoard);
		
		gameBoard.movePiece(7, 1, 5, 0);

		boardPrinter.drawBoard();
	}
	
	
	
	
	
	
}

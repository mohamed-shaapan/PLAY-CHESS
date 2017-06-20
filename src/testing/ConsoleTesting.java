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
		
		/*gameBoard.movePiece(6, 3, 5, 3);
		gameBoard.movePiece(1, 5, 2, 5);
		gameBoard.movePiece(6, 0, 5, 0);
		gameBoard.movePiece(0, 5, 4, 1);*/
		gameBoard.movePiece(7, 2, 5, 0);

		boardPrinter.drawBoard();
	}
	
	
	
	
	
	
}

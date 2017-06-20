package z_console;

import commandHandlingModule.MovePieceCommand;
import gameSetModule.ChessBoardSet;

public class ConsoleTesting {

	public static void main(String[] args) {
		
		ChessBoardSet gameBoard=new ChessBoardSet();
		
		BoardPrinter boardPrinter=new BoardPrinter(gameBoard);
		
		MovePieceCommand moveOperation=new MovePieceCommand(gameBoard, 7, 2, 5, 0);
		//MovePieceCommand moveOperation=new MovePieceCommand(gameBoard, 1, 0, 2, 0);
		moveOperation.execute();
		
		

		boardPrinter.drawBoard();
	}

}

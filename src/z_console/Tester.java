package z_console;

import commandHandlingModule.MovePieceCommand;
import gameSetModule.ChessBoardSet;

public class Tester {

	public static void main(String[] args) {
		
		ChessBoardSet gameBoard=new ChessBoardSet();
		
		BoardPrinter boardPrinter=new BoardPrinter(gameBoard);
		boardPrinter.drawBoard();
		
		MovePieceCommand moveOperation=new MovePieceCommand(gameBoard, 0, 0, 0, 0);
		moveOperation.execute();

	}

}

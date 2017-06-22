package gameEngineModule;

public interface IChessGame {
	
	public boolean movePiece(int fromRow, int fromCol, int toRow, int toCol);
	public void promotePawn(int row, int column);
	
	public void undoMove();
	public void redoMove();
	
	public void startNewGame();
	
	public void saveGameProgress(String fileName);
	public void loadSavedGame(String fileName);

}

package storageModule;

import gameSetModule.ChessGame;

public interface GameStorageHandler {

	public boolean saveGame(ChessGame gameSet, String fileDirectory);
	public ChessGame loadGame(String fileDirectory);
	
}

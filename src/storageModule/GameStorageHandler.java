package storageModule;

import gameEngineModule.ChessGame;

public interface GameStorageHandler {

	public boolean saveGame(ChessGame gameSet, String fileDirectory);
	public ChessGame loadGame(String fileDirectory);
	
}

package storageModule;

public interface GameHandler {

	public boolean saveGame(Object currentGameProgress, String fileDirectory);
	public Object loadGame(String fileDirectory);
	
}

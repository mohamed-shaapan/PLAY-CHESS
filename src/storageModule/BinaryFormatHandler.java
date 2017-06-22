package storageModule;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import gameEngineModule.ChessGame;

public class BinaryFormatHandler{

	
	
	//01_SAVE GAME
	//**************************************************************
	public boolean saveGame(ChessGame gameSet, String fileDirectory) {
		File gameProgressFile=new File(fileDirectory);
		try{
			//open file
			FileOutputStream tmp=new FileOutputStream(gameProgressFile);
			ObjectOutputStream fileWriter=new ObjectOutputStream(tmp);
			//write to file
			fileWriter.writeObject(gameSet);
			//close file
			fileWriter.close();
			tmp.close();
			return true;
		}catch(Exception e){
			return false;
		}
	}
		
		
	//02_LOAD GAME
	//**************************************************************
	public ChessGame loadGame(String fileDirectory){
		File gameProgressFile=new File(fileDirectory);
		try{
			//open file
			FileInputStream tmp=new FileInputStream(gameProgressFile);
			ObjectInputStream fileReader=new ObjectInputStream(tmp);
			//read from file
			ChessGame gameSet=(ChessGame)fileReader.readObject();
			//close file
			fileReader.close();
			tmp.close();
			return gameSet;
		}catch (Exception e){
			return null;
		}
	}
	
	//**************************************************************
	
	
	
	
	
}

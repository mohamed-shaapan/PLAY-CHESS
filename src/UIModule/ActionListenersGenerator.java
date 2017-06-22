package UIModule;

import java.io.File;

import javafx.stage.FileChooser;

public class ActionListenersGenerator {
	
	
	
	//01_ATTRIBUTES
	//*************************************************************
	private ElementGenerator appElements;
	
	
	//02_CONSTRUCTOR
	//*************************************************************
	public ActionListenersGenerator(ElementGenerator appElements, LayoutGenerator layout){
		this.appElements=appElements;
	}
	

	//03_METHODS
	//*************************************************************
	public void initialize(){

		//START NEW GAME BUTTON
		//**********************************
		appElements.getNewGameButton().setOnMouseClicked(e ->{
			
    		
		});
		
		//SAVE GAME BUTTON
		//**********************************
		appElements.getSaveGameButton().setOnMouseClicked(e ->{
			FileChooser fileChooser = new FileChooser();
			//set dialog configuration
				//title
				fileChooser.setTitle("Save Image");
				//default directory
				//String dir=System.getProperty("user.home");
				String dir="resources/saved_games/";
				fileChooser.setInitialDirectory(new File(dir));
				//restrict file types
				fileChooser.getExtensionFilters().addAll(
						new FileChooser.ExtensionFilter("bin", ".bin"),
						new FileChooser.ExtensionFilter("xml", ".xml")
				);

			//show dialog & use file
			File chosenFile=fileChooser.showSaveDialog(appElements.getLayout().getScene().getWindow());
			
			if(chosenFile!=null){
				if(getFileExtension(chosenFile).equalsIgnoreCase("bin")){
					//appEngine.saveImageXML(chosenFile.getPath());
				}else if(getFileExtension(chosenFile).equalsIgnoreCase("xml")){
					//appEngine.saveImageJSON(chosenFile.getPath());
				}
	        }
	    	    

    	});
		
		
		//LOAD GAME BUTTON
		//**********************************
		appElements.getLoadGameButton().setOnMouseClicked(e ->{
			FileChooser fileChooser = new FileChooser();
			//set dialog configuration
				//title
				fileChooser.setTitle("Open Image");
				//default directory
				//String dir=System.getProperty("user.home");
				String dir="resources/saved_games/";
				fileChooser.setInitialDirectory(new File(dir));
				//restrict file types
				fileChooser.getExtensionFilters().addAll(
						new FileChooser.ExtensionFilter("bin", ".bin"),
						new FileChooser.ExtensionFilter("xml", ".xml")
				);

			//show dialog & use file
			File chosenFile=fileChooser.showOpenDialog(appElements.getLayout().getScene().getWindow());
			
			if(chosenFile!=null){
				if(getFileExtension(chosenFile).equalsIgnoreCase("bin")){
					//appEngine.loadImageXML(chosenFile.getPath());
					//renderImageFromEngine();
				}else{
					//appEngine.loadImageJSON(chosenFile.getPath());
					//renderImageFromEngine();
				}
			
	        }
			
		});
		
		//MOVE PIECE BUTTON
		//**********************************
		appElements.getMovePieceButton().setOnMouseClicked(e ->{
			String fromCell=appElements.getMovePieceFrom().getText();
			String toCell=appElements.getMovePieceTo().getText();
			int[][] moveVector=obtainMoveVector(fromCell, toCell);
			
			appElements.getBoardUI().applyMove(moveVector[0][0], moveVector[0][1], moveVector[1][0], moveVector[1][1]);
			/*
			resetTextFields();*/
		});
		
		//UNDO MOVE BUTTON
		//**********************************
		appElements.getUndoMoveButton().setOnMouseClicked(e ->{
			
			
		});
		
		//REDO MOVE BUTTON
		//**********************************
		appElements.getRedoMoveButton().setOnMouseClicked(e ->{
			
			
		});

		

	}	
	
	
	//04_PRIVATE METHODS
	//***************************************************************************
	private int[][] obtainMoveVector(String fromCell, String toCell){
		int fromRow=Integer.parseInt(fromCell.substring(1))-1;
		int fromCol = fromCell.charAt(0) - 'a';
		
		int toRow=Integer.parseInt(toCell.substring(1))-1;
		int toCol=toCell.charAt(0) - 'a';
		
		int[][] result=new int[2][2];
		result[0][0]=fromRow; result[0][1]=fromCol;
		result[1][0]=toRow; result[1][1]=toCol;
		
		return result;
		
	}
	
	
	private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
	
	/*private void resetTextFields(){
		appElements.getAddNodeName().setText("node name");
		appElements.getAddPathFrom().setText("from");
		appElements.getAddPathTo().setText("to");
		appElements.getAddPathValue().setText("value");
		
		appElements.getCalculateTFInputNodeName().setText("in node");
		appElements.getCalculateTFOutputNodeName().setText("out node");
		
		appElements.getModifyEdgeValue().setText("value");
		
		
	}*/

	
	
}

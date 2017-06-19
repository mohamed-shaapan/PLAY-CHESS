package applicationModule;

public class ActionListenerInitializer {
	
	
	
	//01_ATTRIBUTES
	//*************************************************************
	private ElementInitializer appElements;
	//private LayoutInitializer layout;
	/*private SFGNode highlightedNode;
	private SFGEdge highlightedEdge;*/
	
	
	//02_CONSTRUCTOR
	//*************************************************************
	public ActionListenerInitializer(ElementInitializer appElements, LayoutInitializer layout){
		this.appElements=appElements;
		//this.layout=layout;
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
			
			//resetTextFields();
	    	    

    	});
		
		
		//LOAD GAME BUTTON
		//**********************************
		appElements.getLoadGameButton().setOnMouseClicked(e ->{
			
			
		});
		
		//MOVE PIECE BUTTON
		//**********************************
		appElements.getMovePieceButton().setOnMouseClicked(e ->{
			String fromCell=appElements.getMovePieceFrom().getText();
			String toCell=appElements.getMovePieceTo().getText();
			int[][] moveVector=obtainMoveLocation(fromCell, toCell);
			
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

	private int[][] obtainMoveLocation(String fromCell, String toCell){
		int fromRow=Integer.parseInt(fromCell.substring(1))-1;
		int fromCol = fromCell.charAt(0) - 'a';
		
		int toRow=Integer.parseInt(toCell.substring(1))-1;
		int toCol=toCell.charAt(0) - 'a';
		
		int[][] result=new int[2][2];
		result[0][0]=fromRow; result[0][1]=fromCol;
		result[1][0]=toRow; result[1][1]=toCol;
		
		return result;
		
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

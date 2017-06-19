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

package zz_ProprietaryGuiElements;

import java.io.FileNotFoundException;

public class Initializer {
	
	private Elements elementsGenerator;
	private Layout layoutGenerator;
	//private ActionListeners actionListernsGenerator;
	private MainBoard chessBoard;
	
	
	public Initializer(MainBoard chessBoard) {
		elementsGenerator=new Elements();
		layoutGenerator=new Layout(elementsGenerator);
		//actionListernsGenerator=new ActionListeners();
		this.chessBoard=chessBoard;
	}
	
	
	public void initialize() throws FileNotFoundException{
		elementsGenerator.initializeBoardElements();
		layoutGenerator.generateLayout();
		chessBoard.setLayout(elementsGenerator.getOverallBoardShape());
		
		
	}

}

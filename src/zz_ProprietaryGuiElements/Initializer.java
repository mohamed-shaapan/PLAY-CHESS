package zz_ProprietaryGuiElements;

import java.io.FileNotFoundException;

public class Initializer {
	
	
	//01_ATTRIBUTES
	//********************************************************
	private Elements elementsGenerator;
	private Layout layoutGenerator;
	private ActionListeners actionListernsGenerator;
	private MainChessGameB chessBoard;
	
	//02_CONSTRUCTOR
	//********************************************************
	public Initializer(MainChessGameB chessBoard) {
		elementsGenerator=new Elements();
		layoutGenerator=new Layout(elementsGenerator);
		actionListernsGenerator=new ActionListeners(elementsGenerator);
		this.chessBoard=chessBoard;
	}
	
	//03_INTERFACE METHODS
	//********************************************************
	public void initialize() throws FileNotFoundException{
		elementsGenerator.initializeBoardElements();
		layoutGenerator.generateLayout();
		chessBoard.setLayout(elementsGenerator.getOverallBoardShape());
		actionListernsGenerator.generateActionListeners();
		
		
	}

}

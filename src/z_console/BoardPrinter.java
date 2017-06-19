package z_console;

import gameSetModule.ChessBoardSet;

public class BoardPrinter {
	
	//01_Attributes***********************
	//*************************************************************************
	private ChessBoardSet gameBoard;


	//02_Constructor**********************
	//*************************************************************************
	public BoardPrinter(ChessBoardSet gameBoard){
		this.gameBoard=gameBoard;
	}
	
	
	//03_Methods**************************
	//*************************************************************************
	public void drawBoard(){
	    System.out.println("*******************************************\n");
	    
	    String[] columnNames={"   ", " a "," b ", " c ", " d ", " e ", " f ", " g ", " h ", "   "};
	    String[] rowNames={" ", "8","7", "6", "5", "4", "3", "2", "1", " "};
	    //display column names
	    System.out.printf(" ");
	    for(int loop=1; loop<=10; loop+=1){
	    	System.out.printf(" %s", columnNames[loop-1]);
	    }
	    //print each row
	    for(int loop=1; loop<=8; loop+=1){
	    	System.out.printf("\n\n  ");
	    	System.out.printf("%s  ", rowNames[loop]);
	        for(int loop2=1; loop2<=8; loop2+=1){
	            System.out.printf(" %s", gameBoard.getGameBoard()[loop-1][loop2-1].getDisplayName());
	        	System.out.printf("    ");
	        }
	        System.out.printf("   %s", rowNames[loop]);
	    }
	    //display column name
	    int lp2;
	    System.out.printf("\n\n ");
	    for(lp2=1; lp2<=10; lp2+=1){
	    	System.out.printf(" %s", columnNames[lp2-1]);
	    }
	    
	    System.out.println("\n\n*******************************************\n");
	}

}

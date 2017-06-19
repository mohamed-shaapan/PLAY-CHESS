package Testing;

public class BoardDrawer {
	
	//01_Attributes
	//*********************************************************
	//private ChessBoardSet gameBoard;
	


	//02_Constructor
	//*********************************************************
	public BoardDrawer(){
		
	}
	
	
	//03_Methods
	//*********************************************************
	public static String drawBoard(){
		
		String result="";
		
	    result+="*************************************************************\n\n";
	    
	    String[] columnNames={"   ", " a "," b ", " c ", " d ", " e ", " f ", " g ", " h ", "   "};
	    String[] rowNames={" ", "8","7", "6", "5", "4", "3", "2", "1", " "};
	    //display column names
	    //System.out.printf(" ");
	    for(int loop=1; loop<=10; loop+=1){
	    	result+= columnNames[loop-1]+"      ";
	    }
	    //print each row
	    for(int loop=1; loop<=8; loop+=1){
	    	result+= "\n\n  ";
	    	result+= rowNames[loop]+"     ";
	        for(int loop2=1; loop2<=8; loop2+=1){
	        	result+= "KNG";/*gameBoard.getGameBoard()[loop-1][loop2-1].getDisplayName()*/
	        	result+="  ";
	        }
	        result+= "   "+rowNames[loop];
	    }
	    //display column name
	    int lp2;
	    result+="\n\n";
	    for(lp2=1; lp2<=10; lp2+=1){
	    	result+= columnNames[lp2-1]+"      ";
	    }
	    
	    result+="\n\n*************************************************************\n";
	    
	    return result;
	}

}

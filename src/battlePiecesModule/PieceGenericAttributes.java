package battlePiecesModule;

public class PieceGenericAttributes {

	//01_Attributes***********************
	//*************************************************************************
	private String displayName;
	private String type;
	private String team;
	private String enemy;
		
	private int step;
	private boolean active;
	//private int teamArrayLocation;
		
	private int initialRow; private int initialColumn;
	private int currentRow; private int currentColumn;


	//02_Setters & Getters***************
	//*************************************************************************
	public String getDisplayName() {
		return displayName;
	}


	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public String getEnemy() {
		return enemy;
	}


	public void setEnemy(String enemy) {
		this.enemy = enemy;
	}


	public int getStep() {
		return step;
	}


	public void setStep(int step) {
		this.step = step;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public int getInitialRow() {
		return initialRow;
	}


	public void setInitialRow(int initialRow) {
		this.initialRow = initialRow;
	}


	public int getInitialColumn() {
		return initialColumn;
	}


	public void setInitialColumn(int initialColumn) {
		this.initialColumn = initialColumn;
	}


	public int getCurrentRow() {
		return currentRow;
	}


	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}


	public int getCurrentColumn() {
		return currentColumn;
	}


	public void setCurrentColumn(int currentColumn) {
		this.currentColumn = currentColumn;
	}
	
	
}

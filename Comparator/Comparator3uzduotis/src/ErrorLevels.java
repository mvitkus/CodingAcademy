
public enum ErrorLevels {
	HIGH(2), LOW(0), MEDIUM(1);
	
	 private final int levelCode;

    private ErrorLevels(int levelCode) {
        this.levelCode = levelCode;
    }

	public int getLevelCode() {
		return levelCode;
	}
    


}

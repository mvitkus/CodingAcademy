
public class HttpCode implements Comparable<HttpCode> {

	private ErrorLevels ErrorLevels;

	public HttpCode(ErrorLevels errorLevel) {
		super();
		this.ErrorLevels = errorLevel;
	}

	public ErrorLevels getErrorLevels() {
		return ErrorLevels;
	}

	public void setErrorLevels(ErrorLevels errorLevels) {
		ErrorLevels = errorLevels;
	}

	@Override
	public String toString() {
		return "HttpCode{" + "level=" + ErrorLevels + '}';
	}

	@Override
	public int compareTo(HttpCode arg0) {
		// TODO Auto-generated method stub
		return Integer.compare(this.ErrorLevels.getLevelCode(), arg0.ErrorLevels.getLevelCode());
	}

}

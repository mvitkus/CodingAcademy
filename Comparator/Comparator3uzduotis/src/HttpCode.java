
public class HttpCode {

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

}

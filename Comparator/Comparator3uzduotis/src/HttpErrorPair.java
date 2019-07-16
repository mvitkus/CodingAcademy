
public class HttpErrorPair<T, HttpCodea extends HttpCode> implements Comparable<HttpErrorPair>{
	private T key;
	private HttpCodea value;

	public HttpErrorPair(T key, HttpCodea value) {
		super();
		this.key = key;
		this.value = value;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public HttpCodea getValue() {
		return value;
	}

	public void setValue(HttpCodea value) {
		this.value = value;
	}

	public String toString() {
		return "HttpErrorPair{" + "key=" + key + ", code=" + value + '}';
	}

	@Override
	public int compareTo(HttpErrorPair arg0) {
		return this.getValue().compareTo(arg0.getValue());
	}

}

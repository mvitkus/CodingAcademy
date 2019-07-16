import java.util.ArrayList;
import java.util.Random;

public class X implements Comparable<X>{

	private ArrayList<Integer> xArrayList;
	private int xArrayListNumberSum;

	public X(int n) {
		super();
		this.xArrayList = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			int x = random.nextInt(900);
			this.xArrayList.add(x);
			this.xArrayListNumberSum+=x;
		}

	}

	public int getxArrayListNumberSum() {
		return xArrayListNumberSum;
	}

	public void setxArrayListNumberSum(int xArrayListNumberSum) {
		this.xArrayListNumberSum = xArrayListNumberSum;
	}

	public ArrayList<Integer> getxArrayList() {
		return xArrayList;
	}

	public void setxArrayList(ArrayList<Integer> xArrayList) {
		this.xArrayList = xArrayList;
	}

	@Override
	public int compareTo(X arg0) {
		// TODO Auto-generated method stub
		return this.getxArrayListNumberSum()-arg0.getxArrayListNumberSum();
	}

}

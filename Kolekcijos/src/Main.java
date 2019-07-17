import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayList<Payment> paymentArrayList = new ArrayList<Payment>();
		LinkedList<Payment> paymentLinkedList = new LinkedList<Payment>();

		long first = System.currentTimeMillis();

		generuotiArrayList(1000000, paymentArrayList);

		long second = System.currentTimeMillis();

		System.out.println("Sukurtas arrayList per: "+(second - first));

		generuotiLinkedList(1000000, paymentLinkedList);

		long third = System.currentTimeMillis();

		System.out.println("Sukurtas linkedList per: "+(third - second));

		long clear1 = System.currentTimeMillis();
		paymentArrayList.clear();
		long clear2 = System.currentTimeMillis();
		System.out.println("Istrintas arrayList per: "+(clear2 - clear1));
		
		long clear3 = System.currentTimeMillis();
		paymentLinkedList.clear();
		long clear4 = System.currentTimeMillis();
		System.out.println("Istrintas linkedlistas per: "+(clear4-clear3));
		

	}

	public static void generuotiArrayList(int n, ArrayList<Payment> paymentArrayList) {
		for (int i = 0; i < n; i++) {

			int id = generuotiId();
			String name = generateRandomString().substring(0, 1).toUpperCase()
					+ generateRandomString().substring(1).toLowerCase();
			LocalDateTime date = LocalDateTime.now();
			int reciepentId = generuotiId();
			int payerId = generuotiId();

			Payment payment = new Payment(id, name, date, reciepentId, payerId);
			paymentArrayList.add(payment);

		}

	}

	public static void generuotiLinkedList(int n, LinkedList<Payment> paymentLinkedList) {
		for (int i = 0; i < n; i++) {

			int id = generuotiId();
			String name = generateRandomString().substring(0, 1).toUpperCase()
					+ generateRandomString().substring(1).toLowerCase();
			LocalDateTime date = LocalDateTime.now();
			int reciepentId = generuotiId();
			int payerId = generuotiId();

			Payment payment = new Payment(id, name, date, reciepentId, payerId);
			paymentLinkedList.add(payment);

		}

	}

	public static int generuotiId() {

		Random r = new Random();
		return r.nextInt((1000 - 1) + 1) + 1;

	}

	private static String generateRandomString() {

		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < getRandomNumberInRange(4, 8); i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}

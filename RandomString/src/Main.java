import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		ArrayList<String> uniqueStringList = new ArrayList<>();

		int n = 1000;
		for (int i = 0; i < n; i++) {
			checkIfExist(uniqueStringList);

		}


		File file = new File();
		file.printArrayListToFile(uniqueStringList, "output.txt");
		System.out.println("Failas sėkmingai sukurtas.");

	}

	public static String generateWord() {

		String word = null;
		Random random = new Random();
		word = random.generateRandomString();
		return word;
	}

	public static void checkIfExist(ArrayList<String> uniqueStringList) {

		String newWord = generateWord();

		if (uniqueStringList.contains(newWord)) {
			newWord = generateWord();
			checkIfExist(uniqueStringList);
		} else {
			uniqueStringList.add(newWord);
			
		}

	}

	public static void printListOfUniqueStrings(ArrayList<String> uniqueStringList) {
		for (int i = 0; i < uniqueStringList.size(); i++) {
			System.out.println(uniqueStringList.get(i));

		}
	}

}

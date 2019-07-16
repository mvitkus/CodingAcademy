import java.util.ArrayList;

public class Main {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<HttpErrorPair<T, HttpCode>> array = new ArrayList<>();
		array.add(new HttpErrorPair(HttpCodeEnum.CODE_500, new InternalServerErrorHttpCode(ErrorLevels.HIGH)));
		array.add(new HttpErrorPair(HttpCodeEnum.CODE_401, new BadRequestHttpCode(ErrorLevels.MEDIUM)));
		array.add(new HttpErrorPair(HttpCodeEnum.CODE_404, new NotFoundHttpCode(ErrorLevels.LOW)));
		// array.add(new HttpErrorPair(HttpCodeEnum.CODE_403, new
		// ForbiddenHttpCode(ErrorLevels.MEDIUM)));
		printArray(array);

	}

	public static <T> void printArray(ArrayList<HttpErrorPair<T, HttpCode>> array) {
		for (int i = 0; i < array.size(); i++) {

			System.out.println(array.get(i));
		}
	}

}

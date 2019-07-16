import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<HttpErrorPair> array = new ArrayList<>();
		array.add(new HttpErrorPair(HttpCodeEnum.CODE_500, new InternalServerErrorHttpCode(ErrorLevels.HIGH)));
		array.add(new HttpErrorPair(HttpCodeEnum.CODE_401, new BadRequestHttpCode(ErrorLevels.MEDIUM)));
		array.add(new HttpErrorPair(HttpCodeEnum.CODE_404, new NotFoundHttpCode(ErrorLevels.LOW)));
		// array.add(new HttpErrorPair(HttpCodeEnum.CODE_403, new
		// ForbiddenHttpCode(ErrorLevels.MEDIUM)));
		System.out.println(array);
		Collections.sort(array);
		System.out.println(array);

	}



}

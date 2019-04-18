
public class Day23 {
	public static void main(String[] args) {
		int number = 0;
		System.out.println(returnTest(number));
	}

	private static int returnTest(int number) {
		try {
			return number++;
		} catch (Exception ignored) {

		} finally {
			return ++number;
		}
	}
}
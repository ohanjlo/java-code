
public class Day25 {
	public static void main(String[] args) {
		int i = 0;
		for (print('a'); print('b') && (i < 2); print('c')) {
			i++;
			print('d');
		}
	}

	private static boolean print(char c) {
		System.out.println(c);
		return true;
	}

}
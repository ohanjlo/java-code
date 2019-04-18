
public class Day24 {
	public static void main(String[] args) {
		System.out.println(getValue(2));
	}

	private static int getValue(int i) {
		int result = 0;
		switch (i) {
		case 1:
			result += i;
		case 2:
			result += i * 2;
		case 3:
			result += i * 3;
		}
		return result;
	}

}
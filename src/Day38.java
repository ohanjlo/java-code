
public class Day38 {
	public static void main(String[] args) {
		System.out.println("result = " + switchAdd(3));
	}

	static int switchAdd(int i) {
		int j = 1;
		switch (i) {
		case 1:
			j++;
		case 2:
			j++;
		case 3:
			j++;
		case 4:
			j++;
		case 5:
			j++;
		default:
			j++;
			return i + j;
		}
	}
}
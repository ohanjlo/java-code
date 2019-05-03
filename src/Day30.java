
public class Day30 {

	static {
		int i = 5;
	}
	private static int i, j;

	public static void main(String[] args) {
		i--;// -1
		add();
		System.out.println(i + j + ++i);// 1 + 0 + 2
	}

	private static void add() {
		j = i++ + ++i;// 0
		// -1 + 1
	}
}

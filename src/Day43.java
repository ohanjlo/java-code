
public class Day43 {

	private int a = 1;
	int b = 2;
	static int c = 3;

	public static void main(String[] args) {
		Day43 day43 = new Day43();
		int A = Day43.c;
		/* int B = Day43.b; */
		/* int C = this.c; this不能再静态方法中使用 */
		int D = day43.a;

	}

}

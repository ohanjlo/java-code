
public class Day33 {
	public static void main(String[] args) {
		Count count = new Count();
		System.out.print(count.add() + " ");
		System.out.print(count.add2() + " ");
		Count count2 = new Count();
		System.out.print(count2.add());
	}
}

class Count {
	private static int count = 0;

	public int add() {
		return count++;
	}

	int add2() {
		return ++count;
	}
}

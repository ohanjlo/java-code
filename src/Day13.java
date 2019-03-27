
public class Day13 {
	public static void main(String[] args) {
		Thread t = new Thread(Day13::dao);
		t.run();
		System.out.print("Ð¡");
	}

	private static void dao() {
		System.out.print("µ¶");
	}
}


public class Day13 {
	public static void main(String[] args) {
		Thread t = new Thread(Day13::dao);
		t.run();
		System.out.print("С");
	}

	private static void dao() {
		System.out.print("��");
	}
}

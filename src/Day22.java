public class Day22 extends Father {

	public static void main(String[] args) {
		new Day22().run();// ������
	}

	private final void run() {// ������
		System.out.println("son");
	}
}

class Father {
	private final void run() {
		System.out.println("father");
	}
}
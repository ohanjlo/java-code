
public class Day28 extends DayFather {
	private String name = "son";

	public static void main(String[] args) {
		DayFather son = new Day28();

	}

	void printName() {
		System.out.println(name);
	}
}

class DayFather {
	private String name = "father";

	DayFather() {
		printName();
	}

	void printName() {
		System.out.println(name);
	}
}
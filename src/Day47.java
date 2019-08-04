import java.util.ArrayList;
import java.util.List;

public class Day47 {
	private List<String> list = new ArrayList<>();

	private synchronized void add(String str) {
		list.add(str);
	}

	private synchronized void print() {
		for (String s : list) {
			System.out.print(s);
		}

	}

	public static void main(String[] args) {
		Day47 test = new Day47();
		for (int i = 0; i < 2; i++) {
			new Thread(() -> {
				test.add("a");
				test.add("b");
				test.add("c");
				test.print();
			}).start();
		}
	}
}
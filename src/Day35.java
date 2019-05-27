
public class Day35 {
	public static void main(String[] args) {
		Day35 t = new Day35();
		t.change1();
	}

	private void change1() {
		int i = 2;
		Num n = new Num();
		n.i = 3;
		change2(n, i);
		System.out.print(n.i);
	}

	private void change2(Num n, int i) {
		i = 0;
		n.i = 4;
		Num num = new Num();
		n = num;
		System.out.print(n.i + "" + i);
	}

	class Num {
		public int i = 1;
	}
}


public class Day27 {

	public static void main(String[] args) {
		Byte num1 = 127;
		Byte num2 = 127;
		add(++num1);
		System.out.print(num1 + " ");
		add(num2);
		System.out.print(num2);
	}

	private static void add(Byte num) {
		num = num++;
	}

}

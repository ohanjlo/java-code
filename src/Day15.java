public class Day15 {
	public static void main(String[] args) {
		Integer num1 = new Integer(1);
		Integer num2 = num1;
		changeNumber(num2);
		System.out.println(num1.intValue());
		System.out.println(num1 == num2);
	}

	private static void changeNumber(Integer integer) {
		integer = new Integer(2);
	}
}
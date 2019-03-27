
public class Day9 {
	private String str = new String("original");
	private char[] chars = { 'Ð¡', 'µ¶', '¸ç' };

	public static void main(String[] args) {
		Day9 day9 = new Day9();
		day9.change(day9.str, day9.chars);
		System.out.println(day9.str);
		System.out.println(day9.chars);
	}

	private void change(String str, char[] chars) {
		str = "change success";
		chars[0] = '´ó';
	}
}

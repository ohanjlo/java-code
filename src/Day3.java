
public class Day3 {

	private int i = 1;
	private static int j = 1;

	private int add() {
		return i++;
	}

	private int addj() {
		return j++;
	}

	public static void main(String[] args) {
		Day3 day1 = new Day3();
		Day3 day2 = new Day3();
		day1.add();
		day2.add();
		day1.addj();
		day2.addj();
		System.out.println(day2.add());
		System.out.println(day2.addj());
	}
}

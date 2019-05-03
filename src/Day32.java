
public class Day32 {
	public int add(int num1, int num2) {
		try {
			return num1 + num2;
		} catch (Exception e) {
			System.out.print("catchÓï¾ä ");
		} finally {
			System.out.print("finallyÓï¾ä¿é ");
		}
		return 0;
	}

	public static void main(String[] args) {
		Day32 test = new Day32();
		System.out.print("ºÍÊÇ£º" + test.add(1, 2) + " ");
	}
}

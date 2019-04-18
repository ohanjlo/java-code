
public class Day21 {
	public static void main(String[] args) {
		int count = 0;
		int num = 0;
		for (int i = 0; i <= 100; i++) {
			num = num + 1;
			count = count++;
		}
		System.out.println(num * count);
	}
}


public class Day45 {
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			num1 = num1++;
			num2 = ++num2;
			sum += num1 * num2;
		}
		System.out.println(sum);
	}
	
}

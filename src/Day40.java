
public class Day40 {

	public static void main(String[] args) {

		int i = 5;
		int sum = (i++);
		System.out.println(i);
		System.out.println(sum);

		sum = (++i);
		System.out.println(i);
		System.out.println(sum);

		sum = (i--);
		System.out.println(i);
		System.out.println(sum);

		sum = (--i);
		System.out.println(i);
		System.out.println(sum);

		int j = 5;
		int count = (j++) + (++j) + (j--) + (--j);
		System.out.println(count);

	}

}

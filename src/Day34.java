
public class Day34 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		int k = 0;
		for (int x = 0; x < 7; x++) {
			if ((++i > 3) && (++j > 3) && (k++ > 3)) {
				i++;
				++j;
				k++;
			}
		}

		System.out.println(i + "" + j + "" + k);
	}

}
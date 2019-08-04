
public class Day37 {

	public static void main(String[] args) {

		float f = 3.0f;
		float f1[] = new float[3];
		float f2[] = new float[3];
		float[] f3 = f1;
		long x = 3;
		f1[0] = 3.0f;

		System.out.println(f2[1] == f3[2]);
		System.out.println(f1 == f2);
		System.out.println(x == f1[0]);
		System.out.println(f1[0] == f2[0]);
	}

}

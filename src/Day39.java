
/* try-catch语句中有返回值,若包含finally,需要执行完finally语句才返回 */
/* 传递参数0,j=2/0抛出异常,被捕获,执行finally,i=0,执行return 此时为-1*/
/* 传递参数1,j=2/1=2,执行finally,i=1,执行return 此时为1*/
/* 传递参数2,j=2/2=1,执行finally,没有满足的if,执行return j=1, 此时为1*/
/* 传递参数4,j=2/4=0.5==>0,执行finally,没有满足的if,执行return 此时为0*/
public class Day39 {

	public static void main(String[] args) {

		System.out.print(get(0));
		System.out.print(get(1));
		System.out.print(get(2));
		System.out.print(get(4));

	}

	private static int get(int i) {
		try {
			int j = 2 / i;
			return j;
		} catch (Exception e) {
			return 0;
		} finally {
			if (i == 0) {
				return -1;
			}

			if (i == 1) {
				return 1;
			}
		}
	}

}


public class Day8 {

	static String s;/* 语句1 */

	public static void main(String[] args) {

		// String s;/* 语句2 */
		System.out.println("s=" + s);

	}

}
/* 1.取消语句1的注释,输出s=null */

/* 2.取消语句2的注释,编译不通过，错误：可能尚未初始化变量s */

/* 3.取消语句1和语句2的注释,编译不通过，错误：可能尚未初始化变量s */
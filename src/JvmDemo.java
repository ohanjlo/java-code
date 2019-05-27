
// 堆区：主要存放java运行过程中new出来的对象,通过垃圾回收机制管理
// 静态区：方法区中的一块内存区域,存放static声明的静态变量
// 栈区：主要存放运行期间用到的局部变量(基本数据类型的变量)
public class JvmDemo {

	private String a = "a";/* 堆区 */

	public static void main(String[] args) {

		String b = "b";/* 栈区 */

		final String c = "c";/* 栈区 */
	}
}

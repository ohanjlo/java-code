import java.lang.reflect.Method;

/*getDeclaredMethods()方法返回类或接口声明的方法，public、protected、default、private修饰的方法，但不包括从父类继承的方法，但包括实现接口的方法。*/
/* A */
public class Day36 {

	public static void main(String[] args) {

		try {
			Class c = Class.forName("java.lang.reflect.Method");
			Method[] m = c.getDeclaredMethods();
			for (Method method : m) {
				System.out.println(method.toString());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	void fun1() {

	}

	void fun2() {

	}

}
/* 请问c.getDeclareMehtods()的作用是？ */

/* A.获得类或接口的所有方法对象 */

/* B.获得类或接口的所有公有方法名称 */

/* C.获得类或接口的所有公有方法对象 */

/* D.获得类或接口的除private修饰的方法对象 */

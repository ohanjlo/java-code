/* 当调用父类的有参构造时不会再去调用父类的无参构造 */
/* 类成员的声明在构造函数前执行 */

/*
 * main函数首先new C()
 * C继承于B,类成员声明在构造函数前执行,因此先执行
 * Day41A a = new Day41A();调用A的构造函数,输出A
 * 接着调用super("C");,调用B类的有参构造,传递参数C,输出C
 * 继续执行C类的构造函数System.out.println("C");,输出C
 * 最终输出ACC
 */
public class Day41 {

	public static void main(String[] args) {

		new Day41C();

	}

}

class Day41A {

	Day41A() {
		System.out.println("A");
	}

}

class Day41B {

	Day41A a = new Day41A();

	Day41B() {
		this("B");
		System.out.println("B");
	}

	Day41B(String str) {
		System.out.println(str);
	}

}

class Day41C extends Day41B {

	Day41C() {
		super("C");
		System.out.println("C");
	}

}

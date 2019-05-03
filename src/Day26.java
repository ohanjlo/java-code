/*父类静态代码块、子类静态代码块、父类非静态代码块、父类构造函数、子类非静态代码块、子类构造函数*/
public class Day26 {

	public Day26() {
		System.out.println("class Father");
	}

	{
		System.out.println("I'm Father class");
	}

	static {
		System.out.println("class Father static");
	}

	public static void main(String[] args) {
		new Son();
	}
}

class Son extends Day26 {

	public Son() {
		System.out.println("class Son");
	}

	{
		System.out.println("I'm Son class");
	}

	static {
		System.out.println("class Son static");
	}
}
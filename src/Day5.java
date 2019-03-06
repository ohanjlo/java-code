import java.io.Serializable;

public class Day5 {

	static abstract class A {
	}

	static class B extends A {
	}

	static class C extends A {
	}

	public void sayHello(A a) {
		System.out.println("a");
	}

	public void sayHello(B a) {
		System.out.println("b");
	}

	public void sayHello(C b) {
		System.out.println("c");
	}

	// Object ����
	public void say(Object arg) {
		System.out.println("hello object");
	}

	// int ����
	public void say(int arg) {
		System.out.println("hello int");
	}

	// long ����
	public void say(long arg) {
		System.out.println("hello long");
	}

	// char ����
	public void say(char arg) {
		System.out.println("hello char");
	}

	// Character ����
	public void say(Character arg) {
		System.out.println("hello character");
	}

	// �䳤����
	public void say(char... arg) {
		System.out.println("hello char...");
	}

	// Serializable ����
	public void say(Serializable arg) {
		System.out.println("hello serializable");
	}

	public static void main(String[] args) {
		Day5 overloadTest = new Day5();
		overloadTest.say('a');
		overloadTest.say("a");

		A b = new B();
		A c = new C();
		overloadTest.sayHello(b);
		overloadTest.sayHello(c);
		overloadTest.sayHello((B) b);
	}
}
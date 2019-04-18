public class Day19 {
	public static void main(String[] args) {
		A d = new D();
		System.out.println(d instanceof A);
		System.out.println(d instanceof B);
		System.out.println(d instanceof C);
		System.out.println(d instanceof D);
	}
}

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}
/* �����ø�����вι���ʱ������ȥ���ø�����޲ι��� */
/* ���Ա�������ڹ��캯��ǰִ�� */

/*
 * main��������new C()
 * C�̳���B,���Ա�����ڹ��캯��ǰִ��,�����ִ��
 * Day41A a = new Day41A();����A�Ĺ��캯��,���A
 * ���ŵ���super("C");,����B����вι���,���ݲ���C,���C
 * ����ִ��C��Ĺ��캯��System.out.println("C");,���C
 * �������ACC
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

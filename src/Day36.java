import java.lang.reflect.Method;

/*getDeclaredMethods()�����������ӿ������ķ�����public��protected��default��private���εķ��������������Ӹ���̳еķ�����������ʵ�ֽӿڵķ�����*/
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
/* ����c.getDeclareMehtods()�������ǣ� */

/* A.������ӿڵ����з������� */

/* B.������ӿڵ����й��з������� */

/* C.������ӿڵ����й��з������� */

/* D.������ӿڵĳ�private���εķ������� */

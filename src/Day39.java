
/* try-catch������з���ֵ,������finally,��Ҫִ����finally���ŷ��� */
/* ���ݲ���0,j=2/0�׳��쳣,������,ִ��finally,i=0,ִ��return ��ʱΪ-1*/
/* ���ݲ���1,j=2/1=2,ִ��finally,i=1,ִ��return ��ʱΪ1*/
/* ���ݲ���2,j=2/2=1,ִ��finally,û�������if,ִ��return j=1, ��ʱΪ1*/
/* ���ݲ���4,j=2/4=0.5==>0,ִ��finally,û�������if,ִ��return ��ʱΪ0*/
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

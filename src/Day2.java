import java.util.ArrayList;
import java.util.List;

public class Day2 {
	private List<String> names = new ArrayList<>();

	private synchronized void add(String name) {
		names.add(name);
	}

	private synchronized void printAll() {
		for (Object name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		final Day2 ts = new Day2();
		for (int i = 0; i < 2; i++) {
			new Thread(() -> {
				ts.add("С");
				ts.add("��");
				ts.add("��");
				ts.printAll();
			}).start();
		}
	}
}
/*
 * A.������ʱ�����ܳ�һ���쳣 
 * B.������뽫��û����������Ҳ����˳� 
 * C.������뽫��û����������������˳�
 * D.������뽫������Ҳ������ 
 * С����
 * С����,֮���˳�.
 * E.������뽫������Ҳ������
 * С�� ��
 * С����С����,֮���˳�.
 * F.������뽫������Ҳ������
 * С С С �� ��
 * �� �� �� �� ��",֮���˳�.
 * G.������뽫������Ҳ������
 * С С �� �� �� ��
 * С С �� �� �� ��,֮���˳�. 
 * H.������뽫������Ҳ������
 * С �� �� С
 * С �� �� С �� ��",֮���˳�.
 * I.������뽫������Ҳ������
 * С �� С �� �� ��
 * С �� С �� �� ��",֮���˳�.
 * J.������뽫������Ҳ������
 * С С �� �� ��
 * С С �� �� �� ��",֮���˳�.
 */



 

public class Day12 {
	public static void main(String[] args) {
		char[] chars = { 'С', '��', '��' };
		Thread[] threads = new Thread[3];
		for (int i = 0; i < 3; i++) {
			threads[i] = new Thread(() -> {
				for (char character : chars) {
					System.out.print(character);
				}
				System.out.print('\t');
			});
		}
		for (Thread thread : threads) {
			thread.start();
		}
	}
}
/* A.С��С��          С����          ��� */
/* B.С��С                 ����         С���� */
/* C.С��                      ��С����С���� */
/* D.СС�������                      С���� */
/* E.����С               С����        С���� */
/* F.�絶С                �絶С        �絶С */
/* G.С����                ����С        �絶С */
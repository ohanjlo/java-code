public class Day14 {
	public static void main(String[] args) {
		System.out.println(new Son().getNumber());
	}

	static class Father {
		private int number;

		private Father(int num) {
			setNumber(num);
		}

		public void setNumber(int num) {
			this.number = num;
		}

		int getNumber() {
			try {
				number++;
				return number;
			} catch (Exception e) {
				System.out.println(e.toString());
			} finally {
				this.setNumber(number);
				System.out.println(number);
			}
			return number;
		}
	}

	static class Son extends Father {
		Son() {
			super(10);
			setNumber(getNumber() - 3);
		}

		public void setNumber(int number) {
			super.setNumber(2 * number);
		}
	}
}
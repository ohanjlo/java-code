
public class Day42 {

	public static void main(String[] args) {

		Day42Son day42Son = new Day42Son(3);
		System.out.println(day42Son.i);
	}

}

class Day42Father {

	int i = 2;

	public Day42Father() {
	}

	public Day42Father(int i) {
		this.i = i;
	}
}

class Day42Son extends Day42Father {

	public Day42Son(int i) {
		this.i = i;
	}

}

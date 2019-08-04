
public class Day46 {

	public static void main(String[] args) {
		Day46 test = new Day46();
		test.start();
	}

	void start() {
		Value value1 = new Value();
		System.out.print(value1.b + " ");
		Value value2 = change(value1);
		System.out.print(value1.b + " " + value2.b);
	}

	Value change(Value value) {
		value.b = 1;
		return value;
	}

}

class Value {
	Byte b;
}

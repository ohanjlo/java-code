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
				ts.add("小");
				ts.add("刀");
				ts.add("哥");
				ts.printAll();
			}).start();
		}
	}
}
/*
 * A.在运行时将会跑出一个异常 
 * B.这个代码将会没有输出，并且不会退出 
 * C.这个代码将会没有输出，并且正常退出
 * D.这个代码将会运行也许会输出 
 * 小刀哥
 * 小刀哥,之后退出.
 * E.这个代码将会运行也许会输出
 * 小刀 哥
 * 小刀哥小刀哥,之后退出.
 * F.这个代码将会运行也许会输出
 * 小 小 小 刀 哥
 * 刀 刀 哥 哥 哥",之后退出.
 * G.这个代码将会运行也许会输出
 * 小 小 刀 刀 哥 哥
 * 小 小 刀 刀 哥 哥,之后退出. 
 * H.这个代码将会运行也许会输出
 * 小 刀 哥 小
 * 小 刀 哥 小 刀 哥",之后退出.
 * I.这个代码将会运行也许会输出
 * 小 刀 小 哥 刀 哥
 * 小 刀 小 哥 刀 哥",之后退出.
 * J.这个代码将会运行也许会输出
 * 小 小 刀 刀 哥
 * 小 小 刀 刀 哥 哥",之后退出.
 */



 

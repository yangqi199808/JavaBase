package base.day02_Java编程基础;

public class LoopStatementTest4 {
	public static void main(String[] args) {
		// 外循环控制行数
		for (int i = 1; i <= 5; i++) {
			// 内循环输出空格
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			// 内循环输出☆
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

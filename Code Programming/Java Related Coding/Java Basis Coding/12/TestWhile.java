import java.util.*;

public class TestWhile {
	public static void main(String[] args) {
		System.out.println("����ѭ������ֵ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int i = 0;
		while(i <= num) {
			System.out.print(i + " ");
			i++;
		}
	}
}
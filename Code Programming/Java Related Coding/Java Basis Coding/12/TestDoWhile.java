import java.util.*;

public class TestDoWhile {
	public static void main(String[] args) {
		System.out.println("����ѭ������ֵ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int i = 0;
		do{
			System.out.print(i + " ");
			i++;
		}while(i <= num);
	}
}
import java.util.*;

public class TestIf2 {
	public static void main(String[] args) {
		System.out.println("������ѧ���ɼ�");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		if(score >= 90) {
			System.out.println("�ȼ�A");
		} else if(score >= 80) {
			System.out.println("�ȼ�B");
		} else if(score >= 70) {
			System.out.println("�ȼ�C");
		} else if(score >= 60) {
			System.out.println("�ȼ�D");
		} else {
			System.out.println("������");
		}
	}
}
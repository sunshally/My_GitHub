import java.util.*;

public class TestSwitch {
	public static void main(String[] args) {
		System.out.println("������ѧ���ɼ�");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		switch(score / 10){
			case 10:
			case 9:
				System.out.println("�ȼ�A");
				break;
			case 8:
				System.out.println("�ȼ�B");
				break;
			case 7:
				System.out.println("�ȼ�C");
				break;
			case 6:
				System.out.println("�ȼ�D");
				break;
			default:
				System.out.println("������");
				
		}
	}
}
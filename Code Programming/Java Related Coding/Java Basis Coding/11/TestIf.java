import java.util.*;

public class TestIf {
	public static void main(String[] args) {
		System.out.println("������ѧ���ɼ�");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		if(score > 60) {
			System.out.println("��ѧ���Ѿ�����");
			System.out.println("��ϲ");
		} else {
			System.out.println("��ѧ��û�м���");
			System.out.println("�벹��");
		}
	}
}
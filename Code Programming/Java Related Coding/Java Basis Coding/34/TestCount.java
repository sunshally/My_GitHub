import java.util.*;


public class TestCount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�����볤���εĳ�");
		double chang = in.nextDouble();
		System.out.println("�����볤���εĿ�");
		double kuan = in.nextDouble();
		System.out.println("�����ε��ܳ�Ϊ" + zhouChang(chang,kuan));
		System.out.println("�����ε����Ϊ" + mianJi(chang,kuan));
	}
	
	public static double zhouChang(double chang, double kuan) {
		double zhouchang = chang * 2 + kuan * 2;
		return zhouchang;
	}
	
	public static double mianJi(double chang, double kuan) {
		double mianji = chang * kuan;
		return mianji;
	}
}
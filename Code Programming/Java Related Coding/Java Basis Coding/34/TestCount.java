import java.util.*;


public class TestCount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入长方形的长");
		double chang = in.nextDouble();
		System.out.println("请输入长方形的宽");
		double kuan = in.nextDouble();
		System.out.println("长方形的周长为" + zhouChang(chang,kuan));
		System.out.println("长方形的面积为" + mianJi(chang,kuan));
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
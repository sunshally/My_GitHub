public class TestOverLoad {
	public static void main(String[] args) {
		Person per = new Person();
		per.love();
		per.love("����");
		per.love(23);
	}
}

class Person {
	
	public void love(){
		System.out.println("��ϲ��");
	}
	
	public void love(String str){
		System.out.println("��ϲ��" + str);
	}
	
	
	public void love(int ivar) {
		System.out.println("��ϲ��" + ivar);
	}
}
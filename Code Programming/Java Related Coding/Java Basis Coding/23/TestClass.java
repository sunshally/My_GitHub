public class TestClass {
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		stu1.name = "����";
		stu1.play();
		
		stu2.name = "����";
		stu2.play();
		
		
	}
}

class Student {
	//���� ��Ա����
	String name;
	String sex;
	int age;
	
	//���� ����
	public void play(){
		System.out.println(name + "������Ϸ");
	}
	
	public void study(){
		System.out.println("����ѧϰ");
	}
}
public class TestInherit {
	public static void main(String[] args) {
		Teacher tea = new Teacher();
		tea.sleep();
		
		Student stu = new Student();
		stu.sleep();
	}
}

class Person {
	String name;
	String sex;
	int age;
	
	public void eat() {
		System.out.println(name + "�Է�");
	}
	
	public void sleep(){
		System.out.println("˯��");
	}

}


class Teacher extends Person{
	public void teach() {
		System.out.println("����");
	}
	
	public void sleep(){
		System.out.println("�ڼ�˯��");
	}

}

class Student  extends Person {
	public void study() {
		System.out.println("ѧϰ");
	}
	
	public void sleep(){
		System.out.println("������˯��");
	}
}

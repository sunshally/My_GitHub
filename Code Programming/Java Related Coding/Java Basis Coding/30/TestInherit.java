public class TestInherit {
	public static void main(String[] args) {
		Teacher tea = new Teacher();
		tea.name = "����";
		tea.eat();
		
		Student stu = new Student();
		stu.name = "����";
		stu.eat();
	}
}

class Person {
	String name;
	String sex;
	int age;
	
	public void eat() {
		System.out.println(name + "�Է�");
	}
}


class Teacher extends Person{
	public void teach() {
		System.out.println("����");
	}
	
}

class Student  extends Person {
	public void study() {
		System.out.println("ѧϰ");
	}
}
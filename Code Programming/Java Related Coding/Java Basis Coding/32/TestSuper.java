public class TestSuper {
	public static void main(String[] args) {
		Teacher tea = new Teacher("����ʦ","��",20);
		tea.sleep();
	}
}

class Person {
	String name;
	String sex;
	int age;
	
	public Person(String name, String sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public void eat() {
		System.out.println(name + "�Է�");
	}
	
	public void sleep(){
		System.out.println("˯��");
	}

}


class Teacher extends Person{
	
	public Teacher(String name, String sex, int age){
	}
	
	public void teach() {
		System.out.println("����");
	}
	
	public void sleep(){
		super.sleep();
		System.out.println("�ڼ�˯��");
	}

}

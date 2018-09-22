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
		System.out.println(name + "³Ô·¹");
	}
	
	public void sleep(){
		System.out.println("Ë¯¾õ");
	}

}


class Teacher extends Person{
	public void teach() {
		System.out.println("½ÌÊé");
	}
	
	public void sleep(){
		System.out.println("ÔÚ¼ÒË¯¾õ");
	}

}

class Student  extends Person {
	public void study() {
		System.out.println("Ñ§Ï°");
	}
	
	public void sleep(){
		System.out.println("ÔÚÇŞÊÒË¯¾õ");
	}
}

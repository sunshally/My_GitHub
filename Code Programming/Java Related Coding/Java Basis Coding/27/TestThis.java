public class TestThis {
	public static void main(String[] args) {
		Person per = new Person("ÕÅÈý","ÄÐ",20);
		per.display();
	}
}

class Person {
	String name;
	String sex;
	int age;
	
	public Person(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
	
	
	public Person(String name, String sex, int age) {
		this(name,sex);
		this.age = age;
	}
	
	public void display() {
		this.display2();
		System.out.println(name + " " + sex + " " + age);
	}
	
	public void display2() {
		System.out.println("-----------------------");
	}
}
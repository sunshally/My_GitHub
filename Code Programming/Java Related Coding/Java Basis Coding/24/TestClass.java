public class TestClass {
	public static void main(String[] args) {
		Person per1 = new Person();
		per1.name = "����";
		per1.sex = "��";
		per1.age = 20;
		per1.display();
		
		
		Person per2 = new Person();
		per2.name = "����";
		per2.sex = "Ů";
		per2.age = 30;
		per2.display();
		
		Person per3 = new Person("����","��",40);
		per3.display();
	}
}

class Person {
	//����
	String name;
	String sex;
	int age;
	
	//Ĭ�Ϲ��췽��
	public Person(){
	}
	
	//���췽��
	public Person(String uname, String usex, int uage) {
		name = uname;
		sex = usex;
		age = uage;
	}
	
	//����
	public void display() {
		System.out.println("����:" + name + ",�Ա�:" + sex + ",����:" + age);
	}

}
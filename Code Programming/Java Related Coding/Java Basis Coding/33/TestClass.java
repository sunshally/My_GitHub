public class TestClass {
	public static void main(String[] args) {
		AnRun(new Cat());
	}
	
	public static void AnRun(Animal an) {
		an.run();
	}
}

class Animal {
	
	public void run(){
		System.out.println("��������");
	}
}

class Cat extends Animal {
	
	public void run() {
		System.out.println("è����");
	}
}

class Dog extends Animal {
	
	public void run() {
		System.out.println("������");
	}
}
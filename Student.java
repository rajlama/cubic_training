package project1;

public class Student {
	int id; // variable id define as integer
	String Name; // variable id define as integer
	static int section = 5;// static key word

	void getName(String name, int x) {
		Name = name;
		id = x;
	}

	void display() {

		System.out.println("name is :" + Name + "\t" + "ID is :" + id + "\t" + " Section is :" + section);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Student first = new Student();
		Student second = new Student();
		Student third = new Student();

		first.getName("ram", 1);

		first.getName("shyam", 9);
		first.display();
		second.getName("hari", 2);
		second.display();

		third.getName("pari", 4);
		third.display();
	}
}
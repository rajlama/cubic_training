package com.dipu.company;

public class Repeated2 {
	int id;
	String name;
	static int c = 10;

	void read(int i, String j) {
		id = i;
		name = j;
	}

	void display() {

		System.out.println("student name" + name + "student id " + id + "student section" + c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repeated2 a = new Repeated2();
		Repeated2 b = new Repeated2();
		Repeated2 c = new Repeated2();

		a.read(1, "kk");
		a.display();
		b.read(2, " oo");
		b.display();
		c.read(3, "jj");
		c.display();

	}

}

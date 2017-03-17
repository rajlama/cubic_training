package com.breign.training.second;

public class FirstProject {
	int id;
	String Name;
	static int section = 10;

	void read(int a, String b) {
		id = a;
		Name = b;

	}

	void desplay() {

		System.out.println("student ID:" + id + " Student Name:" + Name + " Student Section:" + section);
	}

	public static void main(String[] args) {

		FirstProject a = new FirstProject();
		FirstProject b = new FirstProject();
		FirstProject c = new FirstProject();
		FirstProject d = new FirstProject();

		a.read(1001, "raj");
		a.desplay();
		b.read(1002, "hari");
		b.desplay();
		c.read(1003, "shyam");
		c.desplay();
		d.read(1004, "krishna");
		d.desplay();

	}

}


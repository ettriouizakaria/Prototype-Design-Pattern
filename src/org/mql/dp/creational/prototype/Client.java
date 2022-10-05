package org.mql.dp.creational.prototype;

public class Client {

	public Client() {
		exp01();
	}

	void exp01() {
		Prototype prototype = new Prototype(100, "prototype");

		Prototype p1 = prototype.clone();
		System.out.println(p1);
		p1.setId(200);
		p1.setName("p1");
		System.out.println("prototype : " + prototype);
		System.out.println("p1 : " + p1);

		System.out.println("-------------");
		p1.getDate().setYear(2021);
		System.out.println("prototype : " + prototype);
		System.out.println("p1 : " + p1);

	}

	public static void main(String[] args) {
		new Client();
	}

}

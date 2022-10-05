package org.mql.dp.creational.prototype;

public class Prototype implements Cloneable {

	private int id;
	private String name;
	private Date date;
	
	public Prototype() {
	}

	public Prototype(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.date = new Date();
	}

	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Prototype [id=" + id + ", name=" + name + ", date = "+date+"]";
	}
	
	
	public Prototype clone() {
		
		try {
			Prototype p = (Prototype)super.clone();
			p.date = this.date.clone();
			return  p;
		}catch (Exception e) {
			System.out.println("Erreur : "+e.getMessage());
			return null;
		}
	}
	
}

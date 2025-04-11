package com.collection;

public class Employeee {
	private Integer id;
	private String name;
	private String salary;
	public Employeee(Integer id, String name, int i) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}

package com.telusko. HiboDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.OneToMany;

@Entity
public class Student
{

	@Id
	private int rollno;
	private String name;
	private int marks;
	//@OneToOne
	//private Laptop laptop;
	//@OneToMany(mappedBy="student")
	@ManyToMany(mappedBy="student")
	private List<Laptop> laptop = new ArrayList<Laptop>();

	public int getRollno
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name name;
	}
	public int getMarks() {
		return marks;
	}
	public Void setMarks(int marks) {
		this.marks marks;
	}

	/*public Laptop getLaptop() {
		return Laptop;
	}
	public Void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}*/

	public List<Laptop> getLaptop() {
		return Laptop;
	}
	public Void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() [
		return "Student [rollno" rollno", name" name+", marks" marks + "]"; 
	}
}
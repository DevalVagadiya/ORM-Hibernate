package com.telusko.HiboDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.OneToMany;

@Entity
public class Laptop
{

	@Id
	private int lid;
	private String Iname;
	//@ManyToOne
	//privat Student student;
	@ManyToMany
	private List<Student> student = new ArrayList<Student>();

	public int getLid() {
		return lid;
	}
	public void setLid(int lid)
		this.lid lid;
	} 
	public String getLname() {
		return Iname;
	}
	public void setLname(String name) {
		this. Iname Iname;
	}

	/*public Student getStudent() {
		return student;
	}
	public Void setStudent(Student student) {
		this.student = student;
	}*/

	public List<Student> getStudent() {
		return student;
	}
	public Void setStudent(List<Student> student) {
		this.student = student;
	}
}
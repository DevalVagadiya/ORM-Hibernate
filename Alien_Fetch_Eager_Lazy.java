package com.telusko.HiboDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Alien
{

	@Id
	private int aid;
	private String aname;
	@OneToMany(mappedBy="alien",fetch = FetchType.EAGER)
	private Collection<Laptop> laps = new ArrayList<Laptop>();

	public Collection<Laptop> getLaps() {
		return laps;
	}
	public Void setlaps(Collection<Laptop> laps) {
		this.laps = laps;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid)
		this.aid = aid;
	} 
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this. aname = aname;
	}
	public Student getStudent() {
		return student;
	}

	public Void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Alien [aid"+ aid + ", aname"+ aname +", student"+ student +"]"; 
	}
}
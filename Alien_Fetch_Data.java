package com.telusko. DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Column

@Entity
@Table(name="alien_table")

public class Alien
{

	@Id
	private int aid;
	//@Transient
	//private String aname;
	private AlienName aname;
	//@Column(name="alien_color")
	private String color;

	public int getAid() {
		return aid;
	}

	public void setaid(int aid) {
		this.aid = aid;
	}

	/*public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}*/

	public AlienName getAname() {
		return aname;
	}

	public void setAname(AlienName aname) {
		this.aname = aname;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alien [aid"+ aid +", aname"+ aname +", color"+ color +"]"; 
	}
}
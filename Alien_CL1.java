package com.telusko. DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Cacheable;

@Entity
@Table(name "alien_table")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien
{

	@Id
	private int aid;
	private String aname;
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname:
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color; I
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [aid"+ aid +", aname="+ aname +", color"+ color + "]";
	}
}
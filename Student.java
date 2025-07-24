package com.subodh.SpringBeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("119")
	private int rollno;
	@Value("subodh")
	private String Name;
	@Value("97.35f")
	private float mark;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	
	public void display() {
		System.out.println("rollno :"+rollno);
		System.out.println("name:"+Name);
		System.out.println("mark :"+mark);
	}
	
}

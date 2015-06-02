package model;

import java.util.Date;

public class Student {
	
	private int id;
	private String name;
	private String nick;
	private String nirc;
	private int mark;
	private Date dob;
	
	public Student(int id, String name, String nick, String nirc, int mark,
			Date dob) {
		this.id = id;
		this.name = name;
		this.nick = nick;
		this.nirc = nirc;
		this.mark = mark;
		this.dob = dob;
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

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNirc() {
		return nirc;
	}

	public void setNirc(String nirc) {
		this.nirc = nirc;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
}

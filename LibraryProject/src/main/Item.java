package main;

import java.util.Calendar;

public abstract class Item  {
	
	private int id;
	private Calendar date;
	private String title;

	static final int minIDValue = 1000;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}

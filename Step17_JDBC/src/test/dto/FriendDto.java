package test.dto;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class FriendDto {
	
	private int num;
	private String name;
	private String phone;
	private String date;
	
	public FriendDto() {}

	public FriendDto(int num, String name, String phone, String date) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.date = date;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getDate() {
		return date;
	}
	
	public Date setDate(String date) throws ParseException {
	      this.date = date;
	      java.util.Date dateFormat= new java.text.SimpleDateFormat("yyyyMMdd").parse(date);
	      return dateFormat;
	   }


}

package com.jana.app;

public class Test {

	public Long phone;
	public String Area;
	public String person;
	Test(String area,String person, Long phone){
		this.Area=area;
		this.person=person;
		this.phone=phone;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		this.Area = area;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	
}

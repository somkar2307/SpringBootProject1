package carWasher.model;

public class Driver {
private int id;
private String name;
private String surname;
private String phone;
private String address;



public Driver() {
	
}


public Driver(int id, String name, String surname, String phone, String address) {

	this.id = id;
	this.name = name;
	this.surname = surname;
	this.phone = phone;
	this.address = address;
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
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


@Override
public String toString() {
	return "Driver [id=" + id + ", name=" + name + ", surname=" + surname + ", phone=" + phone + ", address=" + address
			+ "]";
}



}
 
package carWasher.model;

import java.util.Date;

public class CarWash {
	
private int id;
private Driver driver;
private Car car;
private Date date;
private int price;


public CarWash() {
}


public CarWash(int id, Driver driver, Car car, Date date, int price) {
	super();
	this.id = id;
	this.driver = driver;
	this.car = car;
	this.date = date;
	this.price = price;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Driver getDriver() {
	return driver;
}
public void setDriver(Driver driver) {
	this.driver = driver;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


@Override
public String toString() {
	return "CarWash [id=" + id + ", driver=" + driver + ", car=" + car + ", date=" + date + ", price=" + price + "]";
}


}

// --------------------------------------------
// Assignment 2
// Question: Part I
// Written by: David Nguyen-Huu 26659330
//--------------------------------------------
package B;

public class Tram extends CityBus{
	private int maximumSpeed;


//parameterized constructor
public Tram(double ticketPrice,int numberOfStops,long routeNumber,int beginOperationYear,String lineName,String driversName,int maximumSpeed) {
	super(ticketPrice,numberOfStops,routeNumber,beginOperationYear,lineName,driversName);
	this.maximumSpeed=maximumSpeed;
}
//copy constructor
public Tram(Tram t) {
	super(t);
	this.maximumSpeed=t.maximumSpeed;
}

//default constructor
public Tram() {
super();
}
//accessors & mutators
@Override
public double getTicketPrice() {
	return ticketPrice;
}
@Override
public void setTicketPrice(double ticketPrice) {
	this.ticketPrice = ticketPrice;
}
@Override
public int getNumberOfStops() {
	return numberOfStops;
}
@Override
public void setNumberOfStops(int numberOfStops) {
	this.numberOfStops = numberOfStops;
}
public long getRouteNumber() {
	return routeNumber;
}
public void setRouteNumber(long routeNumber) {
	this.routeNumber = routeNumber;
}
public int getBeginOperationYear() {
	return beginOperationYear;
}
public void setBeginOperationYear(int beginOperationYear) {
	this.beginOperationYear = beginOperationYear;
}
public String getLineName() {
	return lineName;
}
public void setLineName(String lineName) {
	this.lineName = lineName;
}
public String getDriversName() {
	return driversName;
}
public void setDriversName(String driversName) {
	this.driversName = driversName;
}

public int getMaximumSpeed() {
	return maximumSpeed;
}
public void setMaximumSpeed(int maximumSpeed) {
	this.maximumSpeed = maximumSpeed;
}
public String toString() {
	return "This Tram has  "+ numberOfStops  + ",stops and costs " + ticketPrice+",the route number is "+routeNumber+"the year it began operation is"+beginOperationYear+" the line name is "+ lineName+",the driver's name is "+driversName+"it's maximum speed is :"+maximumSpeed;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Tram other = (Tram) obj;
	if (maximumSpeed != other.maximumSpeed)
		return false;
	return true;
}


}

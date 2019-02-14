// --------------------------------------------
// Assignment 2
// Question: Part I
// Written by: David Nguyen-Huu 26659330
//--------------------------------------------
package B;

public class Metro extends CityBus{
	private int numberOfVehicles;
	private String nameOfTheCity;

//parameterized constructor
public Metro(double ticketPrice,int numberOfStops,long routeNumber,int beginOperationYear,String lineName,String driversName,int numberOfVehicles,String nameOfTheCity) {
super(ticketPrice,numberOfStops,routeNumber,beginOperationYear,lineName,driversName);
this.numberOfVehicles=numberOfVehicles;
this.nameOfTheCity=nameOfTheCity;
}
//copy constructor
public Metro(Metro m) {
	super(m);
	this.numberOfVehicles=m.numberOfVehicles;
	this.nameOfTheCity=m.nameOfTheCity;
}
//default constructor
public Metro() {
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
@Override
public long getRouteNumber() {
	return routeNumber;
}
@Override
public void setRouteNumber(long routeNumber) {
	this.routeNumber = routeNumber;
}
@Override
public int getBeginOperationYear() {
	return beginOperationYear;
}
@Override
public void setBeginOperationYear(int beginOperationYear) {
	this.beginOperationYear = beginOperationYear;
}
@Override
public String getLineName() {
	return lineName;
}
@Override
public void setLineName(String lineName) {
	this.lineName = lineName;
}
@Override
public String getDriversName() {
	return driversName;
}
@Override
public void setDriversName(String driversName) {
	this.driversName = driversName;
}

public int getNumberOfVehicles() {
	return numberOfVehicles;
}

public void setNumberOfVehicles(int numberOfVehicles) {
	this.numberOfVehicles = numberOfVehicles;
}
public String getNameOfTheCity() {
	return nameOfTheCity;
}
public void setNameOfTheCity(String nameOfTheCity) {
	this.nameOfTheCity = nameOfTheCity;
}
//toString method
@Override
public String toString() {
	return "This Metro has  "+ numberOfStops  + ",stops and costs " + ticketPrice+",the route number is "+routeNumber+"the year it began operation is"+beginOperationYear+" the line name is "+ lineName+",the driver's name is "+driversName+" "+numberOfVehicles+" "+nameOfTheCity;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Metro other = (Metro) obj;
	if (nameOfTheCity == null) {
		if (other.nameOfTheCity != null)
			return false;
	} else if (!nameOfTheCity.equals(other.nameOfTheCity))
		return false;
	if (numberOfVehicles != other.numberOfVehicles)
		return false;
	return true;
}




}

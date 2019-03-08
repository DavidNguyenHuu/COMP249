// --------------------------------------------
// Assignment 2
// COMP249
// Question: Part II
// Written by: David Nguyen-Huu 26659330
// Due Date: Sunday February 24th 2019
//--------------------------------------------
package B;

import A.PublicTransportation;

/**Due date: Sunday February 24th 2019
 * @author David Nguyen-Huu
 * PART 2
 */
public class CityBus extends PublicTransportation {
	private long routeNumber;
	private int beginOperationYear;
	private String lineName;
	private String driversName;
	
//default constructor
public CityBus() {
super();
}
//parameterized constructor
/**
 * @param ticketPrice
 * @param numberOfStops
 * @param routeNumber
 * @param beginOperationYear
 * @param lineName
 * @param driversName
 */
public CityBus(double ticketPrice,int numberOfStops,long routeNumber,int beginOperationYear,String lineName,String driversName) {	
	super(ticketPrice,numberOfStops);
	this.routeNumber=routeNumber;
	this.beginOperationYear=beginOperationYear;
	this.lineName=lineName;
	this.driversName=driversName;
	}
//copy constructor
/**
 * @param cb
 */
public CityBus(CityBus cb) {
	super(cb);
	this.routeNumber=cb.routeNumber;
	this.beginOperationYear=cb.beginOperationYear;
	this.lineName=cb.lineName;
	this.driversName=cb.driversName;
}

//accessors & mutators
@Override
public double getTicketPrice() {
	return super.getTicketPrice();
}
@Override
public void setTicketPrice(double ticketPrice) {
	super.setTicketPrice(ticketPrice);
}
@Override
public int getNumberOfStops() {
	return super.getNumberOfStops();
}
@Override
public void setNumberOfStops(int numberOfStops) {
	super.setNumberOfStops(numberOfStops);
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

//toString method
@Override
public String toString() {
	return "This City Bus has "+ super.getNumberOfStops()  + " stops and costs " + super.getTicketPrice()+"$. The route number is "+routeNumber+". The year it began operation is "+beginOperationYear+". The line name is "+ lineName+" and the driver's name is "+driversName;
}
//equals method
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	CityBus other = (CityBus) obj;
	if (beginOperationYear != other.beginOperationYear)
		return false;
	if (driversName == null) {
		if (other.driversName != null)
			return false;
	} else if (!driversName.equals(other.driversName))
		return false;
	if (lineName == null) {
		if (other.lineName != null)
			return false;
	} else if (!lineName.equals(other.lineName))
		return false;
	if (routeNumber != other.routeNumber)
		return false;
	return true;
}
/**
The equals method is NOT effective. It deals with the state of the passed object ( in the case of it being null) and not with the calling object (in the case of it being null).
It would not protect the program from crashing.
*/
}
// --------------------------------------------
// Assignment 2
// COMP249
// Question: Part II
// Written by: David Nguyen-Huu 26659330
// Due Date: Sunday February 24th 2019
//--------------------------------------------
package B;
/**Due date: Sunday February 24th 2019
 * @author David Nguyen-Huu
 * PART 2
 */

public class Tram extends CityBus{
	private int maximumSpeed;


//parameterized constructor
/**
 * @param ticketPrice
 * @param numberOfStops
 * @param routeNumber
 * @param beginOperationYear
 * @param lineName
 * @param driversName
 * @param maximumSpeed
 */
public Tram(double ticketPrice,int numberOfStops,long routeNumber,int beginOperationYear,String lineName,String driversName,int maximumSpeed) {
	super(ticketPrice,numberOfStops,routeNumber,beginOperationYear,lineName,driversName);
	this.maximumSpeed=maximumSpeed;
}
//copy constructor
/**
 * @param t
 */
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
	return super.getRouteNumber();
}
public void setRouteNumber(long routeNumber) {
	super.setRouteNumber(routeNumber);
}
public int getBeginOperationYear() {
	return super.getBeginOperationYear();
}
public void setBeginOperationYear(int beginOperationYear) {
	super.setBeginOperationYear(beginOperationYear);
}
public String getLineName() {
	return super.getLineName();
}
public void setLineName(String lineName) {
	super.setLineName(lineName);
}
public String getDriversName() {
	return super.getDriversName();
}
public void setDriversName(String driversName) {
	super.setDriversName(driversName);
}

public int getMaximumSpeed() {
	return maximumSpeed;
}
public void setMaximumSpeed(int maximumSpeed) {
	this.maximumSpeed = maximumSpeed;
}
public String toString() {
	return "This Tram has "+ super.getNumberOfStops()  + ",stops and costs " + super.getTicketPrice()+" ,the route number is "+super.getRouteNumber()+" the year it began operation is "+super.getBeginOperationYear()+" the line name is "+ super.getLineName()+",the driver's name is "+super.getDriversName()+"it's maximum speed is :"+maximumSpeed;
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
/**
The equals method is NOT effective. It deals with the state of the passed object ( in the case of it being null) and not with the calling object (in the case of it being null).
It would not protect the program from crashing.
*/

}

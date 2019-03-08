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

public class Metro extends CityBus{
	private int numberOfVehicles;
	private String nameOfTheCity;

//parameterized constructor
/**
 * @param ticketPrice
 * @param numberOfStops
 * @param routeNumber
 * @param beginOperationYear
 * @param lineName
 * @param driversName
 * @param numberOfVehicles
 * @param nameOfTheCity
 */
public Metro(double ticketPrice,int numberOfStops,long routeNumber,int beginOperationYear,String lineName,String driversName,int numberOfVehicles,String nameOfTheCity) {
super(ticketPrice,numberOfStops,routeNumber,beginOperationYear,lineName,driversName);
this.numberOfVehicles=numberOfVehicles;
this.nameOfTheCity=nameOfTheCity;
}
//copy constructor
/**
 * @param m
 */
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
@Override
public long getRouteNumber() {
	return super.getRouteNumber();
}
@Override
public void setRouteNumber(long routeNumber) {
	super.setRouteNumber(routeNumber);
}
@Override
public int getBeginOperationYear() {
	return super.getBeginOperationYear();
}
@Override
public void setBeginOperationYear(int beginOperationYear) {
	super.setBeginOperationYear(beginOperationYear);
}
@Override
public String getLineName() {
	return super.getLineName();
}
@Override
public void setLineName(String lineName) {
	super.setLineName(lineName);
}
@Override
public String getDriversName() {
	return super.getDriversName();
}
@Override
public void setDriversName(String driversName) {
	super.setDriversName(driversName);
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
	return "This Metro has "+ super.getNumberOfStops() + ",stops and costs " + super.getTicketPrice()+".The route number is "+super.getRouteNumber()+"the year it began operation is "+super.getBeginOperationYear()+" the line name is "+ super.getLineName()+",the driver's name is "+super.getDriversName()+". Their are "+numberOfVehicles+" number of vehicles. The city's name is "+nameOfTheCity;
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
/**
The equals method is NOT effective. It deals with the state of the passed object ( in the case of it being null) and not with the calling object (in the case of it being null).
It would not protect the program from crashing.
*/



}
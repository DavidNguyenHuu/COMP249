//--------------------------------------------
//Assignment 2
//COMP249
//Question: Part I
//Written by: David Nguyen-Huu 26659330
//Due Date: Sunday February 24th 2019
//--------------------------------------------
package B;
/**Due date: Sunday February 24th 2019
 * @author David Nguyen-Huu
 *PART 1
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
	return "This Metro has "+ numberOfStops  + " stops and costs " + ticketPrice+".The route number is "+routeNumber+".The year it began operation is "+beginOperationYear+" and the line name is "+ lineName+".The driver's name is "+driversName+" and it has "+numberOfVehicles+" number of vehicles. The name of the city is "+nameOfTheCity+".";
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
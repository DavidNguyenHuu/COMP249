//--------------------------------------------
//Assignment 2
//COMP249
//Question: Part I
//Written by: David Nguyen-Huu 26659330
//Due Date: Sunday February 24th 2019
//--------------------------------------------
package C;
/**Due date: Sunday February 24th 2019
 * @author David Nguyen-Huu
 *
 */

import A.PublicTransportation;

public class Ferry extends PublicTransportation{
	private int buildYear;
	private String shipName;

//default constructor
public Ferry() {
	super();
}
//parameterized constructor
public Ferry(double ticketPrice,int numberOfStops,int buildYear, String shipName) {
	super(ticketPrice,numberOfStops);
	this.buildYear=buildYear;
	this.shipName=shipName;
}
//copy constructor
public Ferry(Ferry f) {
	super(f);
	this.buildYear=f.buildYear;
	this.shipName=f.shipName;
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

public int getBuildYear() {
	return buildYear;
}
public void setBuildYear(int buildYear) {
	this.buildYear = buildYear;
}
public String getShipName() {
	return shipName;
}
public void setShipName(String shipName) {
	this.shipName = shipName;
}

@Override
public String toString() {
	return "This is the Ferry, it was built in " + buildYear + ", the name of the ship is the " + shipName + ", and the price is " + ticketPrice
			+ ", it has " + numberOfStops+" stop.";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Ferry other = (Ferry) obj;
	if (buildYear != other.buildYear)
		return false;
	if (shipName == null) {
		if (other.shipName != null)
			return false;
	} else if (!shipName.equals(other.shipName))
		return false;
	return true;
}
/**
The equals method is NOT effective. It deals with the state of the passed object ( in the case of it being null) and not with the calling object (in the case of it being null).
It would not protect the program from crashing.
*/

}

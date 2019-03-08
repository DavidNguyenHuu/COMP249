// --------------------------------------------
// Assignment 2
// COMP249
// Question: Part II
// Written by: David Nguyen-Huu 26659330
// Due Date: Sunday February 24th 2019
//--------------------------------------------
package A;

/**
 * @author David Nguyen-Huu
 *
 */
public class PublicTransportation {
	private double ticketPrice; 
	private int numberOfStops;
	
//default constructor	
public PublicTransportation() {
}

//parameterized constructor
/**
 * @param ticketPrice
 * @param numberOfStops
 */
public PublicTransportation(double ticketPrice,int numberOfStops) {
	this.ticketPrice=ticketPrice;
	this.numberOfStops=numberOfStops;
}
//copy constructor
public PublicTransportation(PublicTransportation pt) {
	this.ticketPrice=pt.ticketPrice;
	this.numberOfStops=pt.numberOfStops;
}
//accessors & mutators
public double getTicketPrice() {
	return ticketPrice;
}

public void setTicketPrice(double ticketPrice) {
	this.ticketPrice = ticketPrice;
}

public int getNumberOfStops() {
	return numberOfStops;
}

public void setNumberOfStops(int numberOfStops) {
	this.numberOfStops = numberOfStops;
}

//toString method
@Override
public String toString() {
	return "This Public Transportation has "+ numberOfStops  + " stops and costs " + ticketPrice+"$";
}

//Equals Method
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PublicTransportation other = (PublicTransportation) obj;
	if (numberOfStops != other.numberOfStops)
		return false;
	if (Double.doubleToLongBits(ticketPrice) != Double.doubleToLongBits(other.ticketPrice))
		return false;
	return true;
}
/**
The equals method is NOT effective. It deals with the state of the passed object ( in the case of it being null) and not with the calling object (in the case of it being null).
It would not protect the program from crashing.
*/

}
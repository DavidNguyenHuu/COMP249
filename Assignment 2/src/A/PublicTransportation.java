
// --------------------------------------------
// Assignment 2
// Question: Part I
// Written by: David Nguyen-Huu 26659330
//--------------------------------------------

package A;

public class PublicTransportation {
	protected double ticketPrice;
	protected int numberOfStops;
	
//default constructor	
public PublicTransportation() {
}

//parameterized constructor
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
	return "This Public Transportation has  "+ numberOfStops  + ",stops and costs " + ticketPrice;
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


}

//--------------------------------------------
//Assignment 2
//COMP249
//Question: Part I
//Written by: David Nguyen-Huu 26659330
//Due Date: Sunday February 24th 2019
//--------------------------------------------
package D;
/**Due date: Sunday February 24th 2019
 * @author David Nguyen-Huu
 *
 */
import A.PublicTransportation;

public class Aircraft extends PublicTransportation{

/**
 * @author David Nguyen-Huu
 *
 */
public static enum TypeOfClass{
		Helicopter,
		Airline,
		Glider,
		Balloon;
}
public static enum TypeOfMaintenance{
		Weekly,
		Montly,
		Yearly;
}
protected TypeOfClass typeClass;
protected TypeOfMaintenance maintenanceType;

//default constructor
public Aircraft(){
	super();
}

//parameterized constructor
/**
 * @param ticketPrice
 * @param numberOfStops
 * @param typeClass
 * @param maintenanceType
 */
public Aircraft(double ticketPrice,int numberOfStops,TypeOfClass typeClass,TypeOfMaintenance maintenanceType){
	super(ticketPrice,numberOfStops);
	this.typeClass=typeClass;
	this.maintenanceType=maintenanceType;
}
//copy constructor
/**
 * @param a
 */
public Aircraft(Aircraft a) {
	super(a);
	this.typeClass=a.typeClass;
	this.maintenanceType=a.maintenanceType;
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

public TypeOfClass getTypeClass() {
	return typeClass;
}
public void setTypeClass(TypeOfClass typeClass) {
	this.typeClass = typeClass;
}
public TypeOfMaintenance getMaintenanceType() {
	return maintenanceType;
}
public void setMaintenanceType(TypeOfMaintenance maintenanceType) {
	this.maintenanceType = maintenanceType;
}

//toString method
@Override
public String toString() {
	return "This is the Aircraft the type is the "+ typeClass + ". The maintenance type is " + maintenanceType + ". The ticket price is " + ticketPrice
			+ ".It has " + numberOfStops + " stops.";
}

//equalsMethod

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Aircraft other = (Aircraft) obj;
	if (maintenanceType != other.maintenanceType)
		return false;
	if (typeClass != other.typeClass)
		return false;
	return true;
}
/**
The equals method is NOT effective. It deals with the state of the passed object ( in the case of it being null) and not with the calling object (in the case of it being null).
It would not protect the program from crashing.
*/




}

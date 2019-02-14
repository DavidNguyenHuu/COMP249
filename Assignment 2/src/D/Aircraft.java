// --------------------------------------------
// Assignment 2
// Question: Part I
// Written by: David Nguyen-Huu 26659330
//--------------------------------------------
package D;

import A.PublicTransportation;

public class Aircraft extends PublicTransportation{

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
public Aircraft(double ticketPrice,int numberOfStops,TypeOfClass typeClass,TypeOfMaintenance maintenanceType){
	super(ticketPrice,numberOfStops);
	this.typeClass=typeClass;
	this.maintenanceType=maintenanceType;
}
//copy constructor
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
	return "This is the Aircraft the type is"+ typeClass + ", maintenanceType=" + maintenanceType + ", ticketPrice=" + ticketPrice
			+ ", numberOfStops=" + numberOfStops + "]";
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





}

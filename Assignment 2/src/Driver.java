import A.PublicTransportation;
import B.CityBus;
import B.Metro;
import B.Tram;
import C.Ferry;
import D.Aircraft;
import static D.Aircraft.TypeOfClass.Helicopter;
import static D.Aircraft.TypeOfMaintenance.Weekly;

// --------------------------------------------
// Assignment 2
// Question: Part I
// Written by: David Nguyen-Huu 26659330
//--------------------------------------------

public class Driver {




	public static void main(String[] args) {
		
		PublicTransportation pt1=new PublicTransportation(10,20);
		CityBus cb1=new CityBus(11,21,5,1990,"Cote-Vertu","Valerie Plante");
		Tram t1=new Tram(12,22,6,1991,"Honore-Beaugrand","Dennis Coderre",100);
		Metro m1=new Metro(13,23,7,1992,"Longeuil","Justin Trudeau",10,"Montreal");
		Ferry f1=new Ferry(4350,1,1909, "Titanic");
		Aircraft a1=new Aircraft(400,1,Helicopter,Weekly);
		
		
		System.out.println(pt1.toString());
		System.out.println(cb1.toString());
		System.out.println(t1.toString());
		System.out.println(m1.toString());
		System.out.println(f1.toString());
		System.out.println(a1.toString());
		
	}

}

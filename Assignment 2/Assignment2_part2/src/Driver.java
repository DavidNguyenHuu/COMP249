import A.PublicTransportation;
import B.CityBus;
import B.Metro;
import B.Tram;
import C.Ferry;
import D.Aircraft;
import static D.Aircraft.TypeOfClass.Helicopter;
import static D.Aircraft.TypeOfClass.Glider;
import static D.Aircraft.TypeOfMaintenance.Weekly;
import static D.Aircraft.TypeOfClass.Balloon;
import static D.Aircraft.TypeOfMaintenance.Yearly;


// --------------------------------------------
// Assignment 2
// COMP249
// Question: Part II
// Written by: David Nguyen-Huu 26659330
// Due Date: Sunday February 24th 2019
//--------------------------------------------
/**
 * Due Date: Sunday February 24th 2019
 * @author David Nguyen-Huu
 * PART 2
 */

public class Driver{
	
/**
 * @param pt
 */
public static void leastExpensive(PublicTransportation[]pt) {
		double leastExpensive=Integer.MAX_VALUE;
		int index=-1;
		for (int i=0;i<pt.length;i++) {
			if (pt[i].getTicketPrice()<leastExpensive){
				leastExpensive=pt[i].getTicketPrice();
				index=i;
			}
		}
		if(index!=-1)
			System.out.println("The public transportation of index "+index+" is the LEAST expensive."+pt[index]);
	    }
		
/**
 * @param pt
 */
public static void mostExpensive(PublicTransportation[]pt) {
		double mostExpensive=0;
		int index=-1;
		
	    for (int i=0; i<pt.length; i++){
	          
	          if (pt[i].getTicketPrice()>mostExpensive){
	              mostExpensive=pt[i].getTicketPrice();
	              index=i;
	          }
	      }
	      if (index!=-1)
	       System.out.println("The public transportation of index "+index+ " is the MOST expensive."+pt[index]);
		
	}

//copyCityBus method
/**
 * @param pt
 * @return
 */
public static PublicTransportation[]copyCityBus(PublicTransportation[] pt){
    PublicTransportation[] arr =  new PublicTransportation[pt.length];
    for (int i=0; i<pt.length; i++){
        arr[i]=new PublicTransportation(pt[i]);
    }
    return arr;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PublicTransportation pt1=new PublicTransportation(10,20);
		CityBus cb1=new CityBus(11,21,5,1990,"Cote-Vertu","Valerie Plante");
		Tram t1=new Tram(12,22,6,1991,"Honore-Beaugrand","Dennis Coderre",100);
		Metro m1=new Metro(13,23,7,1992,"Longeuil","Justin Trudeau",10,"Montreal");
		Ferry f1=new Ferry(4350,1,1909, "Titanic");
		Aircraft a1=new Aircraft(400,300,Helicopter,Weekly);
	
		
		//Displaying all information using toString Methods
		System.out.println("TESTING TOSTRING METHODS\n");
		System.out.println(pt1.toString());
		System.out.println(cb1.toString());
		System.out.println(t1.toString());
		System.out.println(m1.toString());
		System.out.println(f1.toString());
		System.out.println(a1.toString()+"\n");
		
		//Testing Equals Method
		System.out.println("TESTING EQUALS METHODS\n");
		System.out.println(pt1.equals(pt1));
		System.out.println(cb1.equals(t1));
		System.out.println(t1.equals(cb1));
		System.out.println(m1.equals(m1));
		System.out.println(f1.equals(f1));
		System.out.println(a1.equals(pt1)+"\n");
		
		
		//15 arrays of PublicTransportation objects
		PublicTransportation[] arr= new PublicTransportation[15];
		arr[0]=new CityBus(cb1);
		arr[1]=new Tram(t1);
		arr[2]=new Metro(m1);
		arr[3]=new Ferry(f1);
		arr[4]=new Aircraft(a1);
		arr[5]=new CityBus(5,1,6,1985,"Angrignon","Donald Trump");
		arr[6]=new PublicTransportation(pt1);
		arr[7]=new Tram(2,12,9,1991,"Hogwarts Express","Hilary Clinton",50);
		arr[8]=new Ferry(300,4,1492, "Santa Maria");
		arr[9]=new Aircraft(400,1,Balloon,Weekly);
		arr[10]=new CityBus(40,11,2,2018,"Saint-Michel","Alexandria Ocasio Cortez");
		arr[11]=new Tram(100,50,5,1600,"Snowdon","Edward Snowdon",300);
		arr[12]=new Metro(3,23,7,1895,"Neverland","Thomas",9,"Vancouver");
	    arr[13]=new Ferry(600,4,2019, "Mayflower");
	    arr[14]=new Aircraft(200,3,Glider,Yearly);
	    
	    //Trace(Search)
	    System.out.println("TESTING TRACE\n");
	    Driver.leastExpensive(arr);
	    Driver.mostExpensive(arr);
	    
	    //Copy Public Transporation Test
		PublicTransportation[] arr2= new PublicTransportation[12];
		arr2[0]=new CityBus(cb1);
		arr2[1]=new Tram(t1);
		arr2[2]=new Metro(m1);
		arr2[3]=new Ferry(f1);
		arr2[4]=new Aircraft(a1);
		arr2[5]=new CityBus(5,1,6,1985,"Angrignon","Donald Trump");
		arr2[6]=new PublicTransportation(pt1);
		arr2[7]=new Tram(2,12,9,1991,"Hogwarts Express","Hilary Clinton",50);
		arr2[8]=new Ferry(300,4,1492, "Santa Maria");
		arr2[9]=new Aircraft(400,1,Balloon,Weekly);
		arr2[10]=new CityBus(40,11,2,2018,"Saint-Michel","Alexandria Ocasio Cortez");
		arr2[11]=new Tram(100,50,5,1600,"Snowdon","Edward Snowdon",300);
	
	    
	    System.out.println("\nORIGINAL ARRAY\n");
        for (int i =0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
        
        System.out.println("\nARRAY USING copyCityBus() METHOD\n");
        PublicTransportation[] copyArray= Driver.copyCityBus(arr2);
        for (int i =0; i<copyArray.length; i++){
            System.out.println(copyArray[i]);
            
            /**
             * The array did NOT copy correctly. It is because of Java's implementation of polymorphism. The compiler called the copy method of the Public Transportation class and did not call the copy constructor of the object's class.
             * A solution to this problem would be to have a method that calls the copy constructor of the class that has the exact same name in order to over the method.
             */
        
	}
}
}

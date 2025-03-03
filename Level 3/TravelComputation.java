//Import Scanner Module
import java.util.Scanner;

// Create TravelComputation Class to compute the Distance and Travel Time
class TravelComputation {
   
   public static void main(String[] args) {
	   
	   Scanner input = new Scanner(System.in);

      // Create a variable name to indicate the person traveling
	  System.out.println("Name: ");
      String name = input.nextLine();
      
      // Create a variable fromCity, viaCity and toCity to indicate the city
      // from city, via city and to city the person is travelling
	  System.out.println("From: ");
      String fromCity = input.nextLine();
	  
	  System.out.println("Via: ");
	  String viaCity = input.nextLine();
	  
	  System.out.println("To: ");
	  String toCity = input.nextLine();

      // Create a variable distanceFromToVia to indicate the distance 
      // between the fromCity to viaCity
	  System.out.println("Distance From to Via: ");
      double distanceFromToVia = input.nextDouble();

      // Create a variable timeFromToVia to indicate the time taken to 
      // travel from fromCity to viaCity in minutes
	  System.out.println("Time From to Via: ");
      int timeFromToVia = input.nextInt();

      // Create a variable distanceViaToFinalCity to indicate the distance 
      // between the viaCity to toCity
	  System.out.println("Distance Via to To: ");
      double distanceViaToFinalCity = input.nextDouble();

      // Create a variable timeViaToFinalCity to indicate the time taken to
      // travel from viaCity to toCity in minutes
	  System.out.println("Time Via to To: ");
      int timeViaToFinalCity = input.nextInt();

      // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;


      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}

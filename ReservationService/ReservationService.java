package ReservationService;

import java.util.ArrayList;
import java.util.Scanner;

import Flight.Flight;
import ReservationService.Booking;

public class ReservationService extends Booking{
	
	public ReservationService(String flightDestination, int numberOfRegSeats, int numberOfFrstSeats, int totalCost) {
		super(flightDestination, numberOfRegSeats, numberOfFrstSeats, totalCost);
		// TODO Auto-generated constructor stub
	}
	
	static ArrayList<Flight> flightSchedule = new ArrayList<Flight>();
	static ArrayList<Booking> collectionOfBookings = new ArrayList<Booking>();
	
	static Flight matchingFlight;


	public static void main(String args[]){
		
		Flight paris321 = new Flight("Paris", 700, 200, 300, 300);
		flightSchedule.add(paris321);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the flight booking system");
		System.out.println("where would you like to fly to: ");
		String tempDest=sc.nextLine();
		Flight f = seeIfFlightIsValid(tempDest);
		System.out.println("How many first class seats do you require on the flight");
		int numberOfFirstSeats=sc.nextInt();
		System.out.println("How many regular class seats do you require on the flight");
		int numberOfRegSeats=sc.nextInt();
		int totalCost = calcTotalPrice(numberOfFirstSeats, numberOfRegSeats, f);		
		Booking b=new Booking(tempDest, numberOfRegSeats, numberOfFirstSeats, totalCost);
		collectionOfBookings.add(b);
		System.out.println("Your booking looks like this: ");
		System.out.println("Your destination is "+b.getFlightDestination());
		System.out.println("First class seats: "+b.getNumberOfFrstSeats());
		System.out.println("Regular class seats: "+b.getNumberOfRegSeats());
		System.out.println("The total cost = "+b.getTotalCost());
		System.out.println("The destinations currently booked are: ");
		printOfCurrentBookingList();
		
		
		
		
		
	}
	
	private static void printOfCurrentBookingList() {
		for(Booking b:collectionOfBookings){
			System.out.println(b.getFlightDestination());
		}
		
	}

	public static Flight seeIfFlightIsValid(String tempDest){
		for(int i=0;i<flightSchedule.size();i++){
			if(tempDest.equalsIgnoreCase(flightSchedule.get(i).getDestination())){
				matchingFlight=flightSchedule.get(i);
			System.out.println("We have found a flight for you");
			}
		else{
			System.out.println("There are no flights matching your destination");
		}
	}
		return matchingFlight;
	}
	
	public static int calcTotalPrice(int numberOfFirstSeats, int numberOfRegSeats, Flight f){
		int totalPrice = (numberOfFirstSeats*f.getFirstPrice()) + (numberOfRegSeats*f.getRegPrice());
		return totalPrice;
	}

}

package ReservationService;

public class Booking {
	
	private String flightDestination;
	private int numberOfRegSeats;
	private int numberOfFrstSeats;
	private int totalCost;
	public Booking(String flightDestination, int numberOfRegSeats, int numberOfFrstSeats, int totalCost) {
		super();
		this.flightDestination = flightDestination;
		this.numberOfRegSeats = numberOfRegSeats;
		this.numberOfFrstSeats = numberOfFrstSeats;
		this.totalCost = totalCost;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlight(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	public int getNumberOfRegSeats() {
		return numberOfRegSeats;
	}
	public void setNumberOfRegSeats(int numberOfRegSeats) {
		this.numberOfRegSeats = numberOfRegSeats;
	}
	public int getNumberOfFrstSeats() {
		return numberOfFrstSeats;
	}
	public void setNumberOfFrstSeats(int numberOfFrstSeats) {
		this.numberOfFrstSeats = numberOfFrstSeats;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	
	
	
	

}

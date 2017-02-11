package Flight;

public class Flight {
	
	String destination;
	int firstPrice;
	int totalNumberFirstSeats;
	
	int regPrice;
	int totalNumberRegSeats;
	
	public Flight(String destination, int firstPrice, int totalNumberFirstSeats, int regPrice,
			int totalNumberRegSeats) {
		super();
		this.destination = destination;
		this.firstPrice = firstPrice;
		this.totalNumberFirstSeats = totalNumberFirstSeats;
		this.regPrice = regPrice;
		this.totalNumberRegSeats = totalNumberRegSeats;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFirstPrice() {
		return firstPrice;
	}

	public void setFirstPrice(int firstPrice) {
		this.firstPrice = firstPrice;
	}

	public int getTotalNumberFirstSeats() {
		return totalNumberFirstSeats;
	}

	public void setTotalNumberFirstSeats(int totalNumberFirstSeats) {
		this.totalNumberFirstSeats = totalNumberFirstSeats;
	}

	public int getRegPrice() {
		return regPrice;
	}

	public void setRegPrice(int regPrice) {
		this.regPrice = regPrice;
	}

	public int getTotalNumberRegSeats() {
		return totalNumberRegSeats;
	}

	public void setTotalNumberRegSeats(int totalNumberRegSeats) {
		this.totalNumberRegSeats = totalNumberRegSeats;
	}
	
	

}

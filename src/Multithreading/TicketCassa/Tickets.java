package Multithreading.TicketCassa;

public class Tickets {

    private int ticketNumber;
    private int busNumber;
    private int placeNumber;
    private int price;

    public Tickets(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Tickets(int ticketNumber, int busNumber) {
        this.ticketNumber = ticketNumber;
        this.busNumber = busNumber;
    }

    public Tickets(int ticketNumber, int busNumber, int placeNumber) {
        this.ticketNumber = ticketNumber;
        this.busNumber = busNumber;
        this.placeNumber = placeNumber;
    }

    public Tickets(int ticketNumber, int busNumber, int placeNumber, int price) {
        this.ticketNumber = ticketNumber;
        this.busNumber = busNumber;
        this.placeNumber = placeNumber;
        this.price = price;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

package entities;

public class Slot {
    private String type;
    private Vehicle vehicle;
    private String ticketId;

    public Slot(){

    }

    public Slot(String type, Vehicle vehicle, String ticketId) {
        this.type = type;
        this.vehicle = vehicle;
        this.ticketId = ticketId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
}
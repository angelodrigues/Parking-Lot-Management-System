import java.util.List;

import entities.Slot;

public class ParkingLot {
    private String parkingLotId;
    private List<Slot> slots;//lista de vagas
    private Integer nFloors;//floor number

    public ParkingLot(){

    }

    public ParkingLot(String parkingLotId, Integer nFloors, Integer noOfSlotsPerFlr) {
        this.parkingLotId = parkingLotId;        
        this.nFloors = nFloors;
    }

    public String parkVehicle(String type, String regNo, String color){
        return "";
    }

    public String unPark(String ticketId){
        return "";
    }

    public String getNoOfOpenSlots(String type){
        return "";
    }

    public List<Slot> displayOpenSlots(String type){
        
    }

    public List<Slot> displayOccupiedSlots(String type){
        
    }
    
}
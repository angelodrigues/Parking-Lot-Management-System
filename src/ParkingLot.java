import java.util.ArrayList;
import java.util.List;

import entities.Slot;
import entities.Vehicle;

public class ParkingLot {
    String parkingLotId;
    private List<List<Slot>> slots;

    public ParkingLot(){

    }

    public ParkingLot(String parkingLotId, Integer nFloors, Integer noOfSlotsPerFlr) {
        this.parkingLotId = parkingLotId;        
        slots = new ArrayList<>();

        for(int i = 0; i < nFloors; i++){
            slots.add(new ArrayList<>());

            List<Slot> floorSlots = slots.get(i);
            floorSlots.add(new Slot("truck"));
            floorSlots.add(new Slot("bike"));
            floorSlots. add(new Slot("bike"));
        
            for(int j=3;j<noOfSlotsPerFlr;j++){
                slots.get(i).add(new Slot("car"));
            }        
        }
    }

    public String parkVehicle(String type, String regNo, String color){
        Vehicle vehicle = new Vehicle(type, regNo, color);
        for(int i = 0; i < slots.size(); i++){            
            for(int j = 0; i < slots.get(i).size(); i++){
                Slot slot = slots.get(i).get(j);
                if(slot.getType() == type && slot.getVehicle() == null){
                    slot.setVehicle(vehicle);
                    slot.setTicketId(generateTicketId(i + 1, j + 1));
                    return slot.getTicketId();
                }
            }
        }
        System.out.println("NO slot available for given type");
        return null;
    }

    public void unPark(String ticketId){
        try {
            String[] extract = ticketId.split("_");
            int flr_idx = Integer.parseInt(extract[1])-1;
            int slot_idx = Integer.parseInt(extract[2])-1;

            for(int i=0; i<slots.size();i++){
                for(int j=0;j<slots.get(i).size(); j++){
                    if(i==flr_idx && j==slot_idx) {
                        Slot slot = slots.get(i).get(j);
                        slot.setVehicle(null);
                        slot.setTicketId(null);
                        System.out.println("Unparked vehicle");    
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("TicketId not found. " + e.getMessage());
        }
    }

    public String getNoOfOpenSlots(String type){
        return "";
    }

    public List<Slot> displayOpenSlots(String type){
        
    }

    public List<Slot> displayOccupiedSlots(String type){

    }

    private String generateTicketId(int flr, int slno){
        return parkingLotId + "_" + flr + "_" + slno;
    }
}
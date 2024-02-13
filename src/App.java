public class App {
    public static void main(String[] args) throws Exception {
        int nFloors=4;
        int nSlotsPerFloor=6;
        ParkingLot parkingLot = new ParkingLot("PL", nFloors, nSlotsPerFloor);
        System.out.println(parkingLot.getNoOfOpenSlots("truck"));
        System.out.println(parkingLot.getNoOfOpenSlots("bike"));
        System.out.println(parkingLot.getNoOfOpenSlots("car"));

        String ticket1 = parkingLot.parkVehicle("car", "MH-03", "red");
        String ticket2 = parkingLot.parkVehicle("car", "MH-04", "purple");
        parkingLot.displayOpenSlots("truck");
        parkingLot.parkVehicle("truck", "MH-01", "black");
        parkingLot.displayOccupiedSlots("truck");


        System.out.println(parkingLot.getNoOfOpenSlots("truck"));
        System.out.println(parkingLot.getNoOfOpenSlots("bike"));
        System.out.println(parkingLot.getNoOfOpenSlots("car"));

        parkingLot.displayOccupiedSlots("car");
        parkingLot.unPark(ticket2);
        parkingLot.displayOccupiedSlots("car");
    }
}

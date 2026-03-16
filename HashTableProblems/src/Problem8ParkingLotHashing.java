import java.util.HashMap;
import java.util.Scanner;

public class Problem8ParkingLotHashing {

    public static void main(String[] args) {

        System.out.println("Parking Lot Management System");

        HashMap<String, String> parkingLot = new HashMap<>();

        parkingLot.put("KA01AB1234", "Slot1");
        parkingLot.put("TN10CD5678", "Slot2");
        parkingLot.put("AP05EF4321", "Slot3");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vehicle number to check: ");
        String vehicle = scanner.nextLine();

        if(parkingLot.containsKey(vehicle)) {

            System.out.println("Vehicle Found!");
            System.out.println("Parking Slot: " + parkingLot.get(vehicle));

        }
        else {

            System.out.println("Vehicle not found in parking lot.");

        }

        System.out.println("\nCurrent Parking Records:");

        for(String key : parkingLot.keySet()) {

            System.out.println(key + " → " + parkingLot.get(key));

        }

        scanner.close();
    }
}
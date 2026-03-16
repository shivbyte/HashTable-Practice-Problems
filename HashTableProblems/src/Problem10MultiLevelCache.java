import java.util.HashMap;
import java.util.Scanner;

public class Problem10MultiLevelCache {

    public static void main(String[] args) {

        System.out.println("Multi-Level Cache System");

        HashMap<String, String> L1Cache = new HashMap<>();
        HashMap<String, String> L2Cache = new HashMap<>();

        // L1 Cache (Fast Memory)
        L1Cache.put("user1", "Data_A");
        L1Cache.put("user2", "Data_B");

        // L2 Cache (Secondary Memory)
        L2Cache.put("user3", "Data_C");
        L2Cache.put("user4", "Data_D");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter key to retrieve data: ");
        String key = scanner.nextLine();

        if(L1Cache.containsKey(key)) {

            System.out.println("Data found in L1 Cache: " + L1Cache.get(key));

        }
        else if(L2Cache.containsKey(key)) {

            System.out.println("Data found in L2 Cache: " + L2Cache.get(key));
            System.out.println("Promoting data to L1 Cache...");

            L1Cache.put(key, L2Cache.get(key));

        }
        else {

            System.out.println("Data not found in cache. Fetching from database...");

        }

        System.out.println("\nL1 Cache Contents:");
        for(String k : L1Cache.keySet()) {
            System.out.println(k + " → " + L1Cache.get(k));
        }

        System.out.println("\nL2 Cache Contents:");
        for(String k : L2Cache.keySet()) {
            System.out.println(k + " → " + L2Cache.get(k));
        }

        scanner.close();
    }
}

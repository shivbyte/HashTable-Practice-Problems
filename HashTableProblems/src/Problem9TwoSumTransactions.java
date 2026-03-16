import java.util.HashMap;
import java.util.Scanner;

public class Problem9TwoSumTransactions {

    public static void main(String[] args) {

        System.out.println("Two Sum Transaction Finder");

        Scanner scanner = new Scanner(System.in);

        int[] transactions = {10, 25, 40, 15, 30, 50};

        System.out.print("Enter target transaction amount: ");
        int target = scanner.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        boolean found = false;

        for(int i = 0; i < transactions.length; i++) {

            int complement = target - transactions[i];

            if(map.containsKey(complement)) {

                System.out.println("Transactions found: " + complement + " + " + transactions[i] + " = " + target);
                found = true;
                break;

            }

            map.put(transactions[i], i);
        }

        if(!found) {
            System.out.println("No matching transactions found.");
        }

        scanner.close();
    }
}
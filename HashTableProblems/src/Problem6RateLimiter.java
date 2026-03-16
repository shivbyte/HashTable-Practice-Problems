import java.util.HashMap;
import java.util.Scanner;

public class Problem6RateLimiter {

    public static void main(String[] args) {

        System.out.println("API Rate Limiter System");

        HashMap<String, Integer> requestCount = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String user = scanner.nextLine();

        int limit = 5; // maximum allowed requests

        if(requestCount.containsKey(user)) {

            int count = requestCount.get(user);

            if(count < limit) {

                requestCount.put(user, count + 1);
                System.out.println("Request allowed. Count: " + (count + 1));

            }
            else {

                System.out.println("Rate limit exceeded. Try again later.");

            }

        }
        else {

            requestCount.put(user, 1);
            System.out.println("Request allowed. Count: 1");

        }

        System.out.println("\nCurrent Request Counts:");

        for(String key : requestCount.keySet()) {

            System.out.println(key + " : " + requestCount.get(key));

        }

        scanner.close();
    }
}
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Problem1UsernameChecker {

    public static void main(String[] args) {

        System.out.println("Social Media Username Availability Checker");

        HashMap<String, Integer> usernameDatabase = new HashMap<>();
        HashMap<String, Integer> attemptFrequency = new HashMap<>();

        usernameDatabase.put("john_doe", 101);
        usernameDatabase.put("alice123", 102);
        usernameDatabase.put("admin", 103);
        usernameDatabase.put("shiv", 104);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username to check: ");
        String username = scanner.nextLine();

        attemptFrequency.put(username,
                attemptFrequency.getOrDefault(username, 0) + 1);

        if(usernameDatabase.containsKey(username)) {
            System.out.println("Username already taken.");
        }
        else {
            System.out.println("Username available!");
        }

        ArrayList<String> suggestions = new ArrayList<>();

        for(int i = 1; i <= 3; i++) {
            suggestions.add(username + i);
        }

        suggestions.add(username.replace("_","."));

        System.out.println("Suggested usernames: " + suggestions);

        String mostAttempted = "";
        int max = 0;

        for(String key : attemptFrequency.keySet()) {

            if(attemptFrequency.get(key) > max) {
                max = attemptFrequency.get(key);
                mostAttempted = key;
            }

        }

        System.out.println("Most attempted username: " + mostAttempted);

        scanner.close();
    }
}
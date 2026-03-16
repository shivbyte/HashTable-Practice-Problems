import java.util.HashMap;
import java.util.Scanner;

public class Problem7AutocompleteSystem {

    public static void main(String[] args) {

        System.out.println("Autocomplete Search System");

        HashMap<String, String> searchDatabase = new HashMap<>();

        searchDatabase.put("java", "Java Programming");
        searchDatabase.put("python", "Python Programming");
        searchDatabase.put("javascript", "JavaScript Programming");
        searchDatabase.put("database", "Database Management");
        searchDatabase.put("datastructure", "Data Structures");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter search prefix: ");
        String prefix = scanner.nextLine().toLowerCase();

        System.out.println("\nSuggestions:");

        boolean found = false;

        for(String key : searchDatabase.keySet()) {

            if(key.startsWith(prefix)) {
                System.out.println(searchDatabase.get(key));
                found = true;
            }

        }

        if(!found) {
            System.out.println("No suggestions found.");
        }

        scanner.close();
    }
}
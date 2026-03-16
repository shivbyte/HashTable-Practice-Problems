import java.util.HashMap;
import java.util.Scanner;

public class Problem5AnalyticsDashboard {

    public static void main(String[] args) {

        System.out.println("Analytics Dashboard - Word Frequency Counter");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        String[] words = text.toLowerCase().split("\\s+");

        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for(String word : words) {

            if(wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            }
            else {
                wordFrequency.put(word, 1);
            }

        }

        System.out.println("\nWord Frequency:");

        for(String key : wordFrequency.keySet()) {

            System.out.println(key + " : " + wordFrequency.get(key));

        }

        scanner.close();
    }
}
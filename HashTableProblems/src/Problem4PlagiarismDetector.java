import java.util.HashMap;
import java.util.Scanner;

public class Problem4PlagiarismDetector {

    public static void main(String[] args) {

        System.out.println("Plagiarism Detection System");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first text:");
        String text1 = scanner.nextLine();

        System.out.println("Enter second text:");
        String text2 = scanner.nextLine();

        String[] words1 = text1.toLowerCase().split("\\s+");
        String[] words2 = text2.toLowerCase().split("\\s+");

        HashMap<String, Integer> wordMap = new HashMap<>();

        for(String word : words1) {
            wordMap.put(word, 1);
        }

        int commonWords = 0;

        for(String word : words2) {

            if(wordMap.containsKey(word)) {
                commonWords++;
            }

        }

        int totalWords = Math.max(words1.length, words2.length);

        double similarity = ((double) commonWords / totalWords) * 100;

        System.out.println("Common Words: " + commonWords);
        System.out.println("Similarity Percentage: " + similarity + "%");

        if(similarity > 50) {
            System.out.println("Possible Plagiarism Detected!");
        }
        else {
            System.out.println("Texts are mostly different.");
        }

        scanner.close();
    }
}
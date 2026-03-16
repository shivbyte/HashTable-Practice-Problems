import java.util.HashMap;
import java.util.Scanner;

public class Problem3DNSCache {

    public static void main(String[] args) {

        System.out.println("DNS Cache System");

        HashMap<String, String> dnsCache = new HashMap<>();

        dnsCache.put("google.com", "142.250.190.78");
        dnsCache.put("youtube.com", "142.250.190.14");
        dnsCache.put("github.com", "140.82.113.3");
        dnsCache.put("stackoverflow.com", "151.101.65.69");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter domain name: ");
        String domain = scanner.nextLine();

        if(dnsCache.containsKey(domain)) {

            System.out.println("IP Address: " + dnsCache.get(domain));
            System.out.println("Result from DNS Cache");

        }
        else {

            System.out.println("Domain not found in cache.");
            System.out.println("Fetching from DNS server...");

        }

        System.out.println("\nCached Domains:");

        for(String key : dnsCache.keySet()) {

            System.out.println(key + " → " + dnsCache.get(key));

        }

        scanner.close();
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        // HashMap to store character frequency
        HashMap<Character, Integer> charFreq = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        // Priority queue to sort characters by frequency
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> charFreq.get(b) - charFreq.get(a));

        // Add characters to priority queue
        pq.addAll(charFreq.keySet());

        // Build sorted string
        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            int freq = charFreq.get(c);
            for (int i = 0; i < freq; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}

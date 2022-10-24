import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("apple", "orange", "strawberry", "apple", "banana", "strawberry"));

    public static void main(String[] args) {
        ex4();
    }

    public static void ex1(){
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + ", ");
            }
        }
    }

    public static void ex2(){
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;

        for (Integer num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.print(num + ", ");
                prevNum = num;
            }
        }
    }

    public static void ex3(){
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void ex4() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }
}
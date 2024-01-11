import java.util.*;

public class Main {
    private static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    public static void task1() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {

        Collections.sort(nums);
        int min = Integer.MIN_VALUE;

        for (Integer num : nums) {
            if (num % 2 != 0 && num != min) {
                System.out.println(num);
                min = num;
            }
        }

    }


    public static void task3() {

        Set<String> uniqueWords = new HashSet<>(strings);

        System.out.println(uniqueWords);
    }

    public static void task4() {
        for (String string : strings) {
            int count = Collections.frequency(strings, string);
            System.out.println(count);
        }
    }

}




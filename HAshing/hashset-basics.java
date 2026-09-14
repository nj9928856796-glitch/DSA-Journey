import java.util.HashSet;

public class HashSetBasics {
    public static void main(String[] args) {

        int[] nums = {10, 20, 10, 30, 20, 40};

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        System.out.println("Unique elements: " + set);
        System.out.println("Is 30 present? " + set.contains(30));

        set.remove(20);

        System.out.println("Is 20 present? " + set.contains(20));
        System.out.println("Final Set: " + set);
    }
}

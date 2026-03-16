import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};

        HashSet<Integer> set = new HashSet<>();

        // add all numbers to set
        for(int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for(int num : set) {

            // check if it is start of sequence
            if(!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                while(set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        System.out.println("Longest consecutive sequence length: " + longest);
    }
}

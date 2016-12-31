import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by spoonyforky on 30/12/16.
 */
public class bigDiff {
    /*Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8*/
    public int bigDiff(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] - nums[0];
        //or
         /*   int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max,nums[i]);
        }
        return max-min;
    }*/
    }
}

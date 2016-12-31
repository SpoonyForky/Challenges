/**
 * Created by spoonyforky on 30/12/16.
 */
public class twoTwo {
    /*Given an array of ints, return true if every 2 that appears in the array is next to another 2.\n"+
            "\n"+
            "twoTwo([4, 2, 2, 3]) → true\n"+
            "twoTwo([2, 2, 4]) → true\n"+
            "twoTwo([2, 2, 4, 2]) → false"
    */

    public boolean twoTwo(int[] nums){
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2){
                int[] subint = {nums[i-1],nums[i],nums[i+1]};
            }

        }

        return true;
    };
}

import java.util.Arrays;

public class LeetCodeMain {
    public static void main(String[]args){
        int[] array = {1,2,3,4,5};

        System.out.println(twoSum(array, 7));
    }
    public static String twoSum(int[] nums, int target) {
        int counter = 0;
        boolean targetTrue = false;
        int[] returnArray = {0,0};
        for (int x=0; x<nums.length; x++) {
            for (int y=x+1; y<nums.length; y++) {
                counter = nums[x]+nums[y];
                if (counter==target) {
                    returnArray[0] = x;
                    returnArray[1] = y;
                    targetTrue=true;
                    break;
                }
            }
            if (targetTrue == true) {
                break;
            }
        }
        return Arrays.toString(returnArray);
    }

}

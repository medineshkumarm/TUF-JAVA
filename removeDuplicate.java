import java.util.*;
class removeDuplicate {
    /**
     * Brute force: 
     * 1. Use Hashset
     * 2. Store the unique values
     * 3. then store it in the array (condition: Add ele in set if it is not present already)
     *  T.C = O(n)
     */
    public static int BruteremoveDuplicate(int[] arr){
        HashSet<Integer> set  = new HashSet<>();

        int i = 0;
        for(int val : arr){
            if(set.add(val)){
                  //set.add(val) : returns a boolean value ie. true/false
                  arr[i++] = val;
            }
        }
        return i;
    }

    /**
     * 
     */


    public static void main(String[] args) {
        int[] arr = {-3,-1,0,0,0,3,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(BruteremoveDuplicate(arr));
        System.out.println(Arrays.toString(arr));
        
    }
}

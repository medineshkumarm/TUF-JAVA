import java.util.Arrays;
class secondLargest {
    /**
     * brute-force:
     * 1. Sort the array
     * 2. check the next min val from max .ie. minval < arr[n-1]
     * T.C: worst case : O(nlogn + n)
     * 
     */

    public static int Brute2ndLargest(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int max = arr[n-1];
        int max2 = 0;
        for(int i = n-2;i>=0;i--){
            // if(arr[i] > max2 && arr[i] !=max ){
                if(arr[i] != max ){
                max2 = arr[i];
                break;
            }
        } 
        return max2;
    }

    /**
     * # Better approach
     * 1. Find max val in arr using for-loop
     * 2. Traverse the arr and find max2 but less than max
     * 3. return max2
     * T.c: O(n+n)--> O(2n)
     */

     public static int BetterSecondLargest(int[] arr){
        int max = 0, max2 = 0;
        
        for(int val: arr){
            if(val>max){
                max = val;
            }
        }
        for(int val: arr){
            if(val >max2 && val < max ){
                max2 = val;
            }
        }
        return max2;
     }

    /**
     *  optimal approach:
     * T.C = O(n)
     */
    public static int SecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int max2 = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] > max){
                max2 = max; //store the prev max in max2
                max = arr[i]; // update the max
                /**
                 * it checks if there exist a max val that is less than 2nd max
                 * And that value is not as same as max
                 */
            }else if(arr[i] > max2 && arr[i] != max){
                max2 = arr[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,7,7,1,2,0,3,-9,5};
        System.out.println(SecondLargest(arr));
    }
}

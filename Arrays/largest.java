import java.util.Arrays;
class largest{
    /*
     * brute force: sort the array 
     * return n-1 index
     * T.C = O(nlogn) 
     */
    public static int bruteGetLargest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length -1];

    }

    /**
     * Better/Best approach
     * T.C = O(n)
     */
    public static int getLargest(int[] arr){
        int max = arr[0];
        // use can start from arr[1] in for-loop
      
        /**
         * 
         for(int val:arr){
            if(val > max){
                //update max:
                max = val;
            }
        }
        */
        // or
        for(int i = 1; i < arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {1,5,4,2,1,4,7,2};

        System.out.println(getLargest(arr));

    }
}
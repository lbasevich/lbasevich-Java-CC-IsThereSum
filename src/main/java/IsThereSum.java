
public class IsThereSum {
    /**
     * Check if there exist two numbers in an array add up to some other number.
     * You will likely need a for loop nested inside of another for loop for this problem - each for loop checking
     * sums of two different indexes of arr.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean check(int[] arr, int target){

        for (int i = 0; i < arr.length; i++){
            int test1 = arr[i];
            for (int j = i+1; j<arr.length; j++){
                int test2 = arr[j];
                if (test1+test2 == target)
                    return true;
            }
        }
        return false;

    }
}

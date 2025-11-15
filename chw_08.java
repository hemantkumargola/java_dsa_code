//  Calculate the sum of all the elements in the given
// array.


public class chw_08 {
    public static void main(String[] args) {

        int[] arr = {5, 10, 20, 7};  
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}

public class chw_405 {

    public static void main(String[] args) {

        String[] arr = {"banana", "apple", "mango", "kiwi"};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (String x : arr) System.out.print(x + " ");
    }
}

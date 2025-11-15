// Q1 : Given an array of marks of students, if the mark of any
// student is less than 35 print its roll number. [roll number
// here refers to the index of the array.

public class chw_07 {
    public static void main(String[] args) {

        int[] marks = {55, 12, 40, 30, 90, 25, 48};

        System.out.println("Students with marks < 35:");

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                System.out.println("Roll Number: " + i + ", Mark: " + marks[i]);
            }
        }
    }
}

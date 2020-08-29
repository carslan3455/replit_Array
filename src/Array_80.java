import java.util.Scanner;

public class Array_80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        //leave above alone!  write your code below
        for (int i = 4; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
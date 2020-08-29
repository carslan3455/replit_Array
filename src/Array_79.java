import java.util.Arrays;
import java.util.Scanner;

public class Array_79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextInt();
        }
        //leave above alone!  write your code below
        System.out.print("{");
        for (int i=0;i<5;i++){
            if (i!=arr.length-1)
            System.out.print(arr[i]+",");
            else System.out.print(arr[i]);
        }
        System.out.print("}");
    }
}

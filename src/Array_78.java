import java.util.Scanner;

public class Array_78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextInt();
        }
        //leave above alone!  write your code below

        for(int a : arr){
            System.out.println(a*10);
        }

        /*  2.Yöntem
        for (int i=0;i<5;i++){
            System.out.println(arr[i]*10) ;
        }
         */


    }
}
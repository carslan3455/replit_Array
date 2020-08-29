import java.util.Scanner;

public class Array_76 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        int input=in.nextInt();
        String str []=new String[input];

        for(int i=0; i<input; i++){
            String name = st.nextLine();
            str[i]=name.trim();

        }
        for(int i=0; i<input; i++){

            System.out.print(str[i].charAt(0));
        }
    }
}

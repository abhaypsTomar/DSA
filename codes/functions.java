import java.util.*;

public class functions {
    public static void main (String args[]) {
        int a = sum2();
        System.out.println(a);
    }


        static int sum2 (){


            Scanner in = new Scanner(System.in);
            // int a,b; can also be done like this
            int a = in.nextInt();
            int b = in.nextInt();
            int sum = a + b;
            return  sum;

        }


}

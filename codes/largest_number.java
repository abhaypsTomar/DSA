import java.util.*;
public class largest_number {
    public static void main(String[] args) {

        System.out.println("Largest number");
        Scanner val = new Scanner(System.in);

        int a= val.nextInt();
        int b= val.nextInt();
        int c= val.nextInt();

        if (a>b){
            System.out.println(a+" is largest");
        } else if(b>c){
            System.out.println(b + "is largest");
        } else if (c>a){
            System.out.println(c + "is largest");

        }
        else{
            System.out.println("INVALID");

        }






    }
}
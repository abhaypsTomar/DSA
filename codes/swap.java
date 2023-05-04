import java .util.Scanner;
public class swap {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a,b,temp;
        a=in.nextInt();
        b=in.nextInt();
        swap(a,b);


    }
    static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a + "" +b);

    }
}

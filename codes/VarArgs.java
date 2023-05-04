import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args){
        fun(1,2,2,3,1,56,1,1,651);
        many(1,2,'a','m');

    }
    static void many(int a, int b , char ...v){
    }
    static void fun( int ...v){
        System.out.println(Arrays.toString(v));
    }
}

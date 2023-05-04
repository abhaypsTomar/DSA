import java.util.Scanner;
public class string_search {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String str = in.next();
        char target = 'm';
        System.out.println(find(str,target));
    }
    static String find(String str,char target){
        if (str.length()==0){
            return "INVALID";
        }
        for(char chr :str.toCharArray()){
            if(chr==target){
                return "I LOVE YOU";
            }
        }
//        for(int i=0;i<str.length();i++){
//            int element = str.charAt(i);
//            if(element==target){
//                return "I LOVE YOU";
//            }
//        }
        return "not found";
    }

}

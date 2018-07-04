import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.println("  "+dup(str,0));
    }

    public static String dup(String str,int start){
        if(start == str.length()){
            StringBuilder builder = new StringBuilder();
            builder.append(str.charAt(str.length() - 1));
            return builder.toString();
        }
        StringBuilder builder = new StringBuilder();
        String st = dup(str,start+1);
        builder.append(st);
        if(start == 0)
            return builder.reverse().toString();
        if(str.charAt(start - 1) == str.charAt(start)){
            builder.append('*');
            builder.append(str.charAt(start));
        }
        else
        {
            builder.append(str.charAt(start - 1));
        }
        return builder.toString();
    }
}

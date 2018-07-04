import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        if(palin(str,0,str.length() - 1))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }

    public static boolean palin(String str,int start,int end){
        if(start >= end)
            return true;
        else
            return str.charAt(start) == str.charAt(end) && palin(str,++start,--end);
    }
}

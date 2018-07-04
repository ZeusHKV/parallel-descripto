import java.awt.*;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String str1 = sc.next();
        System.out.print("Enter the first string : ");
        String str2 = sc.next();
        if(checkRev(str1,str2,0,str2.length() - 1))
            System.out.println("Given two strings are reverse of each other.");
        else
            System.out.println("Given two strings are not reverse of each other.");
    }

    public static boolean checkRev(String str1,String str2,int start1,int end2){
        if(str1.length() != str2.length())
            return false;

        if(start1 == str1.length()  && end2 == -1)
            return true;
        else
            return str1.charAt(start1) == str2.charAt(end2) && checkRev(str1,str2,++start1,--end2);
    }
}

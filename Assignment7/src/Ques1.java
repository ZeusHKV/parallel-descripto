import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. :");
        String str = sc.next();
        System.out.print("Sum of digits : " + sum(str, 0));
    }

    public static int sum(String str, int start) {
        if (start == str.length())
            return 0;
        int s = (int) str.charAt(start) - 48 + sum(str, ++start);
        return s;
    }
}

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        String str = sc.next();
        System.out.print("No. in integer form : " + convert(str, str.length() - 1, 1));
    }

    public static int convert(String str, int end, int m) {
        if (end == 0)
            return ((int) str.charAt(0) - 48) * m;

        int s = (str.charAt(end) - 48) * m + convert(str, --end, m * 10);
        return s;
    }
}

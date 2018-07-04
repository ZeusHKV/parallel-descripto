import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.println("  "+moveEnd(str,0,0));
    }

    public static String moveEnd(String str,int start,int x){
        StringBuilder builder = new StringBuilder();
        if(start == str.length()){
            for (int i = 0; i < x; i++) {
                builder.append("x");
            }
            return builder.toString();
        }
        if(str.charAt(start) == 'x' && str.charAt(start + 1) != 'x'){
            builder.append(str.charAt(start+1));
            builder.append(moveEnd(str,start+2,++x));
        }
        else
            builder.append(moveEnd(str,start+1,x));

        return builder.toString();
    }

}

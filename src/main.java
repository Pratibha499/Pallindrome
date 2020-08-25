import java.util.Scanner;

public class main {
    /*package whatever //do not write package name here */
    public static void main (String[] args) {
            //code
            String str, rev = "";
            Scanner sc = new Scanner(System.in);


            str = sc.nextLine();

            int length = str.length();

            for ( int i = length - 1; i >= 0; i-- )
                rev = rev + str.charAt(i);

            if (str.equals(rev))
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }




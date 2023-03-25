import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFileEasy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 1;
        while (input.hasNext()){
            System.out.println(n++  +" "+input.nextLine());

        }
        input.close();

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
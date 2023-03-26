import java.util.*;

public class JavaIntToString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        in.close();


        String s  = String.valueOf(n);

        if (n >= -100 && n <= 100){
            if (s.equals(String.valueOf(n))){
                System.out.println("Good Job");
            }else {
                System.out.println("Wrong answer");
            }else{
                System.out.println("Wrong answer");
            }
        }
    }
}

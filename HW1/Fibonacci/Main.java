import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your number: ");
        int x = scanner.nextInt();
        int i = 0;
        int n1 = 0;
        int n2 = 0;
        int s = 0;
        if (x==0) {
            i = 0;
            System.out.println(i);
        } else if (x==1 || x==2) {
            i = 1;
            System.out.println(i);
        } else {
            for (i = 2; i < x; i++) {
                if (i == 2) {
                    n1 = 1;
                    n2 = 1;
                }
                s = n2;
                n2 = n1 + n2;
                n1 = s;
            }
            System.out.println(n2);
        }
    }
}
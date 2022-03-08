import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your number, which will be divided: ");
        int n1 = scanner.nextInt();
        System.out.println("Type your number, which the first will be divided by: ");
        int n2 = scanner.nextInt();
        if (n2==0) {
            System.out.println("Infinity");
        } else if (n1==0) {
            System.out.println("That's 0");
        } else {
            int integer = n1 / n2;
            int remainder = n1 - (n2 * integer);
            System.out.println("Integer is: "+integer);
            System.out.println("Remainder is: "+remainder);
        }
    }
}
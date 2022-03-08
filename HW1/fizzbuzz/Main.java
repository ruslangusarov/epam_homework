import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your number: ");
        int x = scanner.nextInt();
        if (x - (x / 3) * 3 == 0) System.out.print("fizz");
        if (x - (x / 5) * 5 == 0) System.out.print("buzz");
    }
}
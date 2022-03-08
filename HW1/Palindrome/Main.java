import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        boolean pal = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your number: ");
        int x = scanner.nextInt();
        if (x<10 && x>=0) {
            pal = true;
        } else {
            if (x >= 0) {
                String str = Integer.toString(x);
                char[] number = str.toCharArray();
                for (int i = 0; i < str.length() / 2; i++)
                    if (number[i] != number[str.length() - 1 - i]) {
                        pal = false;
                        break;
                    } else {
                        pal = true;
                    }
            } else {
                pal = false;
            }
        }
        System.out.println(pal);;
    }
}
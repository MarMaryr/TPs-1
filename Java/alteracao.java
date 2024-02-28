import java.util.Random;
import java.util.Scanner;

public class alteracao {
    public static void main (String[] args) {
        Random gerator = new Random();
        gerator.setSeed(4);
        System.out.println((char)'a' + (Math.abs(gerator.nextInt())%26));
        Scanner scan = new Scanner (System.in);
        String str = scan.nextLine();

    }
}

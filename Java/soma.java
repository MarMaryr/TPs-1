import java.util.Scanner;
public class soma {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num = scan.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = scan.nextInt();
        int result = 0;
        result = num+num2;
        System.out.println(result);
    }
}

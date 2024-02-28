import java.util.Scanner;

public class cesarrec {
    
    public static String encryptString(String str, int num) {
        if (str.isEmpty()) {
            return " ";
        } else {
            char currentChar = str.charAt(0);
            String encryptedRest = encryptString(str.substring(1), num);

            if (currentChar >= 'A' && currentChar <= 'Z') {
                return (char) (currentChar + num) + encryptedRest;
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                return (char) (currentChar + num) + encryptedRest;
            } else {
                return currentChar + encryptedRest;
            }
        }
    }
    public static void main(String[] args) {
        while (true) {
        Scanner scanint = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        // Digite um numero
        int num = scanint.nextInt();

        // Digite uma string pra ser codificada
        String str = scan.nextLine();
        if (str.equals("FIM")) {
            break;
          }
        String result = encryptString(str, num);

        System.out.println(result);
    }
}
}

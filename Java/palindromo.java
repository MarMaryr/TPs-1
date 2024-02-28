import java.util.Scanner;

public class palindromo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while (true) {
      String str = scan.nextLine();
      if (str.equalsIgnoreCase("FIM")) {
        break;
      }
      String palavra = str.replaceAll("[^a-zA-Z0-9]", "");
      String rev = new StringBuilder(palavra).reverse().toString();
      if (palavra.equals(rev)) {
        System.out.println("SIM");
      } else {
        System.out.println("NAO");
      }
    }
    scan.close();
  }
}

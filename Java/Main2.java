import java.util.Scanner;
public class Main2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while (true) {
      // digitar
      String str = scan.nextLine();
      int tam = str.length();
      int cont = 0;
      if (str.equals("FIM")) {
        break;
      }
      for (int i = 0; i < tam; i++) {
        if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
          cont++;
        }
      }
      System.out.println(cont);
    }
    scan.close();
  }
}
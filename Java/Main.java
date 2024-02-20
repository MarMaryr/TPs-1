import java.util.Scanner;
public class Main {
  public static int calc (int i, int p, String str) {
    int cont = 0;
    if (p < i) {
      if (str.charAt(p) >= 'A' && str.charAt(p) <= 'Z') {
        cont++;
      }
      cont += calc(i, p+1, str);
    }
    return cont;
  }
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
    cont = calc(tam, 0, str);
      System.out.println(cont);
    }
    scan.close();
  }
}
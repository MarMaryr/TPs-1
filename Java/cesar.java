import java.util.Scanner;
public class cesar {
    public static void main (String[] args) {
        Scanner scanint = new Scanner (System.in);
        Scanner scan = new Scanner(System.in);
        //digite um numero 
        int num = scanint.nextInt();
        //digite uma string pra ser codificada
        String str = scan.nextLine();
        int tam = str.length();
        String vaz = " ";
        for (int i = 0; i < tam; i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') { 
            vaz += (char) (str.charAt(i) + num); 
        } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
            vaz += (char) (str.charAt(i) + num); 
        }
        }
        System.out.println(vaz);
        }
    }
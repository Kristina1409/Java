import javax.swing.*;
import java.util.*;
public class OsmiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String broj;
        while (true) {
            System.out.println("Unesite broj telefona, za prekid unesite stop:");
            broj = sc.nextLine();
            if (broj.equalsIgnoreCase("stop")) {
                System.out.println("Izabrali ste prekid.");
                break;
            }

            char[] niz = broj.toCharArray();

            if (niz[0] == '(' &&
                    niz[1] >= '0' && niz[1] <= '9' &&
                    niz[2] >= '0' && niz[2] <= '9' &&
                    niz[3] >= '0' && niz[3] <= '9' &&
                    niz[4] == ')' &&
                    niz[5] == ' ' &&
                    niz[6] >= '0' && niz[6] <= '9' &&
                    niz[7] >= '0' && niz[7] <= '9' &&
                    niz[8] >= '0' && niz[8] <= '9' &&
                    niz[9] == '-' &&
                    niz[10] >= '0' && niz[10] <= '9' &&
                    niz[11] >= '0' && niz[11] <= '9' &&
                    niz[12] >= '0' && niz[12] <= '9' &&
                    niz[13] >= '0' && niz[13] <= '9') {
                System.out.println("Broj je napisan u odgovarajucem formatu");
            } else if (
                    niz[0] >= '0' && niz[0] <= '9' &&
                            niz[1] >= '0' && niz[1] <= '9' &&
                            niz[2] >= '0' && niz[2] <= '9' &&
                            niz[3] == '-' &&
                            niz[4] >= '0' && niz[4] <= '9' &&
                            niz[5] >= '0' && niz[5] <= '9' &&
                            niz[6] >= '0' && niz[6] <= '9' &&
                            niz[7] == '-' &&
                            niz[8] >= '0' && niz[8] <= '9' &&
                            niz[9] >= '0' && niz[9] <= '9' &&
                            niz[10] >= '0' && niz[10] <= '9' &&
                            niz[11] >= '0' && niz[11] <= '9') {
                System.out.println("Broj je napisan u odgovarajucem formatu");
            } else
                System.out.println("Broj nije napisan u odgovarajucem formatu");

            }
        }
    }



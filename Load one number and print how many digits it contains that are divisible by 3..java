import java.util.*;
public class PrviZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int broj, x, brojac = 0;
        String izbor;
        while (true) {
            System.out.println("Unesite zeljeni broj.");
            broj = sc.nextInt();

            while (broj != 0) {
                x = broj % 10;
                if (x % 3 == 0) {
                    brojac++;
                }
                broj = broj / 10;
            }
            System.out.println("Ovaj broj sadrzi " + brojac + " cifre koji su deljive sa 3.");

            do {System.out.println("Ako zelite da uneste jos jedan broj upisite da, ukoliko ne zelite upisite ne");
                izbor = sc.next();
                if (!izbor.equalsIgnoreCase("ne") && (!izbor.equalsIgnoreCase("da"))) {
                    System.out.println("Niste uneli odgovarajuc odgovor, molim Vas upisite da ukoliko zelite da nastavite odnosno ne ukoliko zelite da zavrstie");
                }
            } while(!izbor.equalsIgnoreCase("da") && (!izbor.equalsIgnoreCase("ne")));

            if (izbor.equalsIgnoreCase("ne")) {
                System.out.println("Hvala sto ste koristili moj program.");
                break;
            }
        }
    }
}

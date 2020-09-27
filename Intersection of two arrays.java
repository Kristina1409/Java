import java.util.*;
public class CetvrtiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int k = 0;//brojac za novi niz
        do {
            System.out.println("Unesite dimenziju prvog niza");
            a = sc.nextInt();
            if (a < 0) {
                System.out.println("Ne mozete uneti negativan broj");
            }
        } while (a < 0);
        String[] niz1 = new String[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Upisite " + (i + 1) + " element prvog niza");
            niz1[i] = sc.next();
        }
        do {
            System.out.println("Unesite dimenziju drugog niza");
            b = sc.nextInt();
            if (b < 0) {
                System.out.println("Ne mozete uneti negativan broj");
            }
        } while (b < 0);
        String[] niz2 = new String[b];
        for (int i = 0; i < b; i++) {
            System.out.println("Upisite " + (i + 1) + " element drugog niza");
            niz2[i] = sc.next();
        }
        if (a >= b) {
            c = b;
        } else {
            c = a;
        }
        String[] niz3 = new String[c];
        for (int i = 0; i<a; i++) {
            for(int j=0; j<b ;j++){
                if(niz1[i].equals(niz2[j])){
                    niz3[k]=niz1[i];
                    k++;
                }
            }
        }
        for(int i=0;i< niz3.length;i++){
            System.out.println((i+1)+". element treceg niza je "+niz3[i]);

        if(niz3[i+1]==null);
        break;
    }
}
}
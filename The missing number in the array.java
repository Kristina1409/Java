import java.util.Scanner;
public class JedanaestiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dimenziju niza:");
        int x=sc.nextInt();
        int[] niz1 = new int[x];
        int zbir=0;
        for (int i = 0; i < niz1.length+1; i++) {
            zbir=zbir+i;
        }

        for (int i = 0; i < niz1.length; i++) {
            System.out.println("Upisite " + (i + 1) + " element prvog niza");
            niz1[i] = sc.nextInt();
        }

        for(int i=0; i<niz1.length;i++){
            zbir=zbir-niz1[i];
        }
        System.out.println("Broj koji nedostaje je "+zbir);
    }
}
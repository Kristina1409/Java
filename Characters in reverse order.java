import java.util.*;
public class SedmiZadatak {
    public static void  main (String []args)
    {
        Scanner sc = new Scanner(System.in);

        char pom;
        int x;//dimenzija niza
        // DO WHILE omogucava ispravan unos dimenzije niza
        do {
            System.out.println("Unesite dimenziju niza:");
           x = sc.nextInt();
            if (x < 0)
                System.out.println("Pogresan unos, negativan broj. Ponovite!");
        } while (x < 0);
        char []niz=new char[x];
        char []niz_pocetni = new char[x];
        System.out.println("Unesite karaktere koje zelite da invertujete");
        for (int i = 0; i < x; i++)
        {
            System.out.println("Unesite "+(i+1)+". element niza:");
            niz[i]=sc.next().charAt(0);
        }
        niz_pocetni=niz.clone();

        for(int i = 0, j = niz.length-1; i < (niz.length/2); i++, j--)
        {
            pom = niz[i];
            niz[i] = niz[j];
            niz[j] = pom;
        }

        System.out.println("Pocetni niz je: ");
        for (int i=0; i<x; i++)
        {
            System.out.print(niz_pocetni[i]);
        }

        System.out.println("");
        System.out.println("Obrnuti niz je: ");
        for (int i=0; i<x; i++)
        {
            System.out.print(niz[i]);
        }
    }
}


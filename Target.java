import java.util.*;
public class SestiZadatak {
    public static void  main (String args[]) {
    int meta;
    int prviSabirak=0, drugiSabirak=0;
    int prekid=0;
    int x;//dimenzija niza
    Scanner sc = new Scanner(System.in);
    System.out.println("Unesite Metu:");
    meta = sc.nextInt();

    do {
        System.out.println("Unesite dimenziju niza:");
        x = sc.nextInt();
        if (x < 0)
            System.out.println("Ne mozete da uneste negativan broj,pokusajte ponovo");
    } while (x < 0);
    int[] niz = new int[x];

    for (int i = 0; i < x; i++) {
        System.out.println("Unesite "+(i+1)+". element niza:");
        niz[i]=sc.nextInt();
    }

    for (int i=0; i<x-1; i++) {
        if (prekid==1)
            break;
        for (int j=i+1; j<x; j++)
        {
            if(niz[i]+niz[j]==meta)
            {
                prviSabirak=i;
                drugiSabirak=j;
                prekid=1;
                break;
            }
        }
    }
        if(prekid==1)
        System.out.println("Cestitamo,pogodili ste metu,brojevi koji daju rezultat mete nalaze se na mestu "+prviSabirak+" i "+drugiSabirak+".");
        else
            System.out.println("Nazalost niste pogodili metu, vise srece sledeci put");
}
}


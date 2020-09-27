import java.util.*;
public class DevetiZadatak {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite dimenziju niza:");
        int n=sc.nextInt(); int count=0;
        int []niz1=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Upisite " + (i + 1) + " element prvog niza");
            niz1[i] = sc.nextInt();
        }
        /*for (int i = 0; i < niz1.length; i++)
            if (niz1[i] > 0)
                System.out.println(i +". element niza je: "  + niz1[i]);

        for (int i = 0; i < niz1.length; i++)
            if (niz1[i] == 0)
                System.out.println(i +". element niza je: " + niz1[i]);

         */
        for (int i = 0; i < n; i++)
            if (niz1[i] != 0)
                niz1[count++] = niz1[i];

        while (count < n)
            niz1[count++] = 0;

        for (int i=0; i<n; i++)
            System.out.print(niz1[i]+" ");
    }
}

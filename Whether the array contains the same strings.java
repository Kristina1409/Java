import java.util.*;
public class DesetiZadatak {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite dimenziju niza:");
        int n=sc.nextInt(); // dimenzija niza
        String[]niz=new String[n];
        int brojac=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Upisite " + (i + 1) + " element prvog niza");
            niz[i] = sc.next();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(niz[i].equals(niz[j])){
                    brojac++;
                }
            }
        }
        if(brojac>0)
            System.out.println("Niz sadrzi iste stringove");
        else
            System.out.println("Niz ne sadrzi iste stringove");
    }
}

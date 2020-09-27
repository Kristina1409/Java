/*Zadatak 1:
-Napisati program koji učitava jedan broj koji predstavlja koliko ljudi će nakon toga uneti podatke
o broju dece koju imaju.
-Nakon što se broj ljudi učita, učitavaju se podaci o broju dece.
-Nakon toga, ispisati koji procenat ljudi ima više od dvoje dece.

Na primer, ukoliko se unese broj 4, a zatim brojevi 1, 3, 2 i 4 program treba da ispiše poruku da 50% ljudi ima preko dvoje dece.
*/
import java.util.*;
public class Zadatak1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int brojDece;
        float brojLjudi, brojac=0;

        do {
            System.out.println("Upisite broj ljudi:");
            brojLjudi=sc.nextInt();
            if(brojLjudi<1){
                System.out.println("Broj ljudi ne moze biti 0 ili manje od 0.");
            }
        }
        while(brojLjudi<1);
        for(int i=0; i<brojLjudi; i++) {
            do {
                System.out.println("Upisite broj dece:");
                brojDece = sc.nextInt();
                if(brojDece<0){
                    System.out.println("Broj dece ne moze biti manje od 0.");
                }
            }
            while(brojDece<0);
            if(brojDece>2){
                brojac++;
            }
        }
        System.out.println("Procenat ljudi koji imaju vise od dvoje dece je: " +brojac/brojLjudi*100+" %");
    }
}

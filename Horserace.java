/*Zadatak 2:
- U trci učestvuje 4 trkača. Posmatrajmo trenutak u kome najsporiji zaostaje 6 krugova do kraja trke,
 dva srednja 5 krugova i najbrži samo 4 kruga. 
-Svaki put kad obrnu krug, program treba da ispiše koliko je krugova ostalo kom atletičaru do cilja. 
Program dobija informaciju o tome koji je igrač istrčao krug tako što se unosi njegov redni broj.
-Program se završava kada svi trkači završe trku.

Primer: 
Kada se program pokrene i korisnik unese broj 1 treba ispisati informaciju o tome da je prvom atleticaru ostalo 
5 krugova do kraja, drugom i trecem 5 a cetvrtom 4 kruga. 

Nakon toga, ako korisnik unese broj 4 treba ispisati da je prvom, drugom, trecem ostalo 5 krugova, 
a cetvrtom 3 kruga…. 
*/


import java.util.*;
public class Zadatak2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int prviTrkac=6,drugiTrkac=5,treciTrkac=5,cetvrtiTrkac=4, opcija = 0;
        //pocetno stanje
        System.out.println("Trkac pod rednim brojem 1 se nalazi na 6 krugova do kraja trke.");
        System.out.println("Trkac pod rednim brojem 2 se nalazi na 5 krugova do kraja trke.");
        System.out.println("Trkac pod rednim brojem 3 se nalazi na 5 krugova do kraja trke.");
        System.out.println("Trkac pod rednim brojem 4 se nalazi na 4 kruga do kraja trke.");
        
        while(prviTrkac>0 || drugiTrkac>0 || treciTrkac>0 || cetvrtiTrkac>0) {
            System.out.println("Unesite redni broj trkaca koji je zavrsio krug");
            opcija=sc.nextInt();
            switch(opcija){
                case 1:
                    if(prviTrkac>0){
                        prviTrkac-=1;
                    }else
                        System.out.println("Trkac je vec zavrsio trku");
                    break;
                case 2:
                    if(drugiTrkac>0){
                        drugiTrkac-=1;
                    }else
                        System.out.println("Trkac je vec zavrsio trku");
                    break;
                case 3:
                    if(treciTrkac>0){
                        treciTrkac-=1;
                    }else
                        System.out.println("Trkac je vec zavrsio trku");
                    break;
                case 4:
                    if(cetvrtiTrkac>0){
                        cetvrtiTrkac-=1;
                    }else
                        System.out.println("Trkac je vec zavrsio trku");
                    break;
                default:
                    System.out.println("Izabrali ste nepostojeceg trkaca");
                    break;
            }
            System.out.println("Trkacu pod rednim brojem 1 preostalo je: "+prviTrkac+" krugova do kraja");
            System.out.println("Trkacu pod rednim brojem 2 preostalo je: "+drugiTrkac+" krugova do kraja");
            System.out.println("Trkacu pod rednim brojem 3 preostalo je: "+treciTrkac+" krugova do kraja");
            System.out.println("Trkacu pod rednim brojem 4 preostalo je: "+cetvrtiTrkac+" krugova do kraja");
        }
    }
}

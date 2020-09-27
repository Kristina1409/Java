import java.util.*;
public class TreciZadatak {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int broj;
        System.out.println("Unesite broj za koji zelite da odredite da li je stepen broja 3:");
        broj=sc.nextInt();

        while(broj%3==0){
            broj/=3;
        }
        if (broj==-1 || broj==1){
            System.out.println("Ovaj broj jeste stepen broja 3.");
        }
        else
            System.out.println("Ovaj broj nije stepen broja 3.");
    }
}

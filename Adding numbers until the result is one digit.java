import java.util.*;
public class DrugiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int broj, zbir=0;


        do {
            System.out.println("Upisite zeljeni nenegativan broj:");
            broj = sc.nextInt();
            if (broj < 0) {
                System.out.println("Pogresan broj!");
            }
        } while (broj < 0);

        while (broj > 0 || zbir>=10) {
            if(broj==0){
                broj=zbir;
                zbir=0;
            }
            zbir += broj%10;
            broj/= 10;
        }
        System.out.println("Zbir cifara zadatog broja je " + zbir);
    }
}

package Test2;

import java.sql.SQLOutput;

public class GlavniProgram {
    public static void main(String[]args){
        Osoba o1 = new Osoba("Petar","Petrovic",1992,"1234567890123");
        Osoba o2 = new Osoba("Kristina","Tomic",1995,"2334545667688");
        Osoba o3 = new Osoba("Lana","Tomic",2000,"12345678911111"/*test*/);
        PlaninarskoDrustvo pdrustvo1=new PlaninarskoDrustvo("Celik");
        Planinar p1=PlaninarskoDrustvo.registruj(o1,"p123456");
        Planinar p2=PlaninarskoDrustvo.registruj(o2,"12345678");//test
        Planinar p3=PlaninarskoDrustvo.registruj(o3,"7654321");

        pdrustvo1.oPlaninarskomDrustvu(pdrustvo1);
        System.out.println(p1.toString());
        System.out.println(o1.toString());
        System.out.println(o2.toString());


    }
}

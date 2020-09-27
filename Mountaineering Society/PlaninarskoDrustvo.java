package Test2;
import java.util.*;
/*Planinarsko drustvo poseduje naziv, i spisak planinara. Spisak planinara je inicijalno prazan i
planinar moze da se doda ili ukloni sa spiska. Ove akcije ralizovati kao 2 zasebne metode(dodaj, ukloni).
Naziv se zadaje prilikom kreiranja i moguce ga i dohvatiti i postaviti. Moze da se dohvati broj planinara
 registrovanih u drustvu. Planinarsko drustvo je zaduzeno za kreiranje planinara, to jest, poseduje metodu
 registruj(Osoba o, String brojDozvole), koja osobu o registruje kao planinara u svom drustvu, sa brojemDozvole
  brojDozvole. Novoregistrovanog planinara dodaje u spisak planinara i vraca referncu na tog planinara.
  Primer poziva metode registruj:
  [NazivDrustva]{BrojPlaninara}
Planinar1
Planinar2*/
public class PlaninarskoDrustvo {
    private String nazivPlanDr;
    private static ArrayList<Planinar>spisakPlaninara = new ArrayList<>();

    public PlaninarskoDrustvo(String nazivPlanDr) {
        this.nazivPlanDr = nazivPlanDr; // 5p
    }

    public String getNazivPlanDr() {
        return nazivPlanDr;
    }

    public void setNazivPlanDr(String nazivPlanDr) {
        this.nazivPlanDr = nazivPlanDr;//5
    }

    public void dodajPlaninara(Planinar p){
       spisakPlaninara.add(p);//2
    }
    public void ukloniPlaninara(Planinar p){
        spisakPlaninara.remove(p);//2
    }
    public static Planinar registruj(Osoba o,String brPlaninarskeDoz){
        Planinar p=new Planinar(o.getIme(),o.getPrezime(),o.getGodRodjenja(),o.getJmbg(),brPlaninarskeDoz);
        spisakPlaninara.add(p);
        return p;
    }// 10p
    public int brPlaninara(){
        return spisakPlaninara.size();
    }//1
    public void oPlaninarskomDrustvu(PlaninarskoDrustvo pdrustvo1){// 5p
        System.out.println("["+getNazivPlanDr()+"] {"+pdrustvo1.brPlaninara()+"}");
        if(pdrustvo1.brPlaninara()>0){
            for(int i=0;i<spisakPlaninara.size();i++){
                System.out.println(spisakPlaninara.get(i).getIme()+" "+spisakPlaninara.get(i).getPrezime());
            }
        }else
            System.out.println("U drustvu nema registrovanih planinara");
    }
}// 30/35

// 95

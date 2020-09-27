package Test2;
/*Planinar je osoba koja poseduje broj planinarske dozvole, broj planinarske dozvole mora da ima tacno 7 karaktera.
 Broj planinarske dozvole se postavlja prilikom kreiranja i moze se samo dohvatiti.
 Ukoliko se stavi nedozvoljena vrednost, postaviti broj planinarske dozvole na "0000000".
Klasa Planinar poseduje staticku metodu kreiraj(Osoba o, String brojDozvole) koja prima kao argument
 objekat tipa Osoba a vraca objekat tipa Planinar. Metoda kreiraj za poslatu osobu kreira planinara
 i vraca objekat, to jest uzima informacije iz objekta tipa Osoba i kreira objekat tipa Planinar.
 (Prisetiti se sa predavanja klase Banka i otvaranja racuna);
Primer poziva metode kreiraj:
Osoba o1 = new Osoba("Petar","Petrovic",1992,"1234567890123");
Planinar p1 = Planinar.kreiraj(o1,"1234567");
Planinar moze da se ispise u sledecem obliku:
[Ime Prezime]{GodinaRodjenja}<JMBG> - BrojDozvole*/
public class Planinar extends Osoba{// 5p
    private String brPlaninarskeDoz;// 5p

    public Planinar(String ime, String prezime, int godRodjenja, String jmbg, String brPlaninarskeDoz) {
        super(ime, prezime, godRodjenja, jmbg);
        this.brPlaninarskeDoz = brPlaninarskeDoz;
    if(brPlaninarskeDoz.length()==7){// 10p
            this.brPlaninarskeDoz=brPlaninarskeDoz;
        }else this.brPlaninarskeDoz="0000000";
    }

    public String getBrPaninarskeDoz() {
        return brPlaninarskeDoz;
    }//5p
    public static Planinar kreiraj(Osoba o, String brPlaninarskeDoz){
     Planinar p=new Planinar(o.getIme(),o.getPrezime(),o.getGodRodjenja(),o.getJmbg(),brPlaninarskeDoz);
     return p;// 10p
    }
    @Override
    public String toString(){
        return "["+getIme()+" "+getPrezime()+"] {"+getGodRodjenja()+"} <"+getJmbg()+"> "+"- "+getBrPaninarskeDoz();
    }// 5p
}
//40/40
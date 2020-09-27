package Test2;
/*Osoba poseduje Ime, Prezime, godinu rodjenja i JMBG. Ime, prezime, godina rodjenja i
JMBG se zadaju prilikom kreiranja.Ime
i prezime mogu da se dohvate i naknadno postave. Godina rodjenja i JMBG mogu samo da se dohvate.
 Izvrsiti proveru ispravnosti JMBG-a, to jest JMBG mora da ima tacno 13 karaktera.
  Ukoliko JMBG format nije ispravan za JMBG staviti
"0000000000000".
Osobu je moguce ispisati u sledecem obliku:
[Ime Prezime]{GodinaRodjenja}<JMBG>*/
public class Osoba {
    private String ime;
    private String prezime;
    private int godRodjenja;
    private String jmbg;// 5 p

    public Osoba(String ime, String prezime, int godRodjenja, String jmbg) {
        this.ime = ime;
        this.prezime = prezime;
        this.godRodjenja = godRodjenja;
        if(jmbg.length()==13){// 10p
            this.jmbg=jmbg;
        }else {
            System.out.println("Pogresan unos!");

            this.jmbg = "0000000000000";
        }
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;//5p
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public String getJmbg() {
        return jmbg;
    }
    @Override
    public String toString(){
        return "["+getIme()+" "+getPrezime()+"] {"+getGodRodjenja()+"} <"+getJmbg()+">";
    }//5p
}// 25/25p

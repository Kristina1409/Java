package rs.itbootcamp.ordinacija;
/*
# Zaposleni
        Zaposleni je `Osoba` koja poseduje i stepen strucne spreme
        Stepen strucne spreme moze da se dohvati i postavi
*/

public class Zaposleni extends Osoba{
    private String SSS;

    public Zaposleni(String naziv, String JMBG, int godinaRodjenja) {
        super(naziv, JMBG, godinaRodjenja);
    }

    public String getSSS() {
        return SSS;
    }

    public void setSSS(String SSS) {
        this.SSS = SSS;
    }


    //Ispis: Zaposleni [OSOBA] : SSS
    @Override
    public String toString() {
        return "Zaposleni ["+super.toString()+"] : "+getSSS();
    }
}

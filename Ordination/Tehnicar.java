package rs.itbootcamp.ordinacija;

public class Tehnicar extends Zaposleni{
    private Doktor refDoktora;

    public Tehnicar(String naziv, String JMBG, int godinaRodjenja) {
        super(naziv, JMBG, godinaRodjenja);
    }

    public Doktor getRefDoktora() {
        return refDoktora;
    }

    public void setRefDoktora(Doktor refDoktora) {
        this.refDoktora = refDoktora;
    }
    //  Ispis: Tehnicar [Zaposleni] radi za `Doktor`

    @Override
    public String toString() {
        return "Tehnicar ["+super.toString()+"] radi za "+refDoktora; // Nedostaje: Proveriti da li je `refDoktora` `null`
    }
}

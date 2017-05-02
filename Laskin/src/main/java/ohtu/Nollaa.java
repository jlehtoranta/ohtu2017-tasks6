package ohtu;

import javax.swing.JTextField;

public class Nollaa implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;

    public Nollaa(Sovelluslogiikka s, JTextField tk, JTextField sk) {
        this.sovellus = s;
        this.syotekentta = sk;
        this.tuloskentta = tk;
    }

    @Override
    public void suorita() {
        this.sovellus.nollaa();
        this.syotekentta.setText("");
        this.tuloskentta.setText("");
    }

    @Override
    public void peru() {
        //TODO
        return;
    }
}

package ohtu;

import javax.swing.JTextField;

public class Erotus implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;

    public Erotus(Sovelluslogiikka s, JTextField tk, JTextField sk) {
        this.sovellus = s;
        this.syotekentta = sk;
        this.tuloskentta = tk;
    }

    @Override
    public void suorita() {
        int arvo = 0;

        try {
            arvo = Integer.parseInt(this.syotekentta.getText());
        } catch (Exception e) {
        }

        this.sovellus.miinus(arvo);
        this.syotekentta.setText("");
        this.tuloskentta.setText("" + this.sovellus.tulos());
    }

    @Override
    public void peru() {
        //TODO
        return;
    }
}

package ohtu;

import javax.swing.JTextField;

public class Summa implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;

    public Summa(Sovelluslogiikka s, JTextField tk, JTextField sk) {
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

        this.sovellus.plus(arvo);
        this.syotekentta.setText("");
        this.tuloskentta.setText("" + this.sovellus.tulos());
    }

    @Override
    public void peru() {
        // TODO
        return;
    }
}

package ohtu;

import javax.swing.JTextField;
import java.util.Stack;

public class Nollaa implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private Stack<Integer> tstack = new Stack<>();
    private Stack<String> skstack = new Stack<>();

    public Nollaa(Sovelluslogiikka s, JTextField tk, JTextField sk) {
        this.sovellus = s;
        this.syotekentta = sk;
        this.tuloskentta = tk;
    }

    @Override
    public void suorita() {
        this.skstack.push(this.syotekentta.getText());
        this.tstack.push(new Integer(this.sovellus.tulos()));
        this.sovellus.nollaa();
        this.syotekentta.setText("");
        this.tuloskentta.setText("");
    }

    @Override
    public void peru() {
        if (!this.skstack.empty() && !this.tstack.empty()) {
            this.syotekentta.setText(this.skstack.pop());
            this.sovellus.plus(this.tstack.pop().intValue());
            this.tuloskentta.setText("" + this.sovellus.tulos());
        }
    }
}

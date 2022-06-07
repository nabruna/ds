package gui;

import javax.swing.JToggleButton;

public class BtnCard extends JToggleButton {
    private int num;
    
    public BtnCard(int num) {
        this.num = num;
    }

    public void mostrarCard() {
        setSelected(true);
        setText(Integer.toString(num));
    }

    public void esconderCard() {
        setSelected(false);
        setText("");
    }

    public int getNum() {
        return num;
    }
}

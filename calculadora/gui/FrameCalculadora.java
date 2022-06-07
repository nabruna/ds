package gui;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameCalculadora extends JFrame {
    private JTextField txtX;
    private JTextField txtY;
    private JComboBox<String> operacao;
    private JButton btnCalcular;

    public FrameCalculadora() {
        setSize(new Dimension(300, 230));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(5, 2, 10, 10));
        setResizable(false);
        setTitle("Calculadora: X e Y");
        setLocationRelativeTo(null);

        add(new JLabel("Valor x:"));
        
        add(txtX = new JTextField(15));
        
        add(new JLabel("Valor y:"));
        add(txtY = new JTextField(15));
        
        String operacoes[] = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        add(operacao = new JComboBox<String>(operacoes));

        add(btnCalcular = new JButton("Calcular"));

        ActionCalculadora action = new ActionCalculadora(operacao, txtX, txtY);
        btnCalcular.addActionListener(action);
    }
}

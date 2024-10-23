import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private Bebida bebida;
    private JLabel descripcionLabel;
    private JLabel costoLabel;

    public MainFrame() {
        setTitle("Cafetería Decorador");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        bebida = new CafeBase();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        descripcionLabel = new JLabel("Descripción: " + bebida.getDescripcion());
        costoLabel = new JLabel("Costo: $" + bebida.getCosto());

        JButton lecheButton = new JButton("Agregar Leche");
        lecheButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bebida = new Leche(bebida);
                actualizarUI();
            }
        });

        JButton chocolateButton = new JButton("Agregar Chocolate");
        chocolateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bebida = new Chocolate(bebida);
                actualizarUI();
            }
        });

        JButton canelaButton = new JButton("Agregar Canela");
        canelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bebida = new Canela(bebida);
                actualizarUI();
            }
        });

        panel.add(descripcionLabel);
        panel.add(costoLabel);
        panel.add(lecheButton);
        panel.add(chocolateButton);
        panel.add(canelaButton);

        add(panel);
    }

    private void actualizarUI() {
        descripcionLabel.setText("Descripción: " + bebida.getDescripcion());
        costoLabel.setText("Costo: $" + bebida.getCosto());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}

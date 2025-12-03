package presentacion;

import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class LevelSelectGUI extends JFrame {

    private JButton btnLevel1;
    private JButton btnBack;
    private JLabel background;

    public LevelSelectGUI() {

        setTitle("Level Select");
        setSize(600, 650);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        prepareElements();
        prepareActions();

        setVisible(true);
    }

 
    private void prepareElements() {

        // Imagen de fondo
        File file = new File("recursos/5LevelSelectorGUI.png");
        ImageIcon bgIcon = new ImageIcon(file.getAbsolutePath());
        background = new JLabel(bgIcon);
        background.setBounds(0, 0, 600, 650);


        // BOTÓN DETRÁS DEL NÚMERO 1
        btnLevel1 = new JButton();
        btnLevel1.setBounds(145, 125, 60, 60);
        btnLevel1.setOpaque(false);
        btnLevel1.setContentAreaFilled(false);
        btnLevel1.setBorderPainted(false);

        // BOTÓN BACK
        btnBack = new JButton();
        btnBack.setBounds(200, 520, 200, 80);
        btnBack.setOpaque(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);

        add(btnLevel1);
        add(btnBack);
        add(background);
    }


    private void prepareActions() {

        
        
        btnLevel1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirLevel1();
            }
        });
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SelectColorGUI();
                dispose();
            }
        });
    }
   
    private void abrirLevel1() {
        new Level1GUI();
        dispose();
    }
}

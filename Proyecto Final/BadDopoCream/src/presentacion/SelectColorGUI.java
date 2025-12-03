package presentacion;

import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class SelectColorGUI extends JFrame {

    private JButton btnChocolate;
    private JButton btnVanilla;
    private JButton btnStrawberry;
    private JButton btnBack;
    private JLabel background;

    public SelectColorGUI() {

        setTitle("Choose Your Flavour");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        prepareElements();
        prepareActions();

        setVisible(true);
    }

  
    private void prepareElements() {

        // Imagen de fondo
        File file = new File("recursos/4oneplayerGUI.png");
        ImageIcon bgIcon = new ImageIcon(file.getAbsolutePath());
        background = new JLabel(bgIcon);
        background.setBounds(0, 0, 600, 500);

        // Botón CHOCOLATE (izquierda)
        btnChocolate = new JButton();
        btnChocolate.setBounds(120, 150, 100, 150);
        btnChocolate.setOpaque(false);
        btnChocolate.setContentAreaFilled(false);
        btnChocolate.setBorderPainted(false);

        // Botón VAINILLA (centro)
        btnVanilla = new JButton();
        btnVanilla.setBounds(250, 150, 100, 150);
        btnVanilla.setOpaque(false);
        btnVanilla.setContentAreaFilled(false);
        btnVanilla.setBorderPainted(false);

        // Botón FRESA (derecha)
        btnStrawberry = new JButton();
        btnStrawberry.setBounds(380, 150, 100, 150);
        btnStrawberry.setOpaque(false);
        btnStrawberry.setContentAreaFilled(false);
        btnStrawberry.setBorderPainted(false);

        // Botón BACK
        btnBack = new JButton();
        btnBack.setBounds(200, 380, 200, 60);
        btnBack.setOpaque(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);

        // Agregar componentes
        add(btnChocolate);
        add(btnVanilla);
        add(btnStrawberry);
        add(btnBack);
        add(background);
    }


    private void prepareActions() {

    	btnChocolate.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        new LevelSelectGUI();
    	        dispose();
    	    }
    	});

    	btnVanilla.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        new LevelSelectGUI();
    	        dispose();
    	    }
    	});

    	btnStrawberry.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        new LevelSelectGUI();
    	        dispose();
    	    }
    	});

        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PlayMenuGUI();
                dispose();
            }
        });
    }
}

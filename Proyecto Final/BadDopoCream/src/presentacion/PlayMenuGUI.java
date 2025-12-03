package presentacion;

import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class PlayMenuGUI extends JFrame {

    private JButton btnOnePlayer;
    private JButton btnTwoPlayers;
    private JButton btnBack;
    private JLabel background;

    public PlayMenuGUI() {

        setTitle("Play Menu");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        prepareElements();
        prepareActions();

        setVisible(true);
    }

    private void prepareElements() {

        // Cargar imagen de fondo
        File file = new File("recursos/3CantPlayerGUI.png");
        ImageIcon bgIcon = new ImageIcon(file.getAbsolutePath());
        background = new JLabel(bgIcon);
        background.setBounds(0, 0, 600, 500);

        // Botón invisible "1 Player"
        btnOnePlayer = new JButton();
        btnOnePlayer.setBounds(110, 200, 150, 150);
        btnOnePlayer.setOpaque(false);
        btnOnePlayer.setContentAreaFilled(false);
        btnOnePlayer.setBorderPainted(false);

        // Botón invisible "2 Players"
        btnTwoPlayers = new JButton();
        btnTwoPlayers.setBounds(330, 200, 150, 150);
        btnTwoPlayers.setOpaque(false);
        btnTwoPlayers.setContentAreaFilled(false);
        btnTwoPlayers.setBorderPainted(false);

        // Botón invisible "BACK"
        btnBack = new JButton();
        btnBack.setBounds(200, 390, 200, 60);
        btnBack.setOpaque(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);

        add(btnOnePlayer);
        add(btnTwoPlayers);
        add(btnBack);
        add(background);
    }

    private void prepareActions() {

    	btnOnePlayer.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        new SelectColorGUI();
    	        dispose();
    	    }
    	});

        btnTwoPlayers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "2 Players: En construcción");
            }
        });

        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BadDopoCreamGUI();
                dispose();
            }
        });
    }
}

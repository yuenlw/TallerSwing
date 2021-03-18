import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JLabel etiquetaImagen;

    JButton botonVenado;
    JButton botonKoala;

    JPanel panelImagen;
    JPanel panelBotones;

    ImageIcon iconVenado;
    ImageIcon iconKoala;

    public Ventana(){
        super("Animalitos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        agregarComponentes();

        this.pack();
        this.setVisible(true);
    }

    private void agregarComponentes(){
        iconVenado = new ImageIcon("images/venado.jpg");
        iconKoala = new ImageIcon("images/koala.jpg");
        
        etiquetaImagen = new JLabel(iconVenado);

        panelImagen = new JPanel(new BorderLayout());
        panelImagen.add(etiquetaImagen, BorderLayout.CENTER);
        
        this.add(panelImagen, BorderLayout.CENTER);

        botonVenado = new JButton("Venado");
        botonVenado.addActionListener(this);
        botonKoala = new JButton("Koala");
        botonKoala.addActionListener(this);

        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(10, 1));
        
        panelBotones.add(botonVenado);
        panelBotones.add(botonKoala);

        this.add(panelBotones, BorderLayout.LINE_END);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource().equals(botonVenado)){
            etiquetaImagen.setIcon(iconVenado);
        }
        if(e.getSource().equals(botonKoala)){
            etiquetaImagen.setIcon(iconKoala);
            this.setVisible(false);
        }
    }
}

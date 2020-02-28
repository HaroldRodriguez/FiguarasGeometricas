/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointerfaz;




import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Clase panel de opciones
 * @author Camila Urueña
 * @author Harold Gomez
 */
public class InterfazValores extends JPanel implements ActionListener{
    //  Boton para ingresar coordenada del triangulo
    private JButton btnPuntosTriangulo;
    //  Boton para ingresar lascoordenadas del cuadrado
    private JButton btnPuntosCuadrado;
   
    
    private InterfazFigura interfaz;
    
    /**
     * Constructor
     */
    public InterfazValores(InterfazFigura interfaz) { 
        this.interfaz = interfaz;
        setBackground(Color.WHITE);
        setBorder(new TitledBorder(                                             "ELIJA UNA OPCIÓN"));
        setLayout(new GridLayout(1, 3));
        
        btnPuntosTriangulo = new JButton("TRIANGULO");
        btnPuntosTriangulo.setActionCommand("TRIANGULO");
        btnPuntosTriangulo.addActionListener(this);
        add(btnPuntosTriangulo);
        
        btnPuntosCuadrado = new JButton("CUADRADO O RECTANGULO");
        btnPuntosCuadrado.setActionCommand("CUADRADO O RECTANGULO");
        btnPuntosCuadrado.addActionListener(this);
        add(btnPuntosCuadrado);
        
        
    }

    /**
     * Metodo que esta a la espera de un evento
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        RelacionCoordenadas relacionCoordenadas = new RelacionCoordenadas(interfaz);
        int tipo = 0;
        switch (e.getActionCommand()) {
            case "TRIANGULO":
                System.out.println("COORDENADAS TRIANGULO");
                tipo = 1;
                
                break;
            case "CUADRADO":
                System.out.println("COORDENADAS TRIANGULO O RECTANGULO");
                tipo = 2;
                
                break;
                       
        }
        relacionCoordenadas.setTipo(tipo);
    }


}

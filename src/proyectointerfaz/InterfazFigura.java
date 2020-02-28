/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointerfaz;

import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;

/*******************************************************************************
 * Clase Interfaz de las figuras
 * @author Camila Urueña
 * @author Harold Gomez
 */
public class InterfazFigura extends JFrame{
  
    
    private InterfazValores interfazValores;
    private Botones botones;
    private DibujoFigura dibujoFigura;
    
  
    public InterfazFigura() {
        
        configurarVentana();
        
        agregarPaneles();
    }

    /*
     * Metodo que confugura las propiedades de la ventana
     */
     public void configurarVentana(){
        setSize(450, 450);
        setLocationRelativeTo(null);
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
    }
    
    
    /*
     * Metodo que agrega los paneles a la ventana
     */
    public void agregarPaneles(){
        
        
        interfazValores = new InterfazValores(this);
        getContentPane().add(interfazValores, BorderLayout.SOUTH);
                
        botones = new Botones(this);
        getContentPane().add(botones, BorderLayout.WEST);

        dibujoFigura = new DibujoFigura ();
        getContentPane().add(dibujoFigura, BorderLayout.CENTER);
        
        setVisible(true);
    }

    /*
     * Metodo que obtiene el valor del panelTriangulo
     * @return panelTriangulo
     */
    public DibujoFigura getDibujoFigura() {
        return dibujoFigura;
    }

    /*
     * Metodo que cambia el valor del DibujoFigura
     * @param dibujoFigura 
     */
    public void setDibujoFigura(DibujoFigura dibujoFigura) {
        this.dibujoFigura = dibujoFigura;
    }

    /**
     * Obtener el valor del panel de botones
     * @return Botones
     */
    public Botones getBotones() {
        return botones;
    }

    /**
     * Cambiar el valor de botones
     * @param panelBotones 
     */
    public void setPanelBotones(Botones panelBotones) {
        this.botones = botones;
    }
    
}

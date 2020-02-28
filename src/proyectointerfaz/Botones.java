/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointerfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*******************************************************************************
 * 
 * @author Camila Urueña
 * @author Harold Gomez
 */
//Clase donde manejamos los botones
public class Botones extends JPanel implements ActionListener{
 
    //  Casillas donde se imprimen los resultados
    private JLabel casillaArea;
    private JLabel casillaPerimetro;
    private JLabel casillaAltura;
   
    //  Guarda Frame
    private InterfazFigura interfaz;
    
    /*
     * Constructor
     * @param interfaz 
     */
    public Botones(InterfazFigura interfaz) {
        //  Configuracion de panel
        this.interfaz = interfaz;
        setLayout(new GridLayout(5,1));
        setBackground(Color.WHITE);
        
      
        añadirCasilla();
    }
    
   
    
    /*
     * Metodo añade la casilla
     */
    public void añadirCasilla(){
        casillaArea = new JLabel("Area: ");
        add(casillaArea);
        
        casillaPerimetro = new JLabel("Perimetro: ");
        add(casillaPerimetro);

         casillaAltura = new JLabel("");
        add(casillaAltura);
    }
    
    /*
     * Metodo de acci´n del boton
     * @param a 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

    /*
     * Llama el valor de la casilla de area
     * @return 
     */
    public JLabel getCasillaArea() {
        return casillaArea;
    }

    /*
     * Modifica el valor de la casilla de area
     * @param casillaArea 
     */
    public void setCasillaArea(JLabel casillaArea) {
        this.casillaArea = casillaArea;
    }

    /*
     * Llama el valor de la casilla de perimetro
     * @return 
     */
    public JLabel getCasillaPerimetro() {
        return casillaPerimetro;
    }

    /*
     * Modifica el valor de la casilla de perimetro
     * @param casillaPerimetro 
     */
    public void setEtiquetaPerimetro(JLabel casillaPerimetro) {
        this.casillaPerimetro = casillaPerimetro;
    }

    /*
     * LLama el valor de la casilla de dato 
     * @return 
     */
    public JLabel getCasillaAltura() {
        return casillaAltura;
    }

    /*
     * Modifica el valor de la casilla de dato 
     * @param casillaAltura 
     */
    public void setCasillaAltura(JLabel casillaAltura) {
        this.casillaAltura = casillaAltura;
    }
    
    
}

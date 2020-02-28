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
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import figurasgeometricasherencia.*;

/***************************************************************************
 * Clase DialogoPuntos
 * @author Camila Urueña
 * @author Harold Gomez
 */
public class RelacionCoordenadas extends JDialog implements ActionListener{
    //  Boton Aceptar que envia los valores de los puntos
    private JButton btnAceptar;
    //  Cuadro de texto para Puntos(x1,y1)(x2,y2)(x3,y3)(x4,y4)
    private JTextField campoX1;
    private JTextField campoY1;
    private JTextField campoX2;
    private JTextField campoY2;
    private JTextField campoX3;
    private JTextField campoY3;
    private JTextField campoX4;
    private JTextField campoY4;
    //  Casillas que imprime el Puntos 1, 2, 3 y 4
    private JLabel Punto1 = new JLabel("Punto1");
    private JLabel Punto2 = new JLabel("Punto2");
    private JLabel Punto3 = new JLabel("Punto3");
    private JLabel Punto4 = new JLabel("Punto4");
    //  Mensajes de error
    private JLabel txtError1 = new JLabel("               Estos puntos no son");
    private JLabel txtError2 = new JLabel("validos");
    // Guarda las coordenadas
    private String campo1X;
    private String campo1Y;
    private String campo2X;
    private String campo2Y;
    private String campo3X;
    private String campo3Y;
    private String campo4X;
    private String campo4Y;
    private int tipo;
    private InterfazFigura interfaz;
    
    /*
     * Constructor
     * @param interfaz 
     */
    public RelacionCoordenadas(InterfazFigura interfaz) {
        
        this.interfaz = interfaz;
        setBackground(Color.WHITE);
        setTitle("Ingrese sus coordenadas");
        setBounds(40, 120, 300, 180);
        
        setLayout(new GridLayout(3, 3));
        crearCuadrosTexto();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    
    /*
     * Metodo que crea los cuadros de textos
     */
    public void crearCuadrosTexto() {
        add(Punto1);
        campoX1 = new JTextField(5);
        add(campoX1);
        campoY1 = new JTextField(5);
        add(campoY1);

        add(Punto2);
        campoX2 = new JTextField(5);
        add(campoX2);
        campoY2 = new JTextField(5);
        add(campoY2);
        
        campoX3 = new JTextField(5);
        campoY3 = new JTextField(5);
        campoX4 = new JTextField(5);
        campoY4 = new JTextField(5);
    }
    
    /***************************************************************************
     * Metodo que agrega los cuadros de textos
     */
    public void recibeTipo(){
        System.out.println(tipo);
        if((tipo == 1) || (tipo == 2)) {
            setLayout(new GridLayout(4, 3));
            add(Punto3);
            add(campoX3);
            add(campoY3);
        }
        if(tipo == 2) {
            setLayout(new GridLayout(5, 3));
            add(Punto4);
            add(campoX4);
            add(campoY4);
        }
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setActionCommand("Aceptar");
        btnAceptar.addActionListener(this);
        add(btnAceptar);
    }
    
    /*
     * Metodo que esta a la espera por si se presiona un boton y cambia el valor
     * del color general
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "Aceptar") {
            campo1X = campoX1.getText();
            campo1Y = campoY1.getText();
            campo2X = campoX2.getText();
            campo2Y = campoY2.getText();
            campo3X = campoX3.getText();
            campo3Y = campoY3.getText();
            campo4X = campoX4.getText();
            campo4Y = campoY4.getText();
        }
        if(tipo == 1){
            
            iniciarTriangulo();
        }
        else if(tipo == 2){
            iniciarCuadrado();
        }
        else{
           
        }
    }
    
    /***************************************************************************
     * Metodo que envia los valores de triangulo a Triangulo
     */
    public void iniciarTriangulo(){
        double x = Double.parseDouble(campo1X);
        double y = Double.parseDouble(campo1Y);
        Punto punto1 = new Punto(x, y);
        x = Double.parseDouble(campo2X);
        y = Double.parseDouble(campo2Y);
        Punto punto2 = new Punto(x, y);
        x = Double.parseDouble(campo3X);
        y = Double.parseDouble(campo3Y);
        Punto punto3 = new Punto(x, y);
        Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
        boolean validar = triangulo.validarPuntos();
        if(validar != false){
            interfaz.getDibujoFigura().setPunto1(punto1);
            interfaz.getDibujoFigura().setPunto2(punto2);
            interfaz.getDibujoFigura().setPunto3(punto3);
            interfaz.getDibujoFigura().setTipoFigura((short)1);
            interfaz.getBotones().getCasillaArea().setText("AREA: " + triangulo.getArea());
            interfaz.getBotones().getCasillaPerimetro().setText("PERIMETRO: " + triangulo.getPerimetro());
            interfaz.getBotones().getCasillaAltura().setText("TIPO TRIANGULO: "+triangulo.tipoTriangulo());
            interfaz.getDibujoFigura().repaint();
        }
        else{
            add(txtError1);
            add(txtError2);
            setVisible(true);
        }
    }
    
    /*
     * Metodo que envia los valores de cuadrado a Cuadrado
     */
    public void iniciarCuadrado(){
        double x = Double.parseDouble(campo1X);
        double y = Double.parseDouble(campo1Y);
        Punto punto1 = new Punto(x, y);
        x = Double.parseDouble(campo2X);
        y = Double.parseDouble(campo2Y);
        Punto punto2 = new Punto(x, y);
        x = Double.parseDouble(campo3X);
        y = Double.parseDouble(campo3Y);
        Punto punto3 = new Punto(x, y);
        x = Double.parseDouble(campo4X);
        y = Double.parseDouble(campo4Y);
        Punto punto4 = new Punto(x, y);
        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3, punto4);
        boolean validar = cuadrado.validarPuntos();
        if(validar != false){
            interfaz.getDibujoFigura().setPunto1(punto1);
            interfaz.getDibujoFigura().setPunto2(punto2);
            interfaz.getDibujoFigura().setPunto3(punto3);
            interfaz.getDibujoFigura().setPunto4(punto4);
            interfaz.getDibujoFigura().setTipoFigura((short)2);
            interfaz.getDibujoFigura().repaint();
            interfaz.getBotones().getCasillaArea().setText("Area: " + cuadrado.getArea());
            System.out.println(cuadrado.getArea());
            interfaz.getBotones().getCasillaPerimetro().setText("Perimetro: " + cuadrado.getPerimetro());
            interfaz.getBotones().getCasillaAltura().setText("Tipo: " + cuadrado.tipo());
        }
        else{
            add(txtError1);
            add(txtError2);
            setVisible(true);
        }
    }
    
 
    /*
     * Metodo que obtiene el valor de punto1x
     * @return campo1X
     */
    public String getCampo1X() {
        return campo1X;
    }

    /*
     * Metodo que modifica el valor de punto1x
     * @param campo1X 
     */
    public void setCampo1X(String campo1X) {
        this.campo1X = campo1X;
    }
    
    /*
     * Metodo que obtiene el valor de punto1y
     * @return campo1Y
     */
    public String getCampo1Y() {
        return campo1Y;
    }

    /*
     * Metodo que modifica el valor de punto1y
     * @param campo1Y 
     */
    public void setCampo1Y(String campo1Y) {
        this.campo1Y = campo1Y;
    }

    /*
     * Metodo que obtiene el valor de punto2x
     * @return campo2X
     */
    public String getCampo2X() {
        return campo2X;
    }

    /*
     * Metodo que modifica el valor de punto2x
     * @param campo2X 
     */
    public void setCampo2X(String campo2X) {
        this.campo2X = campo2X;
    }
    
    /*
     * Metodo que obtiene el valor de punto2y
     * @return campo2Y
     */
    public String getCampo2Y() {
        return campo2Y;
    }
    
    /*
     * Metodo que modifica el valor de punto2y
     * @param campo2Y 
     */
    public void setCampo2Y(String campo2Y) {
        this.campo2Y = campo2Y;
    }
    
    /*
     * Metodo que obtiene el valor de punto3x
     * @return campo3X
     */
    public String getCampo3X() {
        return campo3X;
    }
    /*
     * Metodo que modifica el valor de punto3x
     * @param campo3X 
     */
    public void setCampo3X(String campo3X) {
        this.campo3X = campo3X;
    }

    /***************************************************************************
     * Metodo que obtiene el valor de punto3y
     * @return campo3Y
     */
    public String getCampo3Y() {
        return campo3Y;
    }

    /*
     * Metodo que modifica el valor de punto3y
     * @param campo3Y 
     */
    public void setCampo3Y(String campo3Y) {
        this.campo3Y = campo3Y;
    }

    /*
     * Metodo que obtiene el valor de punto4x
     * @return campo4X
     */
    public String getCampo4X() {
        return campo4X;
    }

    /*
     * Metodo que modifica el valor de punto4x
     * @param campo4X 
     */
    public void setCampo4X(String campo4X) {
        this.campo4X = campo4X;
    }

    /*
     * Metodo que obtiene el valor de punto4y
     * @return campo4Y
     */
    public String getCampo4Y() {
        return campo4Y;
    }

    /*
     * Metodo que modifica el valor de punto4y
     * @param campo4Y 
     */
    public void setCampo4Y(String campo4Y) {
        this.campo4Y = campo4Y;
    }

    /*
     * Metodo que obtiene el valor de tipo
     * @return tipo
     */
    public int getTipo() {
        return tipo;
    }

    /*
     * Metodo que modifica el valor de tipo
     * @param tipo 
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
        recibeTipo();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricasherencia;

/**
 *
 * @author angyc
 */
public class Punto {
      private double x;
      private double y;
       /**
     * Constructor de la clase que inicializa las variables
     * @param x
     * @param y 
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Retorna el valor de x de la cordenada
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * Modifica cordenada x
     * @param x 
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Retorna el valor de y de la cordenada
     * @return y
     */    
    public double getY() {
        return y;
    }

    /**
     * Modifica cordenada y
     * @param y
     */    
    public void setY(double y) {
        this.y = y;
    }
}
